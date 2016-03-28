package com.woowahan.riders.agent.batch.web.restcontroller;

import com.woowahan.riders.agent.batch.service.HelloService;
import com.woowahan.riders.domain.HelloEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by justicehoop on 2016. 3. 28..
 */
@RestController
@RequestMapping(value = "")
public class HelloController {

    @Autowired
    private HelloService helloService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<HelloEntity> list() {
        return helloService.findAll();
    }
}
