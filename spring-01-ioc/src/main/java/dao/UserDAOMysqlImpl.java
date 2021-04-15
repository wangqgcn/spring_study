package dao;

public class UserDAOMysqlImpl implements UserDAO{

    @Override
    public void getUser() {
        System.out.println("Mysql获取用户数据！");
    }
}
