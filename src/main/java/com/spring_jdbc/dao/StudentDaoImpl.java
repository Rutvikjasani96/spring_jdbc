package com.spring_jdbc.dao;

import com.spring_jdbc.entites.Student;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.List;

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
//        Delete Data
        String query = "delete from student where id=?";
        int result = jdbcTemplate.update(query,studentId);
        return result;
    }

    @Override
    public Student getStudent(int studentId){
//        Get Only one Row
        String query = "select * from student where id=?";
        RowMapper<Student> rowMapper = new RowMapperImpl();
        Student student = jdbcTemplate.queryForObject(query,rowMapper,studentId);
        return student;
    }

    @Override
    public List<Student> getAllStudents(){
//        Get All the Rows(Data)
        String query = "select * from student";
        List<Student> students = jdbcTemplate.query(query,new RowMapperImpl());
        return students;
    }

//    Getters & Setters
    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
