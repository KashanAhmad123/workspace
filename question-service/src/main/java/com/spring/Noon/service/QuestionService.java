package com.spring.Noon.service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.spring.Noon.Dao.QuestionDao;
import com.spring.Noon.model.Question;
import com.spring.Noon.model.QuestionWrapper;
import com.spring.Noon.model.Response;

@Service
public class QuestionService {
	
	@Autowired
	QuestionDao questionDao;

	public ResponseEntity<List<Question>>getallQuestion() {
		try {
			return new ResponseEntity<List<Question>>(questionDao.findAll(),HttpStatus.OK);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return new ResponseEntity<List<Question>>(questionDao.findAll(),HttpStatus.BAD_REQUEST);
	}

	public List<Question> getQuestionsByCategory(String category) {
		return questionDao.findByCategory(category);
	}

	public String addQuestion(Question question) {
		questionDao.save(question);
		return "Success";
		
	}

	public ResponseEntity<List<Integer>> getQuestionForQuiz(String categoryName, Integer numQ) {
		List<Integer> questions= questionDao.findRandomQuestionsByCategory(categoryName,numQ);
		 return new ResponseEntity<>(questions,HttpStatus.OK);
	}

	public ResponseEntity<List<QuestionWrapper>> getQuestionsFromId(List<Integer> questionIds) {
		List<QuestionWrapper> wrappers= new ArrayList<>();
		List<Question> questions= new ArrayList<>();
		for(Integer id: questionIds) {
			questions.add(questionDao.findById(id).get());
		}
		
		for(Question question:questions) {
			QuestionWrapper wrapper= new QuestionWrapper();
			wrapper.setId(question.getId());
			wrapper.setQuestionTitle(question.getQuestionTitle());;
			wrapper.setOption1(question.getOption1());
			wrapper.setOption2(question.getOption2());
			wrapper.setOption3(question.getOption3());
			wrapper.setOption4(question.getOption4());
			wrappers.add(wrapper);
		}
		return new ResponseEntity<>(wrappers,HttpStatus.OK);
	}

	public ResponseEntity<Integer> getScore(List<Response> response) {
		
		int right=0;
		for(Response respond:response) {
			Question question= questionDao.findById(respond.getId()).get();
			if(respond.getResponse().equals(question.getRightAnswer()))
			right++;
			
		}
		
		return new ResponseEntity<>(right,HttpStatus.OK);
	}
	
	
	

}
