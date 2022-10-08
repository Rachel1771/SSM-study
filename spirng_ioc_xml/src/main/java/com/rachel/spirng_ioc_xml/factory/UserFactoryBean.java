package com.rachel.spirng_ioc_xml.factory;
import com.rachel.spirng_ioc_xml.pojo.User;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author maomao
 * @create 2022-07-23 16:43
 */
public class UserFactoryBean implements FactoryBean<User> {

    @Override
    public User getObject() throws Exception {
        return new User();
    }

    @Override
    public Class<?> getObjectType() {
        return User.class;
    }
}
