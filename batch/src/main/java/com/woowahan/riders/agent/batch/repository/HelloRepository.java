package com.woowahan.riders.agent.batch.repository;

import com.woowahan.riders.domain.HelloEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by justicehoop on 2016. 3. 28..
 */
public interface HelloRepository extends JpaRepository<HelloEntity, Long> {
}
