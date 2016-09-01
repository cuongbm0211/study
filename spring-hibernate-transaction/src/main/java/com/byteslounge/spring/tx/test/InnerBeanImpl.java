package com.byteslounge.spring.tx.test;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by cuong.bui.manh on 9/1/2016.
 */
@Service
public class InnerBeanImpl implements  InnerBean {

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void testRequired() {
        throw new RuntimeException("Roll back this transaction!");
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void testRequiresNew() {
        throw new RuntimeException("Roll back this transaction!");
    }
}
