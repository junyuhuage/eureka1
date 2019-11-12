package com.offcn.pojo;
import java.io.Serializable;
import	java.security.Identity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class User implements Serializable {

    @Id
    @KeySql(useGeneratedKeys = true)
    private Integer id;

    private String name;

    private String sex;

    private Integer age;
}
