package com.book.crud.exception;


import com.book.crud.result.code.ResponseCode;

/**
 * 业务异常类
 * 根据相应的业务
 * 抛出相应的运行时异常，进行数据库事务回滚，
 * 并希望该异常信息能被返回显示给用户
 *
 * @version 1.0
 * @author: lyq
 * @date: 2020/3/13 23:53
 * @modified by
 */
public class BusinessException extends RuntimeException {
    private final int code;//异常 code
    public final String defaultMessage;//异常提示

    public BusinessException(int code, String defaultMessage) {
        super(defaultMessage);
        this.code = code;
        this.defaultMessage = defaultMessage;
    }

    public BusinessException(ResponseCode responseCode) {
        this(responseCode.getCode(), responseCode.getMsg());
    }

    public int getCode() {
        return code;
    }

    public String getDefaultMessage() {
        return defaultMessage;
    }
}
