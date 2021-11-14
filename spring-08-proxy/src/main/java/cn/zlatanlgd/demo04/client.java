package cn.zlatanlgd.demo04;

import cn.zlatanlgd.demo02.UserService;
import cn.zlatanlgd.demo02.UserServiceImplTwo;

public class client {
    public static void main(String[] args) {
        //真实角色
        UserServiceImplTwo userService = new UserServiceImplTwo();
        //代理角色
        ProxyInvocationHandler pih = new ProxyInvocationHandler();

        pih.setTarget(userService); //设置一个代理的对象
        //动态生成代理类
        UserService proxy = (UserService) pih.getProxy();

        proxy.delete();
        proxy.query();
    }
}
