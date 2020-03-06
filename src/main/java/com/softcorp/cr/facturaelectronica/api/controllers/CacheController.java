package com.softcorp.cr.facturaelectronica.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/cache")
public class CacheController extends BaseController {
    @Autowired
    private CacheManager cacheManager;

    @RequestMapping(value = "/purge", method = RequestMethod.POST, headers = "Accept=application/json")
    public ResponseEntity<String> purge() {
        if (null != cacheManager) {
            cacheManager.getCacheNames().parallelStream().forEach(name -> cacheManager.getCache(name).clear());
        } else {
            return new ResponseEntity<String>("Cache Manager Null", HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return ResponseEntity.ok("Cache purged successfully");
    }
}
