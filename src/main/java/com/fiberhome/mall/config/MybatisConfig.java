package com.fiberhome.mall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author: YHCHENG X6811
 * @date: 2022/8/24 20:17
 * @description: MyBatis配置类
 **/
@Configuration
@MapperScan("com.fiberhome.mall.mbg.mapper")
public class MybatisConfig {
}
