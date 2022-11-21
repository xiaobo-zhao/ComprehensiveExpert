package com.example.demo.service;

import com.example.demo.mapper.InformationMapper;
import com.example.demo.pojo.Information;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @BelongsProject: ComprehensiveExpert
 * @BelongsPackage: com.example.demo.service
 * @Author: Insist On
 * @CreateTime: 2022-11-21  20:57
 */
@Service
public class InformationService {
    @Autowired
    private InformationMapper informationMapper;
    public List<Information> selectInf(String sid){
        return informationMapper.selectInf(sid);
    }
}
