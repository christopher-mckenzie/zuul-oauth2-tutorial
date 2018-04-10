package com.base.controller

import groovy.util.logging.Slf4j
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@Slf4j
class SampleController {

    @RequestMapping('/test')
    String hello(){
        log.info 'hello from app 1'
        return "Hello from app 1"
    }
}
