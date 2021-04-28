package com.quint.demo03;

public class Client {
    public static void main(String[] args) {
        //真实角色
        Host2 host2 = new Host2();

        //代理角色：现在没有
        ProxyInvocationHandler pih = new ProxyInvocationHandler();

        //通过调用程序处理角色 来处理我们要调用放入接口对象！
        pih.setRent(host2);

        Rent proxy = (Rent) pih.getProxy();

        proxy.rent();
    }
}
