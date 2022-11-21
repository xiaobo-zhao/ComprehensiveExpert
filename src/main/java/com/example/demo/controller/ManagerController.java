package com.example.demo.controller;

import com.alibaba.fastjson.JSON;
import com.example.demo.pojo.Manager;
import com.example.demo.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping("/register")
    public String ManagerRegister(@RequestBody Manager manager) {
        managerService.addManager(manager);
        return JSON.toJSONString("注册成功");
    }

    @RequestMapping("/login")
    public String ManagerLogin(@RequestBody Manager manager) {
        System.out.println(manager.getMusername() + "\n" + manager.getMpassword());
        Integer inf = managerService.selectManager(manager.getMusername(), manager.getMpassword());
        if (inf == null){
            System.out.println(JSON.toJSON("登录失败").toString());
            return JSON.toJSONString("登录失败");
        }else {
            return JSON.toJSONString("登录成功");
        }
    }
}
