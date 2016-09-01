package com.byteslounge.spring.tx.test;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by cuong.bui.manh on 9/1/2016.
 */
public interface InnerBean {

    void testRequired();

    void testRequiresNew();

    @Transactional(propagation = Propagation.MANDATORY)
    void testMandatory();
}
