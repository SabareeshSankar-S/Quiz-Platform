package com.ecs.quizapp.model;

import java.util.Random;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Component
@Entity
public class Page1Data {

	public Page1Data(String geography, String history, String science, String literature, String mathematics) {
		super();
		this.geography = geography;
		this.history = history;
		this.science = science;
		this.literature = literature;
		this.mathematics = mathematics;
	}

	@Override
	public String toString() {
		return "Page1Data [questionId=" + questionId + ", student=" + student + ", geography=" + geography
				+ ", history=" + history + ", science=" + science + ", literature=" + literature + ", mathematics="
				+ mathematics + "]";
	}

	public Page1Data() {

	}
	
	@Id
	int questionId=new Random().nextInt(100);
	@ManyToOne
	@JoinColumn(name = "student_id")
	private Student student;
	private String geography,history,science,literature,mathematics;

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}


	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getGeography() {
		return geography;
	}
	public void setGeography(String geography) {
		this.geography = geography;
	}

	public String getHistory() {
		return history;
	}
	public void setHistory(String history) {
		this.history = history;
	}

	public String getScience() {
		return science;
	}
	public void setScience(String science) {
		this.science = science;
	}

	public String getLiterature() {
		return literature;
	}
	public void setLiterature(String literature) {
		this.literature = literature;
	}

	public String getMathematics() {
		return mathematics;
	}
	public void setMathematics(String mathematics) {
		this.mathematics = mathematics;
	}

}
