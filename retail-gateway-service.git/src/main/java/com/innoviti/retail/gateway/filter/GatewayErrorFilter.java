/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.innoviti.retail.gateway.filter;

import com.netflix.zuul.ZuulFilter;

/**
 *
 * @author pradeep.choube
 */
public class GatewayErrorFilter extends ZuulFilter {

    @Override
    public String filterType() {
        return "error";
    }

    @Override
    public int filterOrder() {
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        System.out.println("Route Filter will be applied here !!!");

        return null;
    }

}
