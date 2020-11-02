package com.zhao.utils;

import org.apache.ibatis.session.SqlSession;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//动态代理
public class TransactionInvocationHandler implements InvocationHandler {
    //target:zhangsan
    private Object target;
    public TransactionInvocationHandler(Object target){
        this.target = target;
    }
    //代理业务逻辑，zhangsan表白方法或者厂家出售方法
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        SqlSession session = null;
        Object obj = null;
        try{
            session = SqlSessionUtil.getSession();
            //处理业务逻辑，lisi表白方法，代理zhangsan的表白方法 或者商家出售方法，在代理厂家出售方法的基础上
            obj = method.invoke(target,args);
            //处理业务逻辑完毕后，提交事务
            session.commit();
        }catch (Exception e){
            //出现异常，回滚
            session.rollback();
            e.printStackTrace();
        }finally {
            SqlSessionUtil.myClose(session);
        }
        return obj;
    }
    public Object getProxy(){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                this);
    }
}
