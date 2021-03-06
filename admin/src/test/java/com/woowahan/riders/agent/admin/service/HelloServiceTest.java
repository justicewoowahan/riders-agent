package com.woowahan.riders.agent.admin.service;

import com.woowahan.riders.agent.admin.AdminApplication;
import com.woowahan.riders.agent.admin.domain.HelloEntity;
import com.woowahan.riders.agent.admin.repository.HelloRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.transaction.Transactional;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by justicehoop on 2016. 3. 23..
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = AdminApplication.class)
@WebAppConfiguration
@Transactional
public class HelloServiceTest {

    @Autowired
    private HelloService helloService;
    @Autowired
    private HelloRepository helloRepository;

    @Before
    public void setup() {
        for (int i = 0; i < 10; i++) {
            HelloEntity entity = HelloEntity.of(String.format("테스트 id:%d", i));
            helloRepository.save(entity);
            System.out.println(entity);
        }
    }

    @Test
    public void testFindAll() {
        List<HelloEntity> all = helloService.findAll();

        assertNotNull(all);
        assertEquals("사이즈는 10개여야 한다", 10, all.size());
    }

}