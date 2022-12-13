package com.example.StudentDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    public void addStudentName(String name) {
        studentRepository.addStudentName(name);
    }

    public String getStudentName(student student) {
       return studentRepository.getStudentName(student);
    }
}
