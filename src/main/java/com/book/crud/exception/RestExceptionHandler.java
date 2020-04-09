package com.book.crud.exception;


import com.book.crud.result.R;
import com.book.crud.result.code.ResponseCode;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.List;

/**
 * 全局异常统一处理类
 *
 * @version 1.0
 * @author: lyq
 * @date: 2020/3/13 23:43
 * @modified by
 */
@RestControllerAdvice
public class RestExceptionHandler {
    @ExceptionHandler(Exception.class)
    public <T> R<T> handleException(Exception e) {
        System.err.println("系统异常信息(Exception):" + e.getLocalizedMessage());
        return R.getResult(ResponseCode.SYSTEM_ERROR);//系统异常请稍后再试
    }


    //全局捕获自定义业务异常 BusinessException
    @ExceptionHandler(BusinessException.class)
    public R businessException(BusinessException e) {
        System.err.println("业务异常信息(BusinessException):" + e.getLocalizedMessage());
        return R.getResult(e.getCode(), e.getDefaultMessage());
    }

    //处理validation框架异常,全局捕获校验抛出异常 MethodArgumentNotValidException
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public <T> R<T> methodArgumentNotValidException(MethodArgumentNotValidException e) {
        System.err.println("validation框架异常信息(MethodArgumentNotValidException):" + e.getBindingResult().getAllErrors());
        List<ObjectError> errors = e.getBindingResult().getAllErrors();
        String[] infos = new String[errors.size()];
        int i = 0;
        for (ObjectError error : errors) {
            infos[i] = error.getDefaultMessage();
            System.err.println("信息: " + infos[i]);
            i++;
        }
        return R.getResult(ResponseCode.DATA_CHECK_ANOMALY.getCode(), infos[0]);
    }

}
