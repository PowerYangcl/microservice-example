package com.matrix.springcloud.alibaba.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan({"com.matirx.springcloud.alibaba.dao"})
public class MyBatisConfig {
}