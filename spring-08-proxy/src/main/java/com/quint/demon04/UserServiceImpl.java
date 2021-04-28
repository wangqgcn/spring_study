package com.quint.demon04;

public class UserServiceImpl implements UserService {
    @Override
    public void add() {
        System.out.println("增加了一个用户");
    }

    @Override
    public void delete() {
        System.out.println("删除了一个用户");
    }

    @Override
    public void update() {
        System.out.println("修改了已给用户");
    }

    @Override
    public void query() {
        System.out.println("查找了一个用户");
    }

    //改变原有的业务代码，在公司中是大忌
}
