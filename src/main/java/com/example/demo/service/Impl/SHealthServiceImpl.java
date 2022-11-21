package com.example.demo.service.Impl;

import com.example.demo.mapper.student.SHealthMapper;
import com.example.demo.pojo.SHealth;
import com.example.demo.service.SHealthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName : SHealthServiceImpl  //类名
 * @Description :   //描述
 * @Author : cy //作者
 * @Date: 2022/11/21  18:30
 */
@Service
public class SHealthServiceImpl implements SHealthService {

    @Autowired
    private SHealthMapper sHealthMapper;

    @Override
    public void addSHealth(SHealth sHealth) {
        sHealthMapper.add(sHealth);
    }

    @Override
    public void deleteSHealth(SHealth sHealth) {
        sHealthMapper.delete(sHealth);
    }

    @Override
    public void updateSHealth(SHealth sHealth) {
        sHealthMapper.update(sHealth);
    }

    @Override
    public SHealth selectByIdSHealth(String sid) {
        return sHealthMapper.selectById(sid);
    }

    @Override
    public List<SHealth> selectAllSHealth() {
        return sHealthMapper.selectAll();
    }
}
