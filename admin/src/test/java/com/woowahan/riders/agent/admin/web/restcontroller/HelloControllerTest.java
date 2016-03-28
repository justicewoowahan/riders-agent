package com.woowahan.riders.agent.admin.web.restcontroller;

import com.woowahan.riders.agent.admin.domain.HelloEntity;
import com.woowahan.riders.agent.admin.repository.HelloRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;

import static org.hamcrest.Matchers.hasSize;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


/**
 * Created by justicehoop on 2016. 3. 23..
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@Transactional
public class HelloControllerTest extends RestApiTestBase {

    @Autowired
    private HelloRepository helloRepository;

    @Before
    public void setup() {
        for (int i = 0; i < 10; i++) {
            HelloEntity entity = HelloEntity.of(String.format("hello%d", i));
            helloRepository.save(entity);
        }
    }

    @Test
    public void testList() throws Exception {
        //when
        mockMvc.perform(get("/"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(10)));
        ;

    }

}