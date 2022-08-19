package com.matrix.springcloud.config;


import java.time.ZonedDateTime;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder.Builder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * https://docs.spring.io/spring-cloud-gateway/docs/current/reference/html/#gateway-request-predicates-factories
 */
@Configuration
public class GateWayConfig {
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder) {
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        routes.route("path_route_atguigu", r -> r.path("/guoji").uri("http://news.baidu.com/guonei"))
                .build();
        
        
        Builder route = routes.route("path_route_atguigu", r -> r.after(ZonedDateTime.now()).uri("http://news.baidu.com/guonei"));
        
        return routes.build();
    }
    
    
//    public static void main(String[] args) {
//		ZonedDateTime zbj = ZonedDateTime.now();
//		System.out.println(zbj);		// 2022-08-04T17:06:42.686+08:00[Asia/Shanghai]
//	}
    
}

