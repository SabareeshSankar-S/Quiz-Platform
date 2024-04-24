package com.ecs.quizapp.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ecs.quizapp.model.Page1Data;
import com.ecs.quizapp.model.Page2Data;
import com.ecs.quizapp.model.Student;
import com.ecs.quizapp.services.DataInsertionService;
import com.ecs.quizapp.services.ResultCalculatorService;

@Controller
public class MainController {
	
	@Autowired
	Student student;
	@Autowired
	Page1Data page1Data;
	@Autowired
	Page2Data page2Data;
	
	public DataInsertionService insertionService;
	public ResultCalculatorService resultService;
	@Autowired
	public MainController(DataInsertionService insertionService,ResultCalculatorService resultService) {
		this.insertionService = insertionService;
		this.resultService = resultService;
	}

	@RequestMapping("/")
	public String showWelcome() {
		return "welcomepage";
	}
	
	@RequestMapping("/login")
	public String showPage1(@ModelAttribute Student student)
	{
		this.student = new Student(student.getName(), student.getEmail(),student.getGender(),student.getRegNo());
		insertionService.insertStudent(this.student);
		return "page1";
	}
	
	@RequestMapping("/goToPage2")
	public String showPage2(@ModelAttribute Page1Data page1Data) {
		this.page1Data = new Page1Data(page1Data.getGeography(), page1Data.getHistory(), page1Data.getScience(),
				page1Data.getLiterature(), page1Data.getMathematics());
		page1Data.setStudent(student);
		insertionService.insertPage1Data(page1Data);
		return "page2";
	}
	
	@RequestMapping("/displayThankyou")
	public String showThankyou(@ModelAttribute Page2Data page2Data) {
		this.page2Data = new Page2Data(page2Data.getMusic(), page2Data.getSports(), page2Data.getTechnology(), 
				page2Data.getMovies(), page2Data.getBiology());
		page2Data.setStudent(student);
		insertionService.insertPage2Data(page2Data);
		return "thankyou";
	}
	
	@RequestMapping("/generateReports")
	public String showReports(Model model) {
		Optional<Student> result = resultService.getResult();
		
		 if (result.isPresent()) {
		        Student student = result.get();
		        model.addAttribute("student", student);
		    } else {
		        model.addAttribute("errorMessage", "No result found");
		    }
		return "report";
	}

}
