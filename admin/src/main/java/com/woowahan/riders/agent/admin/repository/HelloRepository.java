package com.woowahan.riders.agent.admin.repository;

import com.woowahan.riders.agent.admin.domain.HelloEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by justicehoop on 2016. 3. 23..
 */
public interface HelloRepository extends JpaRepository<HelloEntity, Long> {
}
