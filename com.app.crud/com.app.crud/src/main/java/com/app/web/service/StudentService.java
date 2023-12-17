package com.app.web.service;

import com.app.web.entity.Student;
import java.util.List;

public interface StudentService {

	public List<Student> ListAll();
	
	public Student saveStudent(Student student);
	
	public Student getStudentById(long id);
	
	public Student updateStudent(Student student);
	
	public void deleteStudent(long id);
}
