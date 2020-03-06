/*
 * Copyright (c) 2019.  SOFTCORP-CR S.A. All Rights Reserved. Any partial or total reproduction of this file without authorization from the owner is prohibited.
 */

package com.softcorp.cr.facturaelectronica.api.factories;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Factory  {

    private static Logger log = LoggerFactory.getLogger(Factory.class);


    /* Dir Config File*/
    private static final String FILE_CONFIG = "beans.xml";
    private static final String FILE_CONFIG_MOCK = "beans_mock.xml";
    private static final String INJECTION_SERVICES_ER = "Error Injection Service";
    /* Context */
    private static BeanFactory context;


    /* Init context */
    private static void init() {
        String profile = System.getProperty("spring.profiles.active");
        if (null != profile && profile.equals("testing"))
            context = new ClassPathXmlApplicationContext(FILE_CONFIG_MOCK);
        else
            context = new ClassPathXmlApplicationContext(FILE_CONFIG);
    }

    /**
     * @param serviceKey   Service
     * @param serviceClass Service Class
     * @param <T>          Class
     * @return
     */

    public static <T extends Object> T getBean(String serviceKey, Class<T> serviceClass) {
        T service = null;
        try {
            if (null == context) {
                init();
            }
            service = serviceClass.cast(context.getBean(serviceKey));
        } catch (BeansException be) {
            log.error(INJECTION_SERVICES_ER, be);
        }
        return service;
    }
}
