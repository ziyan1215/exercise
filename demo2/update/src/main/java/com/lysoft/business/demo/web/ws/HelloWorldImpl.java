package com.lysoft.business.demo.web.ws;

import javax.jws.WebService;

@WebService
public class HelloWorldImpl implements HelloWorld {

    public String sayHi(String text) {
        System.out.println("sayHi called");
        return "Hello " + text;
    }
}
