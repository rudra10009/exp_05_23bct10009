package com.example.studentapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.example.studentapi.entity.Student;
import com.example.studentapi.repository.StudentRepo;

@Service
public class StudentService {

    @Autowired
    private StudentRepo repo;

    public List<Student> getAll() {
        return repo.findAll();
    }

    public Student save(Student s) {
        return repo.save(s);
    }
}