package com.spring_jdbc.dao;

import com.spring_jdbc.entites.Student;

public interface StudentDao {
    public int insert(Student student);
    public int change(Student student);
    public int delete(int studentId);
    public Student getStudent(int studentId);
}
