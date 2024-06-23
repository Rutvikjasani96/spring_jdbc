package com.spring_jdbc.dao;

import com.spring_jdbc.entites.Student;
import org.springframework.jdbc.core.JdbcTemplate;

public class StudentDaoImpl implements StudentDao{

    private JdbcTemplate jdbcTemplate;
    @Override
    public int insert(Student student) {
//        Insert Data
        String query = "insert into student(id,name,city) values(?,?,?)";
        int result = jdbcTemplate.update(query,student.getId(), student.getName(), student.getCity());
        return result;
    }

    @Override
    public int change(Student student){
//        Update Data
        String query = "update student set name=?, city=? where id=?";
        int result = jdbcTemplate.update(query,student.getName(),student.getCity(),student.getId());
        return result;
    }

    @Override
    public int delete(int studentId){
        String query = "delete from student where id=?";
        int result = jdbcTemplate.update(query,studentId);
        return result;
    }

//    Getters & Setters
    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
