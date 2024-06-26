package com.spring_jdbc;

import com.spring_jdbc.dao.StudentDaoImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = {"com.spring_jdbc.dao"})
public class Jdbcconfig {

    @Bean("DataSource")
    public DataSource getDataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/springjdbc");
        dataSource.setUsername("root");
        dataSource.setPassword("Rutvik@123");
        return dataSource;
    }

    @Bean("jdbcTemplate")
    public JdbcTemplate getJdbcTemplate(){
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(getDataSource());
        return jdbcTemplate;
    }

//    @Bean("studentDao")
//    public StudentDaoImpl getStudentDao(){
//        StudentDaoImpl studentDao = new StudentDaoImpl();
//        studentDao.setJdbcTemplate(getJdbcTemplate());
//        return studentDao;
//    }
}
