package com.base.BaseApplication

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan(basePackages = 'com.base')
class BaseApplication2 {

	static void main(String[] args) {
		SpringApplication.run BaseApplication2, args
	}
}
