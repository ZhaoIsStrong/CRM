package com.zhao.service;

import com.zhao.domain.Student;
//业务层
public interface StudentService {
    public Student getById(String id);
    public void save(Student s);
}
