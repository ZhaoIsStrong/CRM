package com.zhao.service.Impl;

import com.zhao.dao.StudentDao;
import com.zhao.dao.impl.StudentDaoImpl;
import com.zhao.domain.Student;
import com.zhao.service.StudentService;

public class StudentServiceImpl implements StudentService {
    private StudentDao studentDao = new StudentDaoImpl();//接口 jiekou = new 实现类 多态
    @Override
    public Student getById(String id) {
        Student s = studentDao.getById("1");
        return s;
    }

    @Override
    public void save(Student s) {
        studentDao.save(s);
    }
}
