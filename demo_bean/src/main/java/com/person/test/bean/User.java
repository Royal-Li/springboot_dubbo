package com.person.test.bean;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {

    private static final long serialVersionUID = -7212896815581590536L;
    private Long Id;
    private String name;
    private String mail;
}
