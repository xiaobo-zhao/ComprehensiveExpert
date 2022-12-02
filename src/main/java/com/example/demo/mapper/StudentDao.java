package com.example.demo.mapper;

import com.example.demo.pojo.Student;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface StudentDao {
    //增加学生
    @Insert("insert into student (sid,sCollege,sPhone,sPassword,sName) " +
            "values(#{sid},#{sCollege},#{sPhone},#{sPassword},#{sName})")
    void addStudent(Student student);
    //删除学生
    @Delete("delete from student where sid = #{sid}")
    void deleteStudent(String sid);
    //修改学生
    @Update("update student set sCollege = #{sCollege}, sPhone = #{sPhone}, sPassword = #{sPassword},sName = #{sName} " +
            "where sid = #{sid}")
    void updateStudent(Student student);
    //查找单个学生
    @Select("select * from student where sid = #{sid}")
    Student getById(String sid);
    //学生登陆
    @Select("select * from student where sid = #{sid} and sPassword=#{sPassword}")
    Integer loginStudent(@Param("sid") String sid, @Param("sPassword") String sPassword);
    //查找全部学生
    @Select("select * from student")
    List<Student> allStudent();
}
