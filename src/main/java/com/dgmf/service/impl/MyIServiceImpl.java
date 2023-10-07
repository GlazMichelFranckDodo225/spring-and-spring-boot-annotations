package com.dgmf.service.impl;

import com.dgmf.service.MyIService;
import org.springframework.stereotype.Service;

@Service
public class MyIServiceImpl implements MyIService {
    @Override
    public String hello() {
        return "Hello Service";
    }
}
