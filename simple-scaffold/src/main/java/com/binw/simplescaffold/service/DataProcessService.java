package com.binw.simplescaffold.service;

import com.binw.simplescaffold.mapper.DataProcessMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class DataProcessService {
    @Autowired
    DataProcessMapper dataProcessMapper;

    public List<Map<String,String>> test01(){
        return dataProcessMapper.test01();
    }

    public String test02(){
        return dataProcessMapper.test02();
    }

}
