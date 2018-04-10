package com.zuul.controller

import groovy.util.logging.Slf4j
import org.springframework.beans.factory.annotation.Value
import org.springframework.cloud.context.config.annotation.RefreshScope
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@Slf4j
@RefreshScope
@RestController
class TestController {

    @Value('${test.test}')
    String value

    @RequestMapping('/testAbc')
    String get(){
        log.info "logging value: $value"
        return "value $value"
    }
}
