package com.quint.demon04;

public class Client {
    public static void main(String[] args) {
        //真实角色
        UserServiceImpl userService = new UserServiceImpl();

        //代理角色
        ProxyInvocationHandler pih = new ProxyInvocationHandler();

        //设置代理对象
        pih.setTarget(userService);

        //动态生成代理类
        UserService proxy = (UserService) pih.getProxy();

        proxy.add();
        proxy.delete();

    }
}
