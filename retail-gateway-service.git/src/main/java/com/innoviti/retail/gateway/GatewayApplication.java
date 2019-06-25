package com.innoviti.retail.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@EnableDiscoveryClient
@SpringBootApplication
public class GatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
    }

    /*@Bean
    public GatewayPreFilter gatewayFilter() {
        return new GatewayPreFilter();
    }

    @Bean
    public GatewayPostFilter postFilter() {
        return new GatewayPostFilter();
    }

    @Bean
    public GatewayErrorFilter errorFilter() {
        return new GatewayErrorFilter();
    }

    @Bean
    public GatewayRouteFilter routeFilter() {
        return new GatewayRouteFilter();
    }*/
}
