package com.book.crud.utils.jwt;

import org.springframework.stereotype.Component;

/**
 * 初始化jwt配置
 */
@Component
public class InitializerUtil {
    private TokenSettings tokenSettings;
    public InitializerUtil(TokenSettings tokenSettings){
        JwtTokenUtil.setTokenSettings(tokenSettings);
    }
}
