import cn.zlatanlgd.service.UserService;
import cn.zlatanlgd.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //动态代理代理的是接口：注意不是UserServiceImpl!!!
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
    }
}
