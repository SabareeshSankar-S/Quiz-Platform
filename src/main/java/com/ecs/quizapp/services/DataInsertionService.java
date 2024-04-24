package com.ecs.quizapp.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.ecs.quizapp.model.Page1Data;
import com.ecs.quizapp.model.Page2Data;
import com.ecs.quizapp.model.Student;
import com.ecs.quizapp.repository.Page1Repository;
import com.ecs.quizapp.repository.Page2Repository;
import com.ecs.quizapp.repository.StudentRepository;

@Service
public class DataInsertionService {

	private StudentRepository studentRepository;
	private Page1Repository page1Repository;
	private Page2Repository page2Repository;
	
	@Autowired
	public DataInsertionService(StudentRepository mainRepository,Page1Repository page1Repository,Page2Repository page2Repository) {
		this.studentRepository=mainRepository;
		this.page1Repository=page1Repository;
		this.page2Repository=page2Repository;
	}

	public DataInsertionService() {
		
	}

	public void insertStudent(Student student) {
		studentRepository.save(student);
	}
	
	public void insertPage1Data(Page1Data page1Data) {
		page1Repository.save(page1Data);
	}
	
	public void insertPage2Data(Page2Data page2Data) {
		page2Repository.save(page2Data);
	}

}