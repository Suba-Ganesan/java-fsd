package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entities.*;

public interface FeedbackRepository extends CrudRepository<Feedback, Integer>{

}
