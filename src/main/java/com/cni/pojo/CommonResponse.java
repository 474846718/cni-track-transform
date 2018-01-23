package com.cni.pojo;

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
public class CommonResponse {


    /**
     * code : 11006
     * message : token不能为空
     * info : null
     * success : false
     */

    private String code;
    private String message;
    private Object info;
    private boolean success;

    public CommonResponse() {
    }

    private CommonResponse(String code, String message, Object info, boolean success) {
        this.code = code;
        this.message = message;
        this.info = info;
        this.success = success;
    }

    public static CommonResponse build(String code, String message, Object info, boolean success) {
        return new CommonResponse(code, message, info, success);
    }

    public static CommonResponse success() {
        return new CommonResponse("200", "ok", null, true);
    }

    public static CommonResponse success(String msg) {
        return new CommonResponse("200", msg, null, true);
    }

    public static CommonResponse success(String msg, Object info) {
        return new CommonResponse("200", msg, info, true);
    }

    public static CommonResponse error(String code, String msg) {
        return new CommonResponse(code, msg, null, false);
    }

    public static CommonResponse error(String code, String msg, Object info) {
        return new CommonResponse(code, msg, info, false);
    }

    public static CommonResponse error(String msg, Throwable e) {
        return new CommonResponse("500", msg, e.getMessage(), false);
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

    public Object getInfo() {
        return info;
    }

    public void setInfo(Object info) {
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
