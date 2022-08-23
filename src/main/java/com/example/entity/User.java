package com.example.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author ：mac
 * @Date ：2022/8/22 09:57
 */

@Data
@ApiModel( value = "用户",description = "111")
public class User {

    @ApiModelProperty("姓名")
    private String name;

    @ApiModelProperty("性别")
    private String sex;

    @ApiModelProperty("年龄")
    private Integer age;

    @ApiModelProperty("所在小区")
    private Integer communityId;

}
