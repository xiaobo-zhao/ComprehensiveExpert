package com.example.demo.service;

import com.example.demo.pojo.Student;

import java.util.List;

public interface StudentService {
    //增加学生
    boolean addStudent(Student student);
    //删除学生
    boolean deleteStudent(String sid);
    //修改学生
    boolean updateStudent(Student student);
    //查询单个学生
    Student selectStudent(String sid);
    //学生登陆
    Integer loginStudent(String sid,String sPassword);
    //查询全部学生
    List<Student> selectAllStudent();
}
