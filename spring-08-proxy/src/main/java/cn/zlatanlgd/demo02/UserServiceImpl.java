package cn.zlatanlgd.demo02;

//真实对象
public class UserServiceImpl implements UserService {
    @Override
    public void add() {
        System.out.println("使用了add方法");
        System.out.println("增加了一个用户");
    }
    @Override
    public void delete() {
        System.out.println("删除了一个用户");
    }
    @Override
    public void update() {
        System.out.println("修改了一个用户");
    }
    @Override
    public void query() {
        System.out.println("查询了一个用户");
    }
}