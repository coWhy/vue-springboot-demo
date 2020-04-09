package com.book.crud.config.mp;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @version 1.0
 * @author: lyq
 * @date: 2020/3/6 19:46
 * @modified by
 */
@Configuration
@EnableTransactionManagement
@MapperScan(basePackages = {"com.book.crud.mapper"})
public class MybatisPlusConfig {
    //支持分页插件
    @Bean
    public PaginationInterceptor paginationInterceptor() {//开启分页
        return new PaginationInterceptor();
    }


}
