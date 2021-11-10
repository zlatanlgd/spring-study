package cn.zlatanlgd.config;


import cn.zlatanlgd.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

//也会被Spring容器托管，注册到容器中，因为它本来就是一个@Component。
// @Configuration代表这是一个配置类，等同于beans.xml
@Configuration
@ComponentScan("cn.zlatanlgd.pojo")
@Import(MyConfig2.class)
public class MyConfig {

    //注册一个bean，就相当于之前的一个bean标签。
    //这个方法的名字,就相当于bean标签中的ID属性。
    //这个方法的返回值，就相当于bean标签中的class属性。
    @Bean
    public User getUser() {
        return new User(); //就是返回要注入到bean的对象。
    }
}
