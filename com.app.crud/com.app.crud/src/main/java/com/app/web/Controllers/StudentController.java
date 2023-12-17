package com.app.web.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import com.app.web.entity.Student;
import com.app.web.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService services;
	@GetMapping({"/students","/"})
	public String studentList(Model modelo) {
		modelo.addAttribute("students", services.ListAll());
		return "students"; // retorna el Archivo HTML student
	}
	
	@GetMapping("/students/new")
	public String studentCreateform(Model modelo) {
		Student student1 = new Student();
		modelo.addAttribute("student", student1);
		return "studentCreate";
	}
	@PostMapping("/students")
	public String saveStudent(@ModelAttribute("student") Student students) {
		services.saveStudent(students);
		return "redirect:students";
	}
	@GetMapping("/student/edit/{id}")
	public String showStudentForm(@PathVariable long id, Model modelo) {
		modelo.addAttribute("Student", services.getStudentById(id));
		return "updateStudent";
	}
	
	@PostMapping("/student/{id}")
	public String updateStudent(@PathVariable long id, @ModelAttribute("student") Student student, Model modelo) {
		Student studentExists = services.getStudentById(id);
		studentExists.setID(id);
		studentExists.setName(student.getName());
		studentExists.setLasName(student.getLasName());
		studentExists.setEmail(student.getEmail());
		services.updateStudent(studentExists);
		return "redirect:/student";
	}
	
	@GetMapping("/students/{id}")
	public String deleteStudent(@PathVariable long id) {
		services.deleteStudent(id);
		return "redirect:/student";
	}
}
