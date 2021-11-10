import cn.zlatanlgd.pojo.User;
import cn.zlatanlgd.pojo.UserT;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {

        //Spring容器。
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserT user2 = (UserT) context.getBean("u2");
        user2.show();
    }
}
