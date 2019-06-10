package com.qwerty.springcloudzuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.apache.commons.lang.StringUtils;

import javax.servlet.http.HttpServletRequest;

public class TokenFilter extends ZuulFilter{
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext requestContext=RequestContext.getCurrentContext();
        HttpServletRequest request=requestContext.getRequest();
        String token=request.getParameter("token");
        if(StringUtils.isNotBlank(token)){
            //为true才继续路由
            requestContext.setSendZuulResponse(true);
            requestContext.setResponseStatusCode(200);
            //只要写了这句，不管设置了啥，都不再执行了，请求就结束了
            //requestContext.setResponseBody("token is not empty");
            requestContext.set("isSuccess",true);
            return null;
        }else{
            requestContext.setSendZuulResponse(false);
            requestContext.setResponseStatusCode(400);
            requestContext.setResponseBody("token is empty");
            requestContext.set("isSuccess",false);
            return null;
        }
    }
}
