package com.pmangplus.examples.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

import com.pmangplus.examples.domain.Person;

public interface PersonRepository extends JpaRepository<Person, Long>, QueryDslPredicateExecutor<Person> {
}
