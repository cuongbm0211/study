package com.byteslounge.spring.tx.user.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.byteslounge.spring.tx.dao.UserDAO;
import com.byteslounge.spring.tx.model.User;
import com.byteslounge.spring.tx.user.UserManager;

@Service
public class UserManagerImpl implements UserManager {

    @Autowired
    private UserDAO userDAO;

    @Override
    @Transactional
    public void insertUser(User user) {
        userDAO.insertUser(user);
    }

    @Override
    @Transactional(propagation= Propagation.REQUIRED)
    public User getUserById(int userId) {
        userDAO.getUserById(userId);
        userDAO.getUserById(userId);
        userDAO.getUserById(userId);
        userDAO.getUserById(userId);
        userDAO.getUserById(userId);
        userDAO.getUserById(userId);
        userDAO.getUserById(userId);
        userDAO.getUserById(userId);
        return userDAO.getUserById(userId);
    }

    @Override
    @Transactional(propagation=Propagation.REQUIRED)
    public User getUser(String username) {
        return userDAO.getUser(username);
    }

    @Override
    @Transactional(propagation=Propagation.REQUIRED)
    public List<User> getUsers() {
        return userDAO.getUsers();
    }

}
