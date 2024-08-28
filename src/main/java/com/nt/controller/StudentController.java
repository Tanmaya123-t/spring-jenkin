package com.nt.controller;

import com.nt.entity.Student;
import com.nt.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/getDetails")
    public ResponseEntity<Student> fetchTheDetails(){
        Student response = studentService.getStudentDetails();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
