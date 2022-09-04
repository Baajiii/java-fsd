package com.admin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.admin.model.Questions;

@Repository
@EnableJpaRepositories
public interface QuestionRepository extends JpaRepository<Questions, Integer>{

}