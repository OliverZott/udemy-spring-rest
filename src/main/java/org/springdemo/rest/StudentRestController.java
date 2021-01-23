package org.springdemo.rest;

import org.springdemo.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    @GetMapping("/students")
    public List<Student> getStudent() {

        List<Student> students = new ArrayList<>();
        students.add(new Student("vn1", "vn1"));
        students.add(new Student("vn2", "vn2"));
        students.add(new Student("vn3", "vn3"));

        return students;
    }

}
