package com.nt.service.Impl;

import com.nt.entity.Student;
import com.nt.service.StudentService;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    @Override
    public Student getStudentDetails() {

        return new Student("Adya",1,"Bhubaneswar");
    }
}
