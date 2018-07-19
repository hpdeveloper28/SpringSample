package com.springsample.readdynamicbeandata.bean;

import com.springsample.readdynamicbeandata.MyColor;
import com.springsample.readdynamicbeandata.RedColor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ColorBean {

    @Bean(name = "myColorBean")
    public MyColor getMyColor() {
        return new RedColor();
    }
}
