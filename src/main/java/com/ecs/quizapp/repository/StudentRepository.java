package com.ecs.quizapp.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ecs.quizapp.model.Page1Data;
import com.ecs.quizapp.model.Page2Data;
import com.ecs.quizapp.model.Student;
import com.ecs.quizapp.services.DataInsertionService;

import jakarta.persistence.EntityManager;

@Component
public interface StudentRepository extends JpaRepository<Student, Integer>{


}