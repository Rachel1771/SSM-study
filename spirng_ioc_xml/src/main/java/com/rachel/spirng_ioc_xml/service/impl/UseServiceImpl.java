package com.rachel.spirng_ioc_xml.service.impl;

import com.rachel.spirng_ioc_xml.dao.UserDao;
import com.rachel.spirng_ioc_xml.service.UserService;
import lombok.Data;

/**
 * @author Rachel
 * @date 2022/8/12 20:12
 * @desciption:
 * @status
 */
@Data
public class UseServiceImpl implements UserService {

    private UserDao userDao;
    @Override
    public void saveuser() {
        userDao.saveuser();
    }
}
