package org.mc.gateway.configuration;


import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayLoggingConfig {

    @Bean
    public GlobalFilter customLogFilter() {
        return (exchange, chain) -> {
            System.out.println("Request path: " + exchange.getRequest().getPath());
            return chain.filter(exchange);
        };
    }
}