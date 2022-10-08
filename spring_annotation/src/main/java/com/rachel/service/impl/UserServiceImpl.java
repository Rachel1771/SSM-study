package com.rachel.service.impl;

import com.rachel.dao.UserDao;
import com.rachel.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Rachel
 * @date 2022/8/16 20:09
 * @desciption:
 * @status
 */

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public void saveuser() {
        userDao.saveuser();
    }
}
