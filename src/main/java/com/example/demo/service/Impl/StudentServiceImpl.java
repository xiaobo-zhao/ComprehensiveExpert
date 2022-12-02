package com.example.demo.service.Impl;

import com.example.demo.mapper.StudentDao;
import com.example.demo.pojo.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;
    //增加学生
    @Override
    public boolean addStudent(Student student) {
        studentDao.addStudent(student);
        return true;
    }
    //删除学生
    @Override
    public boolean deleteStudent(String sid) {
        studentDao.deleteStudent(sid);
        return true;
    }
    //修改学生
    @Override
    public boolean updateStudent(Student student) {
        studentDao.updateStudent(student);
        return true;
    }
    //查询单个学生
    @Override
    public Student selectStudent(String sid) {
        return studentDao.getById(sid);
    }
    //学生登陆
    @Override
    public Integer loginStudent(String sid, String sPassword) {
        return studentDao.loginStudent(sid,sPassword);
    }
    //查询全部学生
    @Override
    public List<Student> selectAllStudent() {
        return studentDao.allStudent();
    }
}
