package com.zhao.test;

import com.zhao.domain.Student;
import com.zhao.service.Impl.StudentServiceImpl;
import com.zhao.service.StudentService;
import com.zhao.utils.ServiceFactory;
import com.zhao.vo.StudentAndClassroomVo;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class Test01 {
    public static void main(String[] args) {
//        StudentService ss = new StudentServiceImpl();//张三形态，没使用代理
        StudentService ss = (StudentService) ServiceFactory.getService(new StudentServiceImpl());


//        Student s1 = new Student();
//        s1.setId(11);
//        s1.setName("cxk");
//        s1.setAge("34");
//        ss.save(s1);




//        Student s = ss.getById("11");
//        System.out.println(s);
//
//        List<Student> sList = ss.getAll();
//        for (Student st:sList){
//            System.out.println(st.toString());
//        }
        //使用多个的参数，应该将多个参数封装到一个domain对象中去，或者是打包到一个map集合中



        //map为参数
        Map<String,Object> map = new HashMap<>();
        map.put("name","zhangsan");
        map.put("id",1);
        List<Student> sList1= ss.selectMap(map);
        System.out.println(sList1);



        //给sql传值的几种方式

//        List<Map<String,Object>> mapList = ss.getAll();
//        for(Map<String,Object> map1:mapList){
//            Set<String> set =  map1.keySet();
//            for(String key:set){
//                System.out.println("key:"+key);
//                System.out.println("value:"+map1.get(key));
//            }
//        }


//        List<StudentAndClassroomVo> studentAndClassroomVos = ss.getAll();
//        for(StudentAndClassroomVo map1:studentAndClassroomVos){
//            System.out.println(map1.toString());
//        }
    }
}
