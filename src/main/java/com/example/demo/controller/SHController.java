package com.example.demo.controller;

import com.example.demo.pojo.SHealth;
import com.example.demo.service.SHealthService;
import com.example.demo.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName : SHController  //类名
 * @Description :   //描述
 * @Author : cy //作者
 * @Date: 2022/11/21  19:31
 */

@RestController
public class SHController {
    @Autowired
    private SHealthService sHealthService;
    @Autowired
    private Result result;

    @RequestMapping("allSHealth")
    public List<SHealth> allSHealth(){
        return sHealthService.selectAllSHealth();
    }

    @RequestMapping("shealthByid")
    public SHealth shealthByid(@RequestBody SHealth sHealth){
        String sid = sHealth.getSid();
        return sHealthService.selectByIdSHealth(sid);
    }

    @RequestMapping("addSHealth")
    public Result addSHealth(@RequestBody SHealth sHealth) {
        try {
            sHealthService.addSHealth(sHealth);
            result.setMsg("添加成功！！");
        } catch (Exception e) {
            e.printStackTrace();
            result.setStatus(false);
            result.setMsg("添加失败");
        }
        return result;
    }

    @RequestMapping("deleteSHealth")
    public Result deleteSHealth(@RequestBody SHealth sHealth){
        try {
            sHealthService.deleteSHealth(sHealth);
            result.setMsg("删除成功！！");
        } catch (Exception e) {
            e.printStackTrace();
            result.setStatus(false);
            result.setMsg("删除失败");
        }
        return result;
    }

    @RequestMapping("editSHealth")
    public Result editSHealth(@RequestBody SHealth sHealth){
        try {
            sHealthService.updateSHealth(sHealth);
            result.setMsg("编辑成功！！");
        } catch (Exception e) {
            e.printStackTrace();
            result.setStatus(false);
            result.setMsg("编辑失败");
        }
        return result;
    }



}
