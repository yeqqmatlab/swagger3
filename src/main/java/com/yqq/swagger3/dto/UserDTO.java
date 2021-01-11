package com.yqq.swagger3.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * TODO
 * Created by yqq on 2021/01/11
 */
@ApiModel
public class UserDTO {

    @ApiModelProperty("名字")
    private String name;

    @ApiModelProperty("年龄")
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
