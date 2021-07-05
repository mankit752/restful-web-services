package com.learning.rest.webservices.restfulwebservices.exception;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class ExceptionResponse {
    private Date timeStamp;
    private String message;
    private String details;

}
