package com.base.controller

import groovy.util.logging.Slf4j
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@Slf4j
class SampleController {

    @RequestMapping('/hello')
    String hello(@RequestParam('value') String value){
        log.info "value passed: $value"
        return "Hello $value"
    }
}
