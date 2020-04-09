package com.book.crud.config.mp;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * 自定义填充公共字段 ,即没有传的字段自动填充
 *
 * @version 1.0
 * @author: lyq
 * @date: 2020/3/15 17:34
 * @modified by
 */
@Component
public class MetaHandler implements MetaObjectHandler {

    @Override
    public void insertFill(MetaObject metaObject) {
        System.err.println("正在调用该insert填充字段方法");
        Object createAt = getFieldValByName("createAt", metaObject);
        Object createBy = getFieldValByName("createBy", metaObject);
        Object updateAt = getFieldValByName("updateAt", metaObject);
        Object updateBy = getFieldValByName("updateBy", metaObject);
        Object delFlag = getFieldValByName("delFlag", metaObject);
        String userId = "1";//默认系统
        if (null == createAt) {
            setFieldValByName("createAt", new Date(), metaObject);
        }
        if (null == createBy) {
            setFieldValByName("createBy", userId, metaObject);
        }
        if (null == updateAt) {
            setFieldValByName("updateAt", new Date(), metaObject);
        }
        if (null == updateBy) {
            setFieldValByName("updateBy", userId, metaObject);
        }
        System.err.println("调用该insert填充字段方法结束");
    }

    //更新填充
    @Override
    public void updateFill(MetaObject metaObject) {
        System.err.println("正在调用该update填充字段方法");
        setFieldValByName("updateAt", new Date(), metaObject);
        String userId = "1";//默认系统
        Object updateBy = getFieldValByName("updateBy", metaObject);
        setFieldValByName("updateBy", userId, metaObject);
        System.err.println("调用该update填充字段方法结束");
    }
}
