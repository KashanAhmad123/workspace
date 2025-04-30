 package com.spring.Noon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.Noon.model.Question;
import com.spring.Noon.model.QuestionWrapper;
import com.spring.Noon.model.Response;
import com.spring.Noon.service.QuestionService;

@RestController
@RequestMapping("/Questions")
 public class QuestionController {
	
	@Autowired
	QuestionService quesService; 
	
	@Autowired
	Environment env; // Use to make class usuable for load balancing
	
	@GetMapping("/allQuestions")
	public ResponseEntity<List<Question>> getAllQuestion() {
		return quesService.getallQuestion();
	}
	
	@GetMapping("category/{category}")
	public List<Question> getByCategory(@PathVariable String category){
		return quesService.getQuestionsByCategory(category);
	}
	
	@PostMapping("addques/")
	public String addQuestion(@RequestBody Question question) {	
	 
		return quesService.addQuestion(question);
	}
	
	@GetMapping("generate")
	public ResponseEntity<List<Integer>> getQuesForQuiz(@RequestParam String categoryName,@RequestParam Integer numQ){
		return quesService.getQuestionForQuiz(categoryName,numQ);
	}
	
	@PostMapping("getQuestion")
	public ResponseEntity<List<QuestionWrapper>> getQuestionsFromId(@RequestBody List<Integer> questionIds){
		System.out.println(env.getProperty("local.server.port"));
		
		return quesService.getQuestionsFromId(questionIds);
	}
	
	@PostMapping("getScore")
	public ResponseEntity<Integer> getScore(@RequestBody List<Response> response){
		
		return quesService.getScore(response);
		
	}
	

}
