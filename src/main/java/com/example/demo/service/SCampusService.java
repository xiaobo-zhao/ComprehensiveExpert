package com.example.demo.service;

import com.example.demo.pojo.SCampus;

import java.util.List;

public interface SCampusService {

    void addSCampus(SCampus sCampus);

    void deleteSCampus(SCampus sCampus);

    void updateSCampus(SCampus sCampus);

    SCampus selectByIdSCampus(String sid);

    List<SCampus> selectAllSCampus();

}
