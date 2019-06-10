package com.qwerty.springcloudzuul.config;

import com.qwerty.springcloudzuul.filter.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/*
* 优先级是优先看type，顺序是 pre,route,post
* type相同时，再根据order执行（order越小，越早执行）
* */
@Configuration
public class ZuulFilterRegistry {
//    @Bean
    public PreFilter1 preFilter1() {
        return new PreFilter1();
    }

//    @Bean
    public PreFilter2 preFilter2() {
        return new PreFilter2();
    }

//    @Bean
    public RouteFilter1 routeFilter1() {
        return new RouteFilter1();
    }

//    @Bean
    public RouteFilter2 routeFilter2() {
        return new RouteFilter2();
    }

//    @Bean
    public TokenFilter tokenFilter() {
        return new TokenFilter();
    }

//    @Bean
    public ErrorFilter errorFilter() {
        return new ErrorFilter();
    }
}
