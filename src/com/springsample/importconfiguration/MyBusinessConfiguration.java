package com.springsample.importconfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyBusinessConfiguration {

    @Bean(name = "businessService")
    public MyBusinessService getBusinessService() {
        return new MyBusinessService();
    }
}
