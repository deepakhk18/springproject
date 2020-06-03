package com.example.demospringbootdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demospringbootdemo.service.SurveyService;
import com.example.demospringdemo.model.Question;

@RestController
public class SurveyController {
	
	
	@Autowired
	private SurveyService surveyService;
	
	@GetMapping("/surveys/{surveysId}/questions")
	public List<Question>retrieveQuestion(@PathVariable String surveyId) {
		return surveyService.retrieveQuestions(surveyId);
			
		}
	@GetMapping("/surveys/{surveyId}/questions/{questionId}")
	public Question retrieveDetailsForQuestion(@PathVariable String surveyId,@PathVariable String questionId) {
		
		return surveyService.retrieveQuestion(surveyId, questionId);
	}
		
	}
			


