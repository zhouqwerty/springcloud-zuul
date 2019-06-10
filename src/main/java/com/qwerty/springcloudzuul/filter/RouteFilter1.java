package com.qwerty.springcloudzuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;

public class RouteFilter1 extends ZuulFilter{
    @Override
    public String filterType() {
        return "route";
    }

    @Override
    public int filterOrder() {
        return 5;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        boolean e=true;
        if(e){
            throw new RuntimeException();
        }
        System.out.println("this is route 1");
        return null;
    }
}
