package com.base.BaseApplication

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan(basePackages = 'com.base')
class BaseApplication1 {

	static void main(String[] args) {
		SpringApplication.run BaseApplication1, args
	}
}
