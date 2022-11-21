package com.example.demo.controller;

import com.example.demo.pojo.Manager;
import com.example.demo.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @BelongsProject: ComprehensiveExpert
 * @BelongsPackage: com.example.demo.controller
 * @Author: Insist On
 * @CreateTime: 2022-11-21  14:45
 */
@RestController
@CrossOrigin//解决跨域问题
public class ManagerController {
    @Autowired
    private ManagerService managerService;

    @RequestMapping("/add")
    public String addManager(@RequestBody Manager manager) {
        managerService.addManager(manager);
        return "管理员信息添加成功";
    }
}
