package com.spring_jdbc;

import com.spring_jdbc.dao.StudentDao;
import com.spring_jdbc.entites.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
//        Springjdbc -> spring template
        ApplicationContext context = new ClassPathXmlApplicationContext("jdbcconfig.xml");
//        JdbcTemplate jdbcTemplate = context.getBean("jdbcTemplate", JdbcTemplate.class);
//
////        Insert Query
//        String query = "insert into student(id,name,city) values(?,?,?)";
//
////        Fire the Query
//        int result = jdbcTemplate.update(query,3, "Rut", "Surat");
//
//        System.out.println(result+"Rows Affected...");

        StudentDao studentDao = context.getBean("studentDao",StudentDao.class);

//        Insert Data
//        Student student = new Student();
//        student.setId(7);
//        student.setName("Mrunal Thokor");
//        student.setCity("Mumbai");
//
//        int result = studentDao.insert(student);
//
//        System.out.println(result+"Rows Affected...");

//        Update Data
//        Student student = new Student();
//        student.setId(4);
//        student.setName("Dhruvit Kevadiya");
//        student.setCity("Gheti");
//
//        int result = studentDao.change(student);
//        System.out.println(result+" Rows Updated...");


//        Delete Data
        int result = studentDao.delete(3);
        System.out.println(result+" Rows Deleted...");


    }
}
