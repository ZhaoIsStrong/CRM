package com.zhao.dao;

import com.zhao.domain.Student;

public interface StudentDao {
    public Student getById(String id);
    public void save(Student s);
}
