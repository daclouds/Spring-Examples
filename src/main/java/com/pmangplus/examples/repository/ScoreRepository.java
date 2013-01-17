package com.pmangplus.examples.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

import com.pmangplus.examples.domain.Score;

public interface ScoreRepository extends JpaRepository<Score, Long>, QueryDslPredicateExecutor<Score> {
}
