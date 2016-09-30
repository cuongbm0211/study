package com.byteslounge.spring.tx.test.mockito;

import com.byteslounge.spring.tx.dao.UserDAO;
import com.byteslounge.spring.tx.model.User;
import com.byteslounge.spring.tx.user.impl.UserManagerImpl;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.when;

/**
 * Created by cuong.bui.manh on 9/6/2016.
 */
@RunWith(MockitoJUnitRunner.class)
public class MockitoTest {
    public static final int DUMMY_USER_ID = 9999;

    @InjectMocks
    UserManagerImpl userManager;

    @Mock
    UserDAO userDAO;

    @Before
    public void setupMock() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void should_say_hello() {
        User userReturn = new User();
        userReturn.setName("Cuong");
        when(userDAO.getUserById(anyInt())).thenReturn(userReturn);

        User result = userManager.getUserById(DUMMY_USER_ID);
        System.out.println(result);
    }
}
