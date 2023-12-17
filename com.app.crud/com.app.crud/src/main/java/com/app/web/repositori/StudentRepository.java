package com.app.web.repositori;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.web.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

}
