package com.ecs.quizapp.model;

import java.util.Random;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Component
@Entity
public class Student{

	private String name;
	@Id
	private int regNo;
	private String email;
	private String gender;
	private int score;
	
	public Student() {

	}
	
	public Student(String name, String email, String gender, int regNo) {
		super();
		this.name = name;
		this.email = email;
		this.gender = gender;
		this.regNo = regNo;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRegNo() {
		return regNo;
	}
	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	

}
