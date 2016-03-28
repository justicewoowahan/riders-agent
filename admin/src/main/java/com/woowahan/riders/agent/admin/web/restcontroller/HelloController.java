package com.woowahan.riders.agent.admin.web.restcontroller;

import com.woowahan.riders.agent.admin.domain.HelloEntity;
import com.woowahan.riders.agent.admin.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by justicehoop on 2016. 3. 23..
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
