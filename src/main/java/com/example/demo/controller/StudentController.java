package com.example.demo.controller;

import com.alibaba.fastjson.JSON;
import com.example.demo.pojo.Manager;
import com.example.demo.pojo.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @ClassName : StudentController  //类名
 * @Description :   //描述
 * @Author : bbx //作者
 * @Date: 2022/12/2  1:43
 */

@RestController
@CrossOrigin
public class StudentController {
    @Autowired
    private StudentService studentService;

    //注册
    @RequestMapping("/sRegister")
    public String StudentRegister(@RequestBody Student student) {
        try {
            studentService.addStudent(student);
            return JSON.toJSONString("注册成功");
        }catch (Exception e){
            return JSON.toJSONString("注册失败，用户名重复");
        }
    }
    //登陆
    @RequestMapping("/sLogin")
    public String StudentLogin(@RequestBody Student student) {
        System.out.println("学生id为"+student.getSid() + "密码为" + student.getSPassword());
        Integer inf = studentService.loginStudent(student.getSid(), student.getSPassword());
        //System.out.println(inf);
        if (inf == null){
            System.out.println(JSON.toJSON("登录失败，用户名或密码错误").toString());
            return JSON.toJSONString("登录失败，用户名或密码错误");
        }else {
            System.out.println("登陆成功");
            return JSON.toJSONString("登录成功");
        }
    }
    //查询所有学生
    @GetMapping("/allStudent")
    public List<Student> allStudent() {
        return studentService.selectAllStudent();
    }
    //查询单个学生
    @GetMapping("/oneStudent/{sid}")
    public Student oneStudent(@PathVariable String sid) {
        return studentService.selectStudent(sid);
    }
    //增加学生
    @PostMapping("/addStudent")
    public boolean oneStudent(@RequestBody Student student) {
        studentService.addStudent(student);
        return true;
    }
    //删除学生
    @DeleteMapping("/deleteStudent/{sid}")
    public boolean deleteStudent(@PathVariable String sid) {
        studentService.deleteStudent(sid);
        return true;
    }
    //修改学生
    @PutMapping("/updateStudent")
    public boolean updateStudent(@RequestBody Student student) {
        studentService.updateStudent(student);
        return true;
    }
}