package com.app.web.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="STUDENTS")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long ID;
	
	@Column(name="NAME", nullable = false, length = 64)
	private String Name;
	
	@Column(name = "LASTNAME", nullable = false, length = 64)
	private String LasName;
	
	@Column(name = "Email", nullable = false, length = 64)
	private String Email;

	public Student() {
		super();
	}

	public Student(long iD, String name, String lasName, String email) {
		super();
		ID = iD;
		Name = name;
		LasName = lasName;
		Email = email;
	}

	public Student( String name, String lasName, String email) {
		super();
		Name = name;
		LasName = lasName;
		Email = email;
	}
	public long getID() {
		return ID;
	}

	public void setID(long iD) {
		ID = iD;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getLasName() {
		return LasName;
	}

	public void setLasName(String lasName) {
		LasName = lasName;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	@Override
	public String toString() {
		return "Student [ID=" + ID + ", Name=" + Name + ", LasName=" + LasName + ", Email=" + Email + "]";
	}
	
}
