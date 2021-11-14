package cn.zlatanlgd.demo02;

public class UserServiceImplTwo implements UserService{
    @Override
    public void add() {
        System.out.println("Two add");
    }

    @Override
    public void delete() {
        System.out.println("Two del");
    }

    @Override
    public void update() {
        System.out.println("Two update");
    }

    @Override
    public void query() {
        System.out.println("Two query");
    }
}
