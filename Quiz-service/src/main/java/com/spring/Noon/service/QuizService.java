package com.spring.Noon.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.spring.Noon.Dao.QuizDao;
import com.spring.Noon.feign.QuizInterface;
import com.spring.Noon.model.QuestionWrapper;
import com.spring.Noon.model.Quiz;
import com.spring.Noon.model.Response;

@Service
public class QuizService {
	
	@Autowired
	QuizDao quizDao;
	
	@Autowired
	QuizInterface quizInterface;

	public ResponseEntity<String> createQuiz(String category, int numQ, String title) {
		
		List<Integer> questions= quizInterface.getQuesForQuiz(category, numQ).getBody();
		Quiz quiz= new Quiz();
		quiz.setTitle(title);
		quiz.setQuestionIds(questions);
		quizDao.save(quiz);
		return new ResponseEntity<>("Success",HttpStatus.CREATED);	
	}

	public ResponseEntity<List<QuestionWrapper>> getQuizQuestion(Integer id) {
		Quiz quiz=quizDao.findById(id).get();
		List<Integer> questionsIds= quiz.getQuestionIds();
		ResponseEntity<List<QuestionWrapper>> questions= quizInterface.getQuestionsFromId(questionsIds);
		return questions;
		
	}

	public ResponseEntity<Integer> calculateResult(Integer id, List<Response> responses) {
		ResponseEntity<Integer> score=quizInterface.getScore(responses);
		return score;
	}

}
