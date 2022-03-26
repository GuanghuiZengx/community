package com.nowcoder.community.service;

import com.nowcoder.community.Dao.Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ServiceB {
    @Autowired
    @Qualifier("dao")
    private Dao dao;
    public String sa(){
        return dao.select();
    }
}
