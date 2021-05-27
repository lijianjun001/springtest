package com.antelope.demo3.controller;

import com.antelope.demo3.service.TestServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/test")
@RestController
public class TestController {

    final TestServiceImpl testServiceImpl;

    public TestController(TestServiceImpl testServiceImpl) {
        this.testServiceImpl = testServiceImpl;
    }

    @RequestMapping("/aaa")
    public String getName() {
        return testServiceImpl.getName();
    }

    @RequestMapping("/aaa2")
    public String getName2() {
        return testServiceImpl.getName2();
    }

    @RequestMapping("/aaa3")
    public String getName3() {
        return testServiceImpl.getName3();
    }

}

