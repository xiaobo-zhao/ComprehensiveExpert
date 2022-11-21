package com.example.demo.mapper;

import com.example.demo.pojo.Manager;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface ManagerMapper {
    //    添加管理员信息
    public void addManager(Manager manager);
}
