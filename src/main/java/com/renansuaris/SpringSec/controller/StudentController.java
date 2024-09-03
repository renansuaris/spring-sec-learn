package com.renansuaris.SpringSec.controller;

import com.renansuaris.SpringSec.model.Student;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    private List<Student> students = new ArrayList<>(
            List.of(
                    new Student(1, "Navin", 60),
                    new Student(2, "Kiran", 65)
            ));


    @GetMapping("/students")
    public List<Student> getStudents() {
        return students;
    }


}
