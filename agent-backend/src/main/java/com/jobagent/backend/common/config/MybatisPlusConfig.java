package com.jobagent.backend.common.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.jobagent.backend.modules.*.mapper")
public class MybatisPlusConfig {
}
