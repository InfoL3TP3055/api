package com.API.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;/*
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;*/
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
/*
import com.API.java.Entities.Bailleur;
import com.API.java.Entities.Locataire;
import com.API.java.Entities.User;
import com.API.java.metier.IUserMetier;
import com.API.java.repository.BailleurRepository;
import com.API.java.repository.LocataireRepository;

import com.API.java.repository.IUserRepository;
*/
@Repository
@EnableJpaRepositories
@SpringBootApplication
public class ApiJava1Application {

	public static void main(String[] args) {
		SpringApplication.run(ApiJava1Application.class, args);
	}
}
