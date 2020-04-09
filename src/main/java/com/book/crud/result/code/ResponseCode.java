package com.book.crud.result.code;

/**
 * 枚举类
 *
 * @version 1.0
 * @author: lyq
 * @date: 2020/3/13 23:28
 * @modified by
 */
public enum ResponseCode implements ResponseCodeInterface {
    /**
     * code=0：服务器已成功处理了请求。 通常，这表示服务器提供了请求的网页。
     * code=4010001：（授权异常） 请求要求身份验证。 客户端需要跳转到登录页面重新登录
     * code=4010002：(凭证过期) 客户端请求刷新凭证接口
     * code=4030001：没有权限禁止访问
     * code=400xxxx：系统主动抛出的业务异常
     * code=5000001：系统异常
     */
    SUCCESS(0, "操作成功"),
    SYSTEM_ERROR(5000001, "系统异常请稍后再试"),
    DATA_INCOMING_ERROR(4000001, "数据传入异常"),
    DATA_CHECK_ANOMALY(4000002, "数据校验异常"),
    //    登录校验
    ACCOUNT_ERROR(4000003, "该账号不存在"),
    ACCOUNT_IS_NOT_MEMBER(4000003, "该用户不是会员"),
    ACCOUNT_PASSWORD_ERROR(4000003, "用户密码不正确"),
    ;


    private int code;//响应码

    private String msg;//提示


    ResponseCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    @Override
    public int getCode() {
        return code;
    }

    @Override
    public String getMsg() {
        return msg;
    }
}
