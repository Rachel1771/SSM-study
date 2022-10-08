import com.rachel.controller.UserController;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Rachel
 * @date 2022/8/16 20:55
 * @desciption:
 * @status
 */
public class TestAutowird {
    @Test
    public void testauto()
    {
        ApplicationContext ioc  = new ClassPathXmlApplicationContext("spring-autowird.xml");
        UserController userController = ioc.getBean(UserController.class);
        userController.saveuser();
    }
}
