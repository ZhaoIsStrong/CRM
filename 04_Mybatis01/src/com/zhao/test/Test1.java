package com.zhao.test;

import com.zhao.domain.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import javax.xml.transform.Result;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Test1 {
    public static void main(String[] args) throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = null;
        inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();

        /*
        需求：根据id查单条
        如果取得的是单条记录，使用selectOne方法
        StudentMapper.xml中Mapper的namespace
         */
        Student student = session.selectOne("test1.getById","1");
        System.out.println(student.toString());

        List<Student> sList = session.selectList("test1.getAll");
        for (Student s:sList){
            System.out.println(s.toString());
        }



        //添加操作
//        Student s = new Student();
//        s.setId("3");
//        s.setName("nihao");
//        s.setAge(12);
//        session.insert("test1.save",s);
//        //手动提交事务
//        session.commit();


        //修改操作
//        Student student1 = new Student();
//        student1.setAge(14);
//        student1.setId("3");
//        student1.setName("zhao");
//        session.update("test1.update",student1);
//        session.commit();

        //删除操作
        session.delete("test1.delete","3");
        session.commit();



        session.close();
    }
}
