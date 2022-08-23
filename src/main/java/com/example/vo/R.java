package com.example.vo;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class R<T> {

    /**
     * 消息
     */
    private String message;

    /**
     * 数据
     */
    private T data;

    /**
     * code  0成功 1失败
     */
    private Integer code;

    private R() {

    }

    public static <T> R<T> ok(String message) {
        return new R<T>()
                .setCode(0)
                .setData(null)
                .setMessage(message);
    }

    public static <T> R<T> ok() {
        return new R<T>()
                .setCode(0)
                .setData(null)
                .setMessage("SUCCESS");
    }

    public static <T> R<T> ok(T data) {
        return new R<T>()
                .setCode(0)
                .setData(data)
                .setMessage("SUCCESS");
    }

    public static <T> R<T> ok(String message, T data) {
        return new R<T>()
                .setCode(0)
                .setData(data)
                .setMessage(message);
    }

    public static <T> R<T> fail(String message, T data) {
        return new R<T>()
                .setCode(1)
                .setData(data)
                .setMessage(message);
    }

    public static <T> R<T> fail(String message) {
        return new R<T>()
                .setCode(1)
                .setData(null)
                .setMessage(message);
    }

    public static <T> R<T> fail() {
        return new R<T>()
                .setCode(1)
                .setData(null)
                .setMessage("FAIL");
    }

    public static <T> R<T> fail(T data) {
        return new R<T>()
                .setCode(1)
                .setMessage("FAIL")
                .setData(data);
    }

}
