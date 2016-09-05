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
public class OuterBeanImpl implements OuterBean {

    @Autowired UserDAO userDAO;
    @Autowired InnerBean innerBean;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void testRequired(User user) {
        userDAO.insertUser(user);

        try {
            innerBean.testRequired();
        } catch (Exception e) {
            // Ignore exception
        }
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void testRequiresNew(User user) {
        userDAO.insertUser(user);

        try {
            innerBean.testRequiresNew();
        } catch (Exception e) {
            // Ignore exception
        }
    }

    @Override
    public void testRequiresMantory(User user) {
//        userDAO.insertUser(user);
        innerBean.testMandatory();
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void testNever(User user) {
        innerBean.testNever();
    }
}
