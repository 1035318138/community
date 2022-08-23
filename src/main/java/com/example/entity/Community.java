package com.example.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

/**
 * @author ：mac
 * @Date ：2022/8/22 09:57
 */
@Builder
@Data
@ApiModel(value = "小区")
public class Community extends BaseEntity{


    @ApiModelProperty("小区名称")
    private String communityName;

    @ApiModelProperty("小区地址")
    private String communityAddress;

    @ApiModelProperty("男生人数")
    private Integer sexManNum;

    @ApiModelProperty("女生人数")
    private Integer sexMenNum;

    @ApiModelProperty("男生人数")
    private Double ageAvg;

    @ApiModelProperty("男生人数")
    private Integer maxAge;



}
