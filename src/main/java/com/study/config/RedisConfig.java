package com.study.config;

import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;

/**
 * Created by yangqj on 2017/4/30.
 */
@Configuration
@EnableCaching
public class RedisConfig extends CachingConfigurerSupport {
}
