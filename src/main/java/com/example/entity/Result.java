package com.example.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Result {
    private String mes;

    private boolean success;

    private Object data;

}
