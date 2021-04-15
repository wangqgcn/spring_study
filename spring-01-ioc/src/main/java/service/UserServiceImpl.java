package service;

import dao.UserDAO;
import dao.UserDAOImpl;
import dao.UserDAOMysqlImpl;

public class UserServiceImpl implements UserService{

    private UserDAO userDAO;

    //利用set进行动态实现值的注入
    public void setUserDAO(UserDAO userDAO){
        this.userDAO = userDAO;
    }

    @Override
    public void getUser() {
        userDAO.getUser();
    }
}
