package dao;

public class UserDAOOracleImpl implements UserDAO{
    @Override
    public void getUser() {
        System.out.println("Oracle获取用户信息");
    }
}
