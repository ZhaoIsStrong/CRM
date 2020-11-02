package com.zhao.service.Impl;

import com.zhao.dao.StudentDao;
import com.zhao.domain.Student;
import com.zhao.service.StudentService;
import com.zhao.utils.SqlSessionUtil;

import java.util.List;
import java.util.Map;

public class StudentServiceImpl implements StudentService {
    private StudentDao studentDao = SqlSessionUtil.getSession().getMapper(StudentDao.class);//避免了实现StudentDao类
    @Override
    public Student getById(String id) {
        Student s = studentDao.getById("1");
        return s;
    }

    @Override
    public void save(Student s) {
        studentDao.save(s);
    }

    @Override
    public List<Student> getAll() {

        return studentDao.getAll();
    }

    @Override
    public List<Student> selectMap(Map<String, Object> map) {
        return studentDao.selectMap(map);
    }
}
