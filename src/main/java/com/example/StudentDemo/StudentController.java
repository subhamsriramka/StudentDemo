package com.example.StudentDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;

    @PostMapping("/name")
    public ResponseEntity addStudentName(@RequestParam("name") String name) {
        studentService.addStudentName(name);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/get_studentName")
    public ResponseEntity<String> getStudentName(@RequestBody() student student) {
        return new ResponseEntity<>(studentService.getStudentName(student), HttpStatus.ACCEPTED);
    }
}
