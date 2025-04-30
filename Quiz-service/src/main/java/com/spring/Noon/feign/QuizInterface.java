package com.spring.Noon.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.Noon.model.QuestionWrapper;
import com.spring.Noon.model.Response;

@FeignClient("question-service")
public interface QuizInterface {
	
	@GetMapping("generate")
	public ResponseEntity<List<Integer>> getQuesForQuiz(@RequestParam String categoryName,@RequestParam Integer numQ);
	
	@PostMapping("getQuestion")
	public ResponseEntity<List<QuestionWrapper>> getQuestionsFromId(@RequestBody List<Integer> questionIds);
	
	@PostMapping("getScore")
	public ResponseEntity<Integer> getScore(@RequestBody List<Response> response);

}
