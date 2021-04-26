package com.quint.demo03;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//用这个类，自动生存代理类！
public class ProxyInvocationHandler implements InvocationHandler {

    private Rent rent;

    public void setRent(Rent rent){
        this.rent = rent;
    }

//    Foo f = (Foo) Proxy.newProxyInstance(Foo.class.getClassLoader(),
//                                            new Class<?>[] { Foo.class },
//                                            handler);

    //生成得到代理类
    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), rent.getClass().getInterfaces(),this);
    }

    //处理代理实例，并返回结果
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Object result = method.invoke(rent,args);
        return null;
    }
}
