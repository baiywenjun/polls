package com.example.polls.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/**
 * Title: 审计类相关配置
 * Description: polls
 * author: wenjun
 * date: 2018/11/19 23:27
 */
@Configuration
@EnableJpaAuditing
public class AuditingConfig {
}
