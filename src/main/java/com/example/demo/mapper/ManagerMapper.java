package com.example.demo.mapper;

import com.example.demo.pojo.Manager;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface ManagerMapper {
    //    添加管理员信息
    public void addManager(Manager manager);

    //    查询管理员信息
    public Integer selectManager(@Param(value = "musername") String musername, @Param(value = "mpassword") String mpassword);
}
