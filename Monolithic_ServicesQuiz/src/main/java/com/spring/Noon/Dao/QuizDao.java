package com.spring.Noon.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.Noon.model.Quiz;

@Repository
public interface QuizDao extends JpaRepository<Quiz,Integer> {

}
