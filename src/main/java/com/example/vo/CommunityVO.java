package com.example.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author:
 * @DATE: 2022/8/22 14:39
 */
@Data
public class CommunityVO {

    @ApiModelProperty("主键ID")
    private String id;

    @ApiModelProperty("小区名称")
    private String communityName;

    @ApiModelProperty("小区地址")
    private String communityAddress;

    @ApiModelProperty("总人数")
    private String userCount;

    @ApiModelProperty("男性人数")
    private Integer maleCount;

    @ApiModelProperty("女性人数")
    private Integer girlCount;

    @ApiModelProperty("平均年龄")
    private String ageAvg;
}
