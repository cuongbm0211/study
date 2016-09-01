package com.byteslounge.spring.tx;

import java.util.List;

import com.byteslounge.spring.tx.test.OuterBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.byteslounge.spring.tx.model.User;
import com.byteslounge.spring.tx.user.UserManager;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx =
                new ClassPathXmlApplicationContext("spring.xml");
        UserManager userManager =
                (UserManager) ctx.getBean("userManagerImpl");

        OuterBean outerBean = (OuterBean) ctx.getBean("outerBeanImpl");

        User user = new User();
        user.setUsername("johndoe");
        user.setName("John Doe");

        outerBean.testRequired(user);



    }
}

