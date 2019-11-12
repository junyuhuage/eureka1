package com.offcn.pojo;

import lombok.ToString;

import java.io.Serializable;

@ToString
public class User implements Serializable {

    private Integer id;

    private String name;

    private String sex;

    private Integer age;
}
