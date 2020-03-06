

package com.softcorp.cr.facturaelectronica.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCache;
import org.springframework.cache.support.SimpleCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@EnableCaching
@EnableScheduling
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

    }

    @Bean
    public CacheManager cacheManager() {
        SimpleCacheManager cacheManager = new SimpleCacheManager();
        List<Cache> caches = new ArrayList<Cache>();
        caches.add(new ConcurrentMapCache("activities"));
        caches.add(new ConcurrentMapCache("provinces"));
        caches.add(new ConcurrentMapCache("counties"));
        caches.add(new ConcurrentMapCache("districts"));
        caches.add(new ConcurrentMapCache("rates"));
        caches.add(new ConcurrentMapCache("identificationTypes"));
        caches.add(new ConcurrentMapCache("unitMeasure"));
        caches.add(new ConcurrentMapCache("taxes"));
        cacheManager.setCaches(caches);
        return cacheManager;
    }
}
