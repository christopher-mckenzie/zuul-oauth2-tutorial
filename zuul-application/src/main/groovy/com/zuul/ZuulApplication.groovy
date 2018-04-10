package com.zuul.ZuulApplication

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.config.server.EnableConfigServer
import org.springframework.cloud.netflix.zuul.EnableZuulProxy
import org.springframework.context.annotation.ComponentScan

@EnableZuulProxy
@SpringBootApplication
@ComponentScan(basePackages = 'com.zuul')
class ZuulApplication {

	static void main(String[] args) {
		SpringApplication.run ZuulApplication, args
	}
}
