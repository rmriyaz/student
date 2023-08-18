package com.example.student.student.repository;

import com.example.student.student.student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository  extends JpaRepository<student,Integer> {

}
