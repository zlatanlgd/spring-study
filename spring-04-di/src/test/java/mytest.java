import cn.zlatanlgd.pojo.Student;
import cn.zlatanlgd.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mytest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student.toString());
        /*
         Student{
         name='lrc',
         address=Address{address='成都'},
         books=[红楼梦, 西游记, 三国演义, 三国演义],
         hobbys=[足球, 篮球, 电影],
         card={
            身份证=1231111111,
            银行卡=123454523123123
         },
         games=[LOL, WOW],
         info={
            学号=20211112,
            性别=男,
            password=112211,
            username=root
         },
         wife='null'
         }
         */


    }

    @Test
    public void test2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("userbean.xml");
        User user2 = context.getBean("user2", User.class);
        User user = context.getBean("user", User.class);
        System.out.println(user==user2);

    }
}
