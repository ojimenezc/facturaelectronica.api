

package com.softcorp.cr.facturaelectronica.api.interceptors;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.softcorp.cr.facturaelectronica.api.dtos.EventInfoDTO;
import com.softcorp.cr.facturaelectronica.api.entities.AuditEntity;
import com.softcorp.cr.facturaelectronica.api.repositories.AuditRepository;
import com.softcorp.cr.facturaelectronica.api.services.implementations.LoggerService;
import liquibase.pro.packaged.E;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.time.Instant;
import java.util.Date;

@Component
public class AuditInterceptor extends HandlerInterceptorAdapter {

    @Autowired
    AuditRepository auditRepository;

    @Autowired
    LoggerService loggerService;

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception exception)
            throws Exception {
        try {
            Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
            String ip = getClienIP(request);
            EventInfoDTO infoDTO = new EventInfoDTO();

            infoDTO.setClientId(null != authentication.getPrincipal() ? authentication.getPrincipal().toString() : authentication.getName());
            infoDTO.setClientIP(ip);
            infoDTO.setRequestEndpoint(request.getRequestURI());
            infoDTO.setRequestMethod(request.getMethod());

            AuditEntity entity = new AuditEntity();

            entity.setAfterModificationValue("N/A");
            entity.setBeforeModificationValue("N/A");
            entity.setEventDate(Instant.now());
            entity.setEventType(request.getMethod());
            entity.setTableModified("N/A");
            entity.setInfo(new ObjectMapper().writeValueAsString(infoDTO));
            auditRepository.save(entity);
        } catch (Exception e) {
            loggerService.error(e);
        }
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView)
            throws Exception {

    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        return true;
    }

    private String getClienIP(HttpServletRequest request) {
        try {
            if (null != request.getHeader("X-Real-IP")) {
                return request.getHeader("X-Real-IP");
            } else {
                return request.getRemoteAddr();
            }
        } catch (Exception e) {
            loggerService.error(e);
            return "0.0.0.0";
        }
    }
}