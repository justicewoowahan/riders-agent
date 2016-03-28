package com.woowahan.riders.agent.batch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;

/**
 * Created by justicehoop on 2016. 3. 23..
 */
@EntityScan(basePackages = "com.woowahan.riders.domain")
@SpringBootApplication
public class BatchApplication {

    public static void main(String[] args) {
        SpringApplication.run(BatchApplication.class, args);
    }
}