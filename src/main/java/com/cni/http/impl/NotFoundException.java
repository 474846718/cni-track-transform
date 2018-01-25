package com.cni.http.impl;

/**
 * 单号没有找到
 * <p>
 * Created by CNI on 2018/1/25.
 */
public class NotFoundException extends Exception {

    public NotFoundException() {
    }

    public NotFoundException(String message) {
        super(message);
    }

    public NotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotFoundException(Throwable cause) {
        super(cause);
    }

}
