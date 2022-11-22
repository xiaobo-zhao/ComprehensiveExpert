package com.example.demo.controller;

import com.alibaba.fastjson.JSON;
import com.example.demo.pojo.Information;
import com.example.demo.service.InformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @BelongsProject: ComprehensiveExpert
 * @BelongsPackage: com.example.demo.controller
 * @Author: Insist On
 * @CreateTime: 2022-11-21  21:02
 */
@RestController
@CrossOrigin
public class InformationController {
    @Autowired
    private InformationService informationService;

    @RequestMapping("/display")
    public List<Information> displayInf(@RequestBody Information information) {
        return informationService.selectInf(information.getSid());
    }
}
