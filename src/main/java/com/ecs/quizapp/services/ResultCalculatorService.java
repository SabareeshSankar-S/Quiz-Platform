package com.ecs.quizapp.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.ecs.quizapp.model.Page1Data;
import com.ecs.quizapp.model.Page2Data;
import com.ecs.quizapp.repository.Page1Repository;
import com.ecs.quizapp.repository.Page2Repository;

@Service
public class ResultCalculatorService {

	
	private Page1Repository page1Repository;
	private Page2Repository page2Repository;
	private Page1Data page1Data;
	private Page2Data page2Data;
	
	public Page1Data getPage1Data() {
		return page1Data;
	}
	public void setPage1Data(Page1Data page1Data) {
		this.page1Data = page1Data;
	}
	public Page2Data getPage2Data() {
		return page2Data;
	}
	public void setPage2Data(Page2Data page2Data) {
		this.page2Data = page2Data;
	}

	@Autowired
	public ResultCalculatorService(Page1Repository page1Repository,Page2Repository page2Repository,@ModelAttribute Page1Data page1Data,@ModelAttribute Page2Data page2Data) {
		this.page1Repository=page1Repository;
		this.page2Repository=page2Repository;	
	}

	public int getResult()
	{
		int maxScore1 = Integer.MIN_VALUE;
		int maxScore2 = Integer.MIN_VALUE;
		int totalScore=0;

		List<Page1Data> page1DataList = page1Repository.findAll();
		List<Page2Data> page2DataList = page2Repository.findAll();

		for (Page1Data page1Data : page1DataList) {
			int score1 = calculateScore(page1Data);
			if (score1 > maxScore1)
				maxScore1 = score1;

		}

		for (Page2Data page2Data : page2DataList) {
			int score2 = calculateScore(page2Data);
			if (score2 > maxScore2)
				maxScore2 = score2;  
			
		}
		totalScore=maxScore1+maxScore2;
		return totalScore;
	}

	private int calculateScore(Page1Data page1Data) {
		int score = 0;
		if ("Canberra".equals(page1Data.getGeography())) score++;
		if ("Margaret Thatcher".equals(page1Data.getHistory())) score++;
		if ("Harper Lee".equals(page1Data.getLiterature())) score++;
		if ("Au".equals(page1Data.getScience())) score++;
		if ("3.14".equals(page1Data.getMathematics())) score++;
		return score;
	}

	private int calculateScore(Page2Data page2Data) {
		int score = 0;
		if ("Stapes".equals(page2Data.getBiology())) score++;
		if ("Avengers: Endgame".equals(page2Data.getMovies())) score++;
		if ("Pink Floyd".equals(page2Data.getMusic())) score++;
		if ("1896".equals(page2Data.getSports())) score++;
		if ("Bill Gates".equals(page2Data.getTechnology())) score++;
		return score;
	}

	public int getMyMarks() {
		
		int score = 0;
		score += calculateScore(page1Data);
		score += calculateScore(page2Data);
		return score;
	}
}
