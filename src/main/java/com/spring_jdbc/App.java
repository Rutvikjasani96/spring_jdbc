package com.spring_jdbc;

import com.spring_jdbc.dao.StudentDao;
import com.spring_jdbc.entites.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

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
//        student.setId(3);
//        student.setName("Dhruvin Palsana");
//        student.setCity("Ahmedabad");
//
//        int result = studentDao.insert(student);

//        System.out.println(result+" Rows Affected...");

//        Update Data
//        Student student = new Student();
//        student.setId(4);
//        student.setName("Dhruvit Kevadiya");
//        student.setCity("Gheti");
//
//        int result = studentDao.change(student);
//        System.out.println(result+" Rows Updated...");


//        Delete Data
//        int result = studentDao.delete(3);
//        System.out.println(result+" Rows Deleted...");

//        Select 1 Row(Object)
//        Student student = studentDao.getStudent(1);
//        System.out.println(student);
//        System.out.println(student.getId());
//        System.out.println(student.getName());
//        System.out.println(student.getCity());


//        Select All the Rows(Data)
        List<Student> students = studentDao.getAllStudents();
        for(Student student: students){
            System.out.print(student.getId());
            System.out.print(" "+student.getName());
            System.out.println(" "+student.getCity());
        }
    }
}
