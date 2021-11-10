package cn.zlatanlgd.pojo;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//等价于 <bean id="user" class="cn.zlatanlgd.pojo.User"/>
//@Component 组件
@Component
@Scope("prototype")
public class User {

    public String name;

    // 相当于 <property name="name" value="lrc"/>
    @Value("lrc")
    public void setName(String name) {
        this.name = name;
    }
}
