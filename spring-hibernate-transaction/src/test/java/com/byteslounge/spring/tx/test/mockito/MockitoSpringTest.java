package com.byteslounge.spring.tx.test.mockito;

import com.byteslounge.spring.tx.dao.UserDAO;
import com.byteslounge.spring.tx.model.User;
import com.byteslounge.spring.tx.test.HelloWorld;
import com.byteslounge.spring.tx.user.UserManager;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.when;

/**
 * Created by cuong.bui.manh on 9/6/2016.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-test.xml")
@ActiveProfiles("development")
public class MockitoSpringTest {
    public static final int DUMMY_USER_ID = 9999;

    @InjectMocks @Autowired
    UserManager userManager;

    @Mock
    UserDAO userDAO;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testMockito() {
        User returnUser = new User();
        returnUser.setName("Cuong");
        when(userDAO.getUserById(anyInt())).thenReturn(returnUser);

        System.out.println(userDAO.getUserById(DUMMY_USER_ID));
    }
}
