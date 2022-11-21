package com.example.demo.mapper.student;


import com.example.demo.pojo.SHealth;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface SHealthMapper {

    void add(SHealth sHealth);

    void delete(SHealth sHealth);

    void update(SHealth sHealth);

    SHealth selectById(String sid);

    List<SHealth> selectAll();


}
