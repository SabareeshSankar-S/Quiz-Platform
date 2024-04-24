package com.ecs.quizapp.model;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Component
@Entity
public class Page2Data{

	public Page2Data(String music, String sports, String technology, String movies, String biology) {
		super();
		this.music = music;
		this.sports = sports;
		this.technology = technology;
		this.movies = movies;
		this.biology = biology;
	}
	
	public Page2Data() {
		
	}
	
	@Id
	int questionId=new Random().nextInt(100);
	@ManyToOne
	@JoinColumn(name = "student_id")
	private Student student;
	private String music,sports,technology,movies,biology;
	
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

	public String getMusic() {
		return music;
	}
	public void setMusic(String music) {
		this.music = music;
	}

	public String getSports() {
		return sports;
	}
	public void setSports(String sports) {
		this.sports = sports;
	}

	public String getTechnology() {
		return technology;
	}
	public void setTechnology(String technology) {
		this.technology = technology;
	}

	public String getMovies() {
		return movies;
	}
	public void setMovies(String movies) {
		this.movies = movies;
	}

	public String getBiology() {
		return biology;
	}
	public void setBiology(String biology) {
		this.biology = biology;
	}

}
