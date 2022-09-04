package com.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.user.model.Result;

@Repository
public interface ResultRepo extends JpaRepository<Result, Integer> {
	
}