package com.james;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(StarterService.class)
public class StarterConfiguration {

    @Bean
    public StarterService yourService() {
        return new StarterService();
    }
}
