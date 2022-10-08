package com.rachel.spirng_ioc_xml.dao.impl;

import com.rachel.spirng_ioc_xml.dao.UserDao;

/**
 * @author Rachel
 * @date 2022/8/12 20:14
 * @desciption:
 * @status
 */
public class UserDaoImpl implements UserDao {

    @Override
    public void saveuser() {
        System.out.println("保存成功！");
    }
}
