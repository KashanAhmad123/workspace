package com.spring.Noon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.Noon.model.QuestionWrapper;
import com.spring.Noon.model.QuizDto;
import com.spring.Noon.model.Response;
import com.spring.Noon.service.QuizService;


@RestController
@RequestMapping("/Quiz")
public class QuizzController {
	
	@Autowired
	QuizService quizService;
	
	@PostMapping("create")
	public ResponseEntity<String> createQuiz(@RequestParam String category, @RequestBody QuizDto Dto){
		return quizService.createQuiz(Dto.getCategoryName(),Dto.getNumQuestion(),Dto.getTitle());
	}
	
	@GetMapping("get/{id}")
	public ResponseEntity<List<QuestionWrapper>> getQuizQuestion(@PathVariable Integer id){
		
		return quizService.getQuizQuestion(id);
	}
	
	@PostMapping("submit")
	public ResponseEntity<Integer> submitQuiz(@PathVariable Integer id, @RequestBody List<Response> responses){
		return quizService.calculateResult(id,responses);
		
	}

}
