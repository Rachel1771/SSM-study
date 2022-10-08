package com.chen.mybaits;

import com.chen.mybatis.com.chen.mybatis.utils.MyBatisUntil;
import com.chen.mybatis.mapper.DeptMapper;
import com.chen.mybatis.pojo.Dept;
import com.chen.mybatis.pojo.Emp;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * @author Rachel
 * @date 2022/7/31 12:28
 * @desciption: 测试类
 * @status good
 */
public class test1 {
    @Test
    public void testMBG()
    {
        MyBatisUntil myBatisUntil = new MyBatisUntil();
        SqlSession sqlSession = myBatisUntil.getSqlSession(false);
        DeptMapper deptMapper = sqlSession.getMapper(DeptMapper.class);
//        dept.selectByPrimaryKey()
        Dept de = deptMapper.selectByPrimaryKey(40);
        System.out.println(de);
    }
}
