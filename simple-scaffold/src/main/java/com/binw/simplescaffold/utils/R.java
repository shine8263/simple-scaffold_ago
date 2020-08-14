package com.binw.simplescaffold.utils;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * 响应信息主体
 * 参照mybatis-plus R类
 * @param <T>
 * @author
 */
@ApiModel(description = "响应信息主体")
public class R<T> implements Serializable {

    @ApiModelProperty(value = "返回标记：成功标记=1，失败标记=0")
    private int code;

    @ApiModelProperty(value = "返回信息")
    private String msg;


    @ApiModelProperty(value = "数据")
    private T data;


    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public T getData() {
        return data;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Boolean isOk() {
        if(code!= 1){
            return false;
        }else{
            return true;
        }
    }

    public static <T> R<T> ok() {
        return restResult(null, 1, null);
    }

    public static <T> R<T> ok(T data) {
        return restResult(data, 1, null);
    }

    public static <T> R<T> ok(T data, String msg) {
        return restResult(data, 1, msg);
    }

    public static <T> R<T> failed() {
        return restResult(null, 0, null);
    }

    public static <T> R<T> failed(String msg) {
        return restResult(null, 0, msg);
    }

    public static <T> R<T> failed(T data) {
        return restResult(data, 0, null);
    }

    public static <T> R<T> failed(T data, String msg) {
        return restResult(data, 0, msg);
    }

    public static <T> R<T> failed(T data, int code, String msg) {
        return restResult(data, code, msg);
    }

    public static <T> R<T> failed(int code, String msg) {
        return restResult(null, code, msg);
    }

    private static <T> R<T> restResult(T data, int code, String msg) {
        R<T> apiResult = new R<>();
        apiResult.setCode(code);
        apiResult.setData(data);
        apiResult.setMsg(msg);
        return apiResult;
    }
}