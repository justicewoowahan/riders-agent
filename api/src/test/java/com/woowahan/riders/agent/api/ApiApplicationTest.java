package com.woowahan.riders.agent.api;

import com.woowahan.riders.agent.api.service.HelloService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import static org.junit.Assert.*;

/**
 * Created by justicehoop on 2016. 3. 23..
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ApiApplication.class)
@WebAppConfiguration
public class ApiApplicationTest {

    @Autowired
    ApplicationContext applicationContext;

    @Test
    public void contextLoads() {
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }

        HelloService helloService = applicationContext.getBean("helloService", HelloService.class);
        assertNotNull(helloService);
    }

}