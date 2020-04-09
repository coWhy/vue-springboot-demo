package com.book.crud.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author: lyq
 * @date:  2020/4/9 11:44 下午
 * @version 1.0
 * @modified by
 */
    
/**
    * customer
    */
@Data
@TableName(value = "customer")
public class Customer implements Serializable {
    /**
     * id
     */
    @TableId(value = "id", type = IdType.INPUT)
    private String id;

    /**
     * 账号
     */
    @TableField(value = "account")
    private String account;

    /**
     * 登录密码
     */
    @TableField(value = "password")
    private String password;

    /**
     * 是否是会员 1 是;0 不是
     */
    @TableField(value = "is_member")
    private Integer isMember;

    /**
     * 创建人id
     */
    @TableField(value = "create_by",fill = FieldFill.INSERT)
    private String createBy;

    /**
     * 创建时间
     */
    @TableField(value = "create_at",fill = FieldFill.INSERT_UPDATE)
    private Date createAt;

    /**
     * 更新人id
     */
    @TableField(value = "update_by",fill = FieldFill.INSERT)
    private String updateBy;

    /**
     * 更新时间
     */
    @TableField(value = "update_at",fill = FieldFill.INSERT_UPDATE)
    private Date updateAt;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_ACCOUNT = "account";

    public static final String COL_PASSWORD = "password";

    public static final String COL_IS_MEMBER = "is_member";

    public static final String COL_CREATE_BY = "create_by";

    public static final String COL_CREATE_AT = "create_at";

    public static final String COL_UPDATE_BY = "update_by";

    public static final String COL_UPDATE_AT = "update_at";
}