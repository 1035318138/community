package com.example.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotBlank;

/**
 * @author ：mac
 * @Date ：2022/8/22 23:52
 */

@Data
@NoArgsConstructor
public class PageInfo<T> {

    @ApiModelProperty("分页条数")
    private Integer size;

    @ApiModelProperty("当前页")
    private Integer current;

    private T data;
}
