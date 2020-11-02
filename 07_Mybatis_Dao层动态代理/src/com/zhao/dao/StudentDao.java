package com.zhao.dao;

import com.zhao.domain.Student;

import java.util.List;
import java.util.Map;

public interface StudentDao {
    public Student getById(String id);
    public void save(Student s);
    List<Student> getAll();
    List<Student> selectMap(Map<String, Object> map);

}
