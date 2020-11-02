package com.zhao.test;

import com.zhao.domain.Student;
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
        String resource = "mybatis-config.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();


        //查询所有
        List<Student> sList =  session.selectList("Test01.getAll");
        System.out.println(sList);
        //查询单个
        Student student = session.selectOne("Test01.getById","2");
        System.out.println(student.toString());
        //修改操作
//        Student student1 = new Student();
//        student1.setId(2);
//        student1.setName("呵呵");
//        student1.setAge("22");
//        int count = session.update("Test01.update",student1);
//        session.commit();
//
        //插入操作
//        Student student2 = new Student();
//        student2.setId(4);
//        student2.setName("呵呵");
//        student2.setAge("22");
//        int count = session.insert("Test01.insert",student2);
//        session.commit();


        //删除操作
        int count = session.delete("Test01.delete","4");
        session.commit();
    }
}
