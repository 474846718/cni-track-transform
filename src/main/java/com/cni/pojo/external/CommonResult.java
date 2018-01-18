package com.cni.pojo.external;

/**
 * 示例：
 * {
 * "code": "11006",
 * "message": "token不能为空",
 * "info": null,
 * "success": false
 * }
 * <p>
 * Created by CNI on 2018/1/9.
 * <p>
 * Author: 胡飞飞
 */
public class CommonResult<T> {


    /**
     * code : 11006
     * message : token不能为空
     * info : null
     * success : false
     */

    private String code;
    private String message;
    private T info;
    private boolean success;

    public CommonResult() {
    }

    private CommonResult(String code, String message, T info, boolean success) {
        this.code = code;
        this.message = message;
        this.info = info;
        this.success = success;
    }

    public static CommonResult build(String code, String message, Object info, boolean success) {
        return new CommonResult(code, message, info, success);
    }

    public static CommonResult success() {
        return new CommonResult("200", "ok", null, true);
    }

    public static CommonResult success(String msg) {
        return new CommonResult("200", msg, null, true);
    }

    public static CommonResult success(String msg, Object info) {
        return new CommonResult("200", msg, info, true);
    }

    public static CommonResult error(String code, String msg) {
        return new CommonResult(code, msg, null, false);
    }

    public static <T> CommonResult error(String code, String msg, T info) {
        return new CommonResult(code, msg, info, false);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    @Override
    public String toString() {
        return "CommonResult{" +
                "code='" + code + '\'' +
                ", message='" + message + '\'' +
                ", info=" + info +
                ", success=" + success +
                '}';
    }
}
