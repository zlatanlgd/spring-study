package cn.zlatanlgd.service;

import cn.zlatanlgd.dao.UserDao;
import cn.zlatanlgd.dao.UserDaoImpl;
import cn.zlatanlgd.dao.UserDaoMysqlImpl;

public class UserServiceImpl implements UserService {
    private UserDao userDao;

    //传统实现方法：private UserDao userDao = new UserDaoImpl();
    //利用set进行动态实现值的注入
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void getUser() {
        userDao.getUser();
    }
}
