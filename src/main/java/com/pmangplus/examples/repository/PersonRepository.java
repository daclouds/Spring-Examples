package com.pmangplus.examples.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pmangplus.examples.domain.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
