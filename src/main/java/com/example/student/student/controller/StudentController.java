package com.example.student.student.controller;

import com.example.student.student.StudentService;
import com.example.student.student.student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
     @Autowired
     private StudentService bs;
    @PostMapping ("/students")
    private  ResponseEntity<student> saveStudent(@RequestBody student b){
        return ResponseEntity.ok().body(this.bs.addStudent(b));
    }
}
