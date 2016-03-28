package com.woowahan.riders.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by justicehoop on 2016. 3. 28..
 */
@Entity
public class HelloEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;

    private HelloEntity() { }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public static HelloEntity of(String name) {
        HelloEntity entity = new HelloEntity();
        entity.name = name;
        entity.createdDate = new Date();
        return entity;
    }
}