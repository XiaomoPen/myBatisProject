package com.pxm.utils;

import com.pxm.annotation.Select;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class SqlConnection {

    public <T> Object getInterProxy(Class<T> c){
        ConnectionHandler handler=new ConnectionHandler();
        return Proxy.newProxyInstance(c.getClassLoader(), new Class[]{c}, handler);
    }
}

class ConnectionHandler implements InvocationHandler{

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return null;
    }
}