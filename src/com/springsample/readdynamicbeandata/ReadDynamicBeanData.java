package com.springsample.readdynamicbeandata;

import com.springsample.readdynamicbeandata.bean.ColorBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ReadDynamicBeanData {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ColorBean.class);
        MyColor myColor = (MyColor) applicationContext.getBean("myColorBean");
        myColor.printColor();
    }
}
