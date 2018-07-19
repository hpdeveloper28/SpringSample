package com.springsample.importconfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyDbConfiguration {

    @Bean(name = "dbService")
    public MyDbService getDbService() {
        return new MyDbService();
    }

}
