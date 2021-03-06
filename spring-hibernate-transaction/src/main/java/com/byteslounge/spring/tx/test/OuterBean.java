package com.byteslounge.spring.tx.test;

import com.byteslounge.spring.tx.model.User;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by cuong.bui.manh on 9/1/2016.
 */
public interface OuterBean {

    void testRequired(User user);

    void testRequiresNew(User user);

    void testRequiresMantory(User user);

    void testNever(User user);

    void testSupports(User user);
}
