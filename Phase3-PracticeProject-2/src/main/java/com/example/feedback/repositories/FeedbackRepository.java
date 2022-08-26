package com.example.feedback.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.feedback.entities.Feedback;

public interface FeedbackRepository extends CrudRepository<Feedback, Integer> {

}
