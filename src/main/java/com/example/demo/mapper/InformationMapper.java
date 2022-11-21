package com.example.demo.mapper;

import com.example.demo.pojo.Information;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface InformationMapper {
//    根据学号查询学生的信息
    public List<Information> selectInf(@Param(value = "sid")String sid);
}
