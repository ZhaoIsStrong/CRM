package com.zhao.dao.impl;

import com.zhao.dao.StudentDao;
import com.zhao.domain.Student;
import com.zhao.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;

public class StudentDaoImpl implements StudentDao {
    @Override
    public Student getById(String id) {
        SqlSession session = SqlSessionUtil.getSession();
        Student s = session.selectOne("Test01.getById",id);
        return s;
    }

    @Override
    public void save(Student s) {
        System.out.println("1");
        SqlSession session = SqlSessionUtil.getSession();
        session.insert("Test01.save",s);
        //不能在Dao层提交事务，应该在service提交事务
    }
}
