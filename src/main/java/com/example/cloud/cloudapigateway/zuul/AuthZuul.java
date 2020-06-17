package com.example.cloud.cloudapigateway.zuul;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.PRE_TYPE;

/**
 * @Description:
 * @Author: bhh
 * @Mail: sunjin@sudiyi.cn
 * @Date: 2020/5/28
 */
@Component
public class AuthZuul extends ZuulFilter {

    @Override
    public String filterType() {
        return PRE_TYPE;
    }

    @Override
    public int filterOrder() {
        return 1000;
    }

    @Override
    public boolean shouldFilter() {
        System.out.println("zuulshouldFilter 校验");
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        System.out.println("zuul 校验");
        doSimeSing();
        return "zuul";
    }

    private void doSimeSing() {
        throw new RuntimeException("zuul run exeception....");
    }
}
