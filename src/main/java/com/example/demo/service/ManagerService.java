package com.example.demo.service;

import com.example.demo.mapper.ManagerMapper;
import com.example.demo.pojo.Manager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @BelongsProject: ComprehensiveExpert
 * @BelongsPackage: com.example.demo.service
 * @Author: Insist On
 * @CreateTime: 2022-11-21  14:44
 */
@Service
public class ManagerService {
    @Autowired
    private ManagerMapper managerMapper;
    public void addManager(Manager manager){
        managerMapper.addManager(manager);
    }
}
