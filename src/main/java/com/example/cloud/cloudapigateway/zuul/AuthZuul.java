package com.example.cloud.cloudapigateway.zuul;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;

/**
 * @Description:
 * @Author: bhh
 * @Mail: sunjin@sudiyi.cn
 * @Date: 2020/5/28
 */
public class AuthZuul extends ZuulFilter {

    @Override
    public String filterType() {
        return "pro";
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
        System.out.println("zuul 校验");
        return "zuul";
    }
}
