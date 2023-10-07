package com.dgmf.repository.impl;

import com.dgmf.repository.MyIRepository;
import org.springframework.stereotype.Repository;

@Repository
public class MyIRepositoryImpl implements MyIRepository {
    @Override
    public String hello() {
        return "Hello Repository";
    }
}
