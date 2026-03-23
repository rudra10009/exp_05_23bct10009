package com.example.studentapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.example.studentapi.entity.Student;
import com.example.studentapi.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService service;

    @GetMapping
    public List<Student> getAllStudents() {
        return service.getAll();
    }

    @PostMapping
    public Student addStudent(@RequestBody Student s) {
        return service.save(s);
    }
}