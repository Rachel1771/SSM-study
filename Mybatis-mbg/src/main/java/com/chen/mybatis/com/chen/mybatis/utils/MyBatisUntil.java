package com.chen.mybatis.com.chen.mybatis.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author Rachel
 * @date 2022/7/31 12:26
 * @desciption: 工具类
 * @status bad
 */
public class MyBatisUntil {
    //封装会话工厂
    private static SqlSessionFactory Factory;
    /**
     * 在进行对象的跨层传递的时候，使用ThreadLocal可以避免多次传递，打破层次间的约束
     */
    private static ThreadLocal<SqlSession> local = new ThreadLocal<SqlSession>();




    static {
        try {
            InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
            Factory = sqlSessionFactoryBuilder.build(is);

        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }

    //封装factory方法
    public static SqlSessionFactory getFactory() {
        return Factory;
    }

    //封装sqlSession会话
    public static SqlSession getSqlSession(boolean IsAutoComiit) {
        SqlSession sqlSession = local.get();
        if (sqlSession == null) {
            sqlSession = Factory.openSession(IsAutoComiit);
            local.set(sqlSession);
        }
        return sqlSession;
    }

    //使用泛型封装getMapper
    public static <T extends Object> T getMapper(Class<T> c) {
        SqlSession sqlSession = getSqlSession(true);
        return sqlSession.getMapper(c);
    }
}
