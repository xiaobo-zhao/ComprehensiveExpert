package com.example.demo.controller;

import com.example.demo.pojo.SCampus;
import com.example.demo.service.SCampusService;
import com.example.demo.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName : SCHController  //类名
 * @Description :   //描述
 * @Author : cy //作者
 * @Date: 2022/11/21  19:09
 */
@RestController
@CrossOrigin
public class SCController {
    @Autowired
    private SCampusService sCampusService;
    @Autowired
    private Result result;

    @RequestMapping("allSCampus")
    public List<SCampus> allSCampus(){
       return sCampusService.selectAllSCampus();
    }

    @RequestMapping("scampusByid")
    public SCampus scampusByid(@RequestBody SCampus sCampus){
        String sid = sCampus.getSid();
        return sCampusService.selectByIdSCampus(sid);
    }

    @RequestMapping("addSCampus")
    public Result addSCampus(@RequestBody SCampus sCampus) {
        try {
            sCampusService.addSCampus(sCampus);
            result.setMsg("添加成功！！");
        } catch (Exception e) {
            e.printStackTrace();
            result.setStatus(false);
            result.setMsg("添加失败");
        }
        return result;
    }

    @RequestMapping("deleteSCampus")
    public Result deleteSCampus(@RequestBody SCampus sCampus){
        try {
            sCampusService.deleteSCampus(sCampus);
            result.setMsg("编辑成功！！");
        } catch (Exception e) {
            e.printStackTrace();
            result.setStatus(false);
            result.setMsg("编辑失败");
        }
        return result;
    }

    @RequestMapping("editSCampus")
    public Result editSCampus(@RequestBody SCampus sCampus){
        try {
            sCampusService.updateSCampus(sCampus);
            result.setMsg("编辑成功！！");
        } catch (Exception e) {
            e.printStackTrace();
            result.setStatus(false);
            result.setMsg("编辑失败");
        }
        return result;
    }

}
