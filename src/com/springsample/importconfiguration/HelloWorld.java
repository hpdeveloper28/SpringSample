package com.springsample.importconfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloWorld {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyAppConfiguration.class);

        MyDbService myDbService = (MyDbService) applicationContext.getBean("dbService");
        myDbService.createDBConnection();

        MyBusinessService myBusinessService = (MyBusinessService) applicationContext.getBean("businessService");
        myBusinessService.createBusinessService();
    }
}
