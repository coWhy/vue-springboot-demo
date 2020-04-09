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
    * book
    */
@Data
@TableName(value = "book")
public class Book implements Serializable {
    /**
     * id
     */
    @TableId(value = "id", type = IdType.INPUT)
    private String id;

    /**
     * 图书名称
     */
    @TableField(value = "book_name")
    private String bookName;

    /**
     * 图书价格
     */
    @TableField(value = "book_price")
    private Double bookPrice;

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

    public static final String COL_BOOK_NAME = "book_name";

    public static final String COL_BOOK_PRICE = "book_price";

    public static final String COL_CREATE_BY = "create_by";

    public static final String COL_CREATE_AT = "create_at";

    public static final String COL_UPDATE_BY = "update_by";

    public static final String COL_UPDATE_AT = "update_at";
}