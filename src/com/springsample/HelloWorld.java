package com.springsample;

import com.springsample.models.Student;
import com.springsample.models.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorld {

    public static void main(String[] args) {
        readUserData();
        readStudentData();
    }

    private static void readStudentData() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = (Student) applicationContext.getBean("studentBean");
        student.displayStudentNickName();
    }

    private static void readUserData() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        User userObject = (User) applicationContext.getBean("userBean");
        userObject.displayUSerName();
    }
}
