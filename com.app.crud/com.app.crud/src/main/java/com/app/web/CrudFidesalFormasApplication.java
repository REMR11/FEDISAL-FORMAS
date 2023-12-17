package com.app.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.app.web.entity.Student;
import com.app.web.repositori.StudentRepository;

@SpringBootApplication
public class CrudFidesalFormasApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(CrudFidesalFormasApplication.class, args);
	}
	@Autowired
	private StudentRepository repost;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		Student student1 = new Student("Ronald", "Mejia", "remr11@outlook.com");
//		repost.save(student1);
//		
//		Student student2 = new Student("Eduardo", "Reinosa", "ronaldmejia0211@gmail.com");
//		repost.save(student2);
	}

	
}
