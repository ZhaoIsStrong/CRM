package com.zhao.utils;

public class ServiceFactory {
    //传递zhangsna对象，得到lisi对象过程
    //传递厂家对象，     得到代理商，商家对象过程
    public static Object getService(Object service){
         return new TransactionInvocationHandler(service).getProxy();
    }
}
