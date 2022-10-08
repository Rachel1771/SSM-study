package com.chen.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author Rachel
 * @date 2022/7/29 0:51
 * @desciption: enn
 * @status 111
 */
public class MybatisSql {
//    public class SqlsessionUntil
//    {
//        public static SqlSession getSqSession()
//        {
//            SqlSession sqlSession = null;
//            try
//            {
//                String resource = "mybatis-config.xml";
//                InputStream inputStream = Resources.getResourceAsStream(resource);
//                SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//                sqlSession = (SqlSession) sqlSessionFactory.openSession(true);
//            }catch (IOException e)
//            {
//                e.printStackTrace();
//            }
//            return sqlSession;
//        }
//
//    }
private static SqlSessionFactory Factory;
    /**在进行对象的跨层传递的时候，使用ThreadLocal可以避免多次传递，打破层次间的约束
     */
    private static ThreadLocal<MybatisSql> local = new ThreadLocal<MybatisSql>();

    static {
        try {
            InputStream is = Resources.getResourceAsStream("mysql-config.xml");
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
            Factory = sqlSessionFactoryBuilder.build(is);

        } catch (
                IOException e)

        {
            e.printStackTrace();
        }
    }
    //封装factory方法
    public  static SqlSessionFactory getFactory(){
        return Factory;
    }

    //封装sqlSession会话
    public static MybatisSql getSqlSession(boolean IsAutoComiit) {
        MybatisSql sqlSession = local.get();
        if (sqlSession == null) {
            sqlSession = (MybatisSql) Factory.openSession(IsAutoComiit);
            local.set(sqlSession);
        }
        return sqlSession;
    }

    //使用泛型封装getMapper
    public static <T extends Object> T getMapper(Class<T> c) {
        MybatisSql sqlSession = getSqlSession(true);
        return sqlSession.getMapper(c);
    }


}


//public class SqlSession {
//
//    private static SqlSessionFactory factory;
//
//    static{
//
//        String resource = "mybatis-config.xml";
//        InputStream inputStream = null;
//        try {
//            //通过加载MyBatis的主配置文件mybatis-config.xml,创建输入流
//            inputStream = Resources.getResourceAsStream(resource);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        factory = new SqlSessionFactoryBuilder().build(inputStream);
//    }
//
//    //ThreadLocal创建本地线程，每一个线程都有自己的副本。避免线程不安全
//    private static ThreadLocal<org.apache.ibatis.session.SqlSession> t = new ThreadLocal<org.apache.ibatis.session.SqlSession>();
//
//    //取得SqlSession对象
//    public static org.apache.ibatis.session.SqlSession getSession(){
//        //首先获取当前调用者线程，如果当前线程的threadLocals不为null，就直接返回当前线程绑定的本地变量值
//        org.apache.ibatis.session.SqlSession session = t.get();
//        if(session==null){
//            session = factory.openSession();
//
//            t.set(session);
//        }
//
//        return session;
//    }
//    //关闭SqlSession对象
//    public static void myClose(org.apache.ibatis.session.SqlSession session){
//        if(session!=null){
//
//            session.close();
//            //这句必须加，非常容易忘记,如果不加可能会存在数据混乱
//            t.remove();
//        }
//    }
//}


