package com.woowahan.riders.agent.api.service;

import com.woowahan.riders.domain.HelloEntity;
import com.woowahan.riders.agent.api.repository.HelloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by justicehoop on 2016. 3. 23..
 */
@Service
public class HelloService {

    @Autowired
    private HelloRepository helloRepository;

    public List<HelloEntity> findAll() {
        return helloRepository.findAll();
    }
}
