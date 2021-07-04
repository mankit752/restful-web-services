package com.learning.rest.webservices.restfulwebservices.hello_world;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class HelloWorldBean {

    @Setter
    @Getter
    private String message;

    public HelloWorldBean(String message) {
        this.message = message;
    }
}
