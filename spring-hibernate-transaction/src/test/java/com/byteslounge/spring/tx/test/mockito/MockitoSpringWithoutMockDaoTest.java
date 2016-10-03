package com.byteslounge.spring.tx.test.mockito;

import com.byteslounge.spring.tx.user.UserManager;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by cuong.bui.manh on 9/6/2016.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-test.xml")
@ActiveProfiles("development")
public class MockitoSpringWithoutMockDaoTest {
    public static final int DUMMY_USER_ID = 1;

    @Autowired
    UserManager userManager;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testMockito() {
        System.out.println(userManager.getUserById(DUMMY_USER_ID));
    }

}
