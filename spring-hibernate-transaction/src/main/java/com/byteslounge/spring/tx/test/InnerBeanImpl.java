package com.byteslounge.spring.tx.test;

import com.byteslounge.spring.tx.dao.UserDAO;
import com.byteslounge.spring.tx.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by cuong.bui.manh on 9/1/2016.
 */
@Service
public class InnerBeanImpl implements  InnerBean {

    @Autowired
    UserDAO userDAO;

    @Override
//    @Transactional(propagation = Propagation.REQUIRED)
    public void testRequired() {
        throw new RuntimeException("Roll back this transaction!");
    }

    @Override
//    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void testRequiresNew() {
        throw new RuntimeException("Roll back this transaction!");
    }

    @Override
    public void testMandatory() {
        User user = new User();
        user.setUsername("johndoe");
        user.setName("John Doe");

        userDAO.insertUser(user);
        System.out.println("abc");
    }

}
