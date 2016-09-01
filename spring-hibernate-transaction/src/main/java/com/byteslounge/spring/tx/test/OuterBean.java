package com.byteslounge.spring.tx.test;

import com.byteslounge.spring.tx.model.User;

/**
 * Created by cuong.bui.manh on 9/1/2016.
 */
public interface OuterBean {

    void testRequired(User user);

    void testRequiresNew(User user);

}
