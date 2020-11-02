package com.zhao.service;

import com.zhao.domain.Student;

import java.util.List;
import java.util.Map;

//业务层
public interface StudentService {
    public Student getById(String id);
    public void save(Student s);
    List<Student> getAll();

    List<Student> selectMap(Map<String, Object> map);
}
