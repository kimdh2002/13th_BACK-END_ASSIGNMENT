package com.acycycy.LikeLionWeek2.repository;

import com.acycycy.LikeLionWeek2.entity.HelloEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface HelloEntityRepository extends JpaRepository<HelloEntity, Long> {
    Optional<HelloEntity> findByName(String name);
}
