package com.ecs.quizapp.services;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecs.quizapp.model.Page1Data;
import com.ecs.quizapp.model.Page2Data;
import com.ecs.quizapp.model.Student;
import com.ecs.quizapp.repository.Page1Repository;
import com.ecs.quizapp.repository.Page2Repository;
import com.ecs.quizapp.repository.StudentRepository;

@Service
public class ResultCalculatorService {

	private StudentRepository studentRepository;
	private Page1Repository page1Repository;
	private Page2Repository page2Repository;

	@Autowired
	public ResultCalculatorService(StudentRepository mainRepository,Page1Repository page1Repository,Page2Repository page2Repository) {
		this.studentRepository=mainRepository;
		this.page1Repository=page1Repository;
		this.page2Repository=page2Repository;
	}

	public Optional<Student> getResult()
	{
		int winnerId=0;
		int correct=0,total=0;

		List<List> pageList = Arrays.asList(page1Repository.findAll(),page2Repository.findAll());       

		for(List pages : pageList)
		{
			for(Object page : pages)
			{
				if(page instanceof Page1Data)
				{
					if(((Page1Data) page).getGeography().equals("Canberra"))
						correct++;
					if(((Page1Data) page).getHistory().equals("Margaret Thatcher"))
						correct++;
					if(((Page1Data) page).getLiterature().equals("Harper Lee"))
						correct++;
					if(((Page1Data) page).getScience().equals("Au"))
						correct++;
					if(((Page1Data) page).getMathematics().equals("3.14"))
						correct++;
					
					if(correct > total)
					{
						total=correct;
						winnerId=((Page1Data) page).getStudent().getRegNo();
					}
				}
				if(page instanceof Page2Data)
				{
					if(((Page2Data) page).getBiology().equals("Stapes"))
						correct++;
					if(((Page2Data) page).getMovies().equals("Avengers: Endgame"))
						correct++;
					if(((Page2Data) page).getMusic().equals("Pink Floyd"))
						correct++;
					if(((Page2Data) page).getSports().equals("1896"))
						correct++;
					if(((Page2Data) page).getTechnology().equals("Bill Gates"))
						correct++;
					
					if(correct > total)
					{
						total=correct;
						winnerId=((Page2Data) page).getStudent().getRegNo();
					}
				}
			
			}
		}
		return studentRepository.findById(winnerId);
	}
}

