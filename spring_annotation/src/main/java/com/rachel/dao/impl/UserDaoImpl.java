package com.rachel.dao.impl;

import com.rachel.dao.UserDao;
import org.springframework.stereotype.Repository;

/**
 * @author Rachel
 * @date 2022/8/16 20:32
 * @desciption:
 * @status
 */

@Repository
public class UserDaoImpl implements UserDao {

    @Override
    public void saveuser() {
        System.out.println("保存成功");
    }
}
