package com.renansuaris.SpringSec.controller;

import com.renansuaris.SpringSec.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    public List<Student> listStudents = new ArrayList<>(List.of(
            new Student(1, "Juan", 18),
            new Student(2, "Pedro", 20)
    ));

    @GetMapping("/students")
    public List<Student> getStudents() {
        return listStudents;
    }

}
