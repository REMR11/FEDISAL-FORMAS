package com.app.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.app.web.repositori.StudentRepository;
import com.app.web.entity.Student;

@Service
public class StudentServiceImplements implements StudentService {
	@Autowired
	private StudentRepository repost;

	@Override
	public List<Student> ListAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return repost.save(student);
	}

	@Override
	public Student getStudentById(long id) {
		// TODO Auto-generated method stub
		return repost.findById(id).get();
	}

	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method st ub
		return repost.save(student);
	}

	@Override
	public void deleteStudent(long id) {
		// TODO Auto-generated method stub
		repost.deleteById(id);
	}

}
