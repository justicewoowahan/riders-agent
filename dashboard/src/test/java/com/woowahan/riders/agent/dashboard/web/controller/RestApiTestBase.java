package com.woowahan.riders.agent.dashboard.web.controller;

import com.woowahan.riders.agent.dashboard.DashboardApplication;
import org.junit.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

/**
 * Created by justicehoop on 2016. 3. 28..
 */
@WebAppConfiguration
@SpringApplicationConfiguration(classes = {DashboardApplication.class})
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