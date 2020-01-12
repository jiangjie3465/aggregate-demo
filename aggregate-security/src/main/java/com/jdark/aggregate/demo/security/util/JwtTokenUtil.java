package com.jdark.aggregate.demo.security.util;

import com.jdark.aggregate.demo.security.config.JwtConfig;
import com.jdark.aggregate.demo.security.service.SelfUserBO;
import com.jdark.aggregate.demo.util.JsonUtil;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import java.util.Date;
import lombok.extern.slf4j.Slf4j;

/**
 * JWT工具类
 * @Author Sans
 * @CreateTime 2019/10/2 7:42
 */
@Slf4j
public class JwtTokenUtil {

    /**
     * 私有化构造器
     */
    private JwtTokenUtil(){}

    /**
     * 生成Token
     * @Author Sans
     * @CreateTime 2019/10/2 12:16
     * @Param  selfUserBO 用户安全实体
     * @Return Token
     */
    public static String createAccessToken(SelfUserBO selfUserBO){
        // 登陆成功生成JWT
        return Jwts.builder()
                // 放入用户名和用户ID
                .setId(selfUserBO.getUserId()+"")
                // 主题
                .setSubject(selfUserBO.getUsername())
                // 签发时间
                .setIssuedAt(new Date())
                // 签发者
                .setIssuer("jdark")
                // 自定义属性 放入用户拥有权限
                .claim("authorities", JsonUtil.objToJsonStr(selfUserBO.getAuthorities()))
                // 失效时间
                .setExpiration(new Date(System.currentTimeMillis() + JwtConfig.expiration))
                // 签名算法和密钥
                .signWith(SignatureAlgorithm.HS512, JwtConfig.secret)
                .compact();
    }
}