package com.topscore.marketing.gateway;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

import static org.springframework.boot.WebApplicationType.SERVLET;

@EnableZuulProxy
@SpringBootApplication
public class GatewayApplication {

	public static void main(String[] args) {
//		SpringApplication.run(GatewayApplication.class, args);
		new SpringApplicationBuilder(GatewayApplication.class).web(SERVLET).run(args);
	}
}
