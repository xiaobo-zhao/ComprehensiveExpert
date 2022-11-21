package com.example.demo.service.Impl;

import com.example.demo.mapper.student.SCampusMapper;
import com.example.demo.pojo.SCampus;
import com.example.demo.service.SCampusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName : SCampusServiceImpl  //类名
 * @Description :   //描述
 * @Author : cy //作者
 * @Date: 2022/11/21  18:29
 */
@Service
public class SCampusServiceImpl implements SCampusService {

    @Autowired
    private SCampusMapper sCampusMapper;

    @Override
    public void addSCampus(SCampus sCampus) {
        sCampusMapper.add(sCampus);
    }

    @Override
    public void deleteSCampus(SCampus sCampus) {
        sCampusMapper.delete(sCampus);
    }

    @Override
    public void updateSCampus(SCampus sCampus) {
        sCampusMapper.update(sCampus);
    }

    @Override
    public SCampus selectByIdSCampus(String sid) {
        return sCampusMapper.selectById(sid);
    }

    @Override
    public List<SCampus> selectAllSCampus() {
        return sCampusMapper.selectAll();
    }
}
