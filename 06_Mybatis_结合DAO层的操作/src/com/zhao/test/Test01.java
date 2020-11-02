package com.zhao.test;

import com.zhao.domain.Student;
import com.zhao.service.Impl.StudentServiceImpl;
import com.zhao.service.StudentService;
import com.zhao.utils.ServiceFactory;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

public class Test01 {
    public static void main(String[] args) {
//        StudentService ss = new StudentServiceImpl();//张三形态，没使用代理
        StudentService ss = (StudentService) ServiceFactory.getService(new StudentServiceImpl());


//        Student s1 = new Student();
//        s1.setId(11);
//        s1.setName("cxk");
//        s1.setAge("34");
//        ss.save(s1);

        Student s = ss.getById("11");
        System.out.println(s);

    }
}
