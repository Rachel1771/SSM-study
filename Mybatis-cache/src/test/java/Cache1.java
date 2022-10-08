
import com.chen.mapper.Cachemapper;
import com.chen.pojo.dept;
import com.chen.utils.MyBatisUntil;
import com.chen.utils.MybatisSql;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.io.IOException;

/**
 * @author Rachel
 * @date 2022/7/29 0:59
 * @desciption: 测试
 * @status 不错哟
 */
public class Cache1 {
    @Test
    public void getId() throws IOException {
//        String resource = "mybatis-config.xml";
//        InputStream inputStream = Resources.getResourceAsStream(resource);
//        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//        SqlSession sqlSession = sqlSessionFactory.openSession();
        MyBatisUntil myBatisUntil = new MyBatisUntil();
        SqlSession sqlSession=  myBatisUntil.getSqlSession(false);
        Cachemapper mapper = sqlSession.getMapper(Cachemapper.class);
        dept dept = mapper.getDeptno(10);
        System.out.println(dept);
    }
    @Test
    public void getId2()
    {
        MyBatisUntil myBatisUntil = new MyBatisUntil();
        SqlSession sqlSession = myBatisUntil.getSqlSession(false);
        Cachemapper mapper = sqlSession.getMapper(Cachemapper.class);
        dept dept = mapper.getDeptno(10);
        System.out.println(dept);
    }
}
