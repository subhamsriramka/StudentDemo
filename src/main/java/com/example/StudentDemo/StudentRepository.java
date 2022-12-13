package com.example.StudentDemo;

import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository {
    student student;
    public void addStudentName(String name) {
        student.setName(name);
    }

    public String getStudentName(student student) {
        return student.getName();
    }

}
