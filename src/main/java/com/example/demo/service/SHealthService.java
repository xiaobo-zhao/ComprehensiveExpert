package com.example.demo.service;

import com.example.demo.pojo.SHealth;

import java.util.List;

public interface SHealthService {

    void addSHealth(SHealth sHealth);

    void deleteSHealth(SHealth sHealth);

    void updateSHealth(SHealth sHealth);

    SHealth selectByIdSHealth(String sid);

    List<SHealth> selectAllSHealth();

}
