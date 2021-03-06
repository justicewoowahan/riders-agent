package com.woowahan.riders.agent.admin.web.restcontroller;

import com.woowahan.riders.agent.admin.AdminApplication;
import org.junit.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

/**
 * Created by justicehoop on 2016. 3. 23..
 */
@WebAppConfiguration
@SpringApplicationConfiguration(classes = {AdminApplication.class})
public abstract class RestApiTestBase {
    @Autowired
    protected WebApplicationContext wac;
    protected MockMvc mockMvc;

    public RestApiTestBase() {
    }

    @Before
    public void mockSetup() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
    }
}
