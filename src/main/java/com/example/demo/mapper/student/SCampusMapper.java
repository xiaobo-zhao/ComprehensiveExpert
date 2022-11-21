package com.example.demo.mapper.student;


import com.example.demo.pojo.SCampus;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface SCampusMapper {

    void add(SCampus sCampus);

    void delete(SCampus sCampus);

    void update(SCampus sCampus);

    SCampus selectById(String sid);

    List<SCampus> selectAll();

}
