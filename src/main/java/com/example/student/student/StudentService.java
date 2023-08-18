package com.example.student.student;

import com.example.student.student.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service public class StudentService {
    @Autowired private StudentRepository br;
    public student addStudent(student S){
        return this.br.save(S);
    }
}
