package com.learning.rest.webservices.restfulwebservices.user;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class User {

    private Integer id;
    private String name;
    private Date birthDate;
}
