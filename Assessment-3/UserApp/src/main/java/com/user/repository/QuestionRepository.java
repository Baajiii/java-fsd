package com.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.user.model.Questions;

@Repository
@EnableJpaRepositories
public interface QuestionRepository extends JpaRepository<Questions, Integer>{

}