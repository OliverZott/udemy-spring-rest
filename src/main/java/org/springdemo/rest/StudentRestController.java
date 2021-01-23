package org.springdemo.rest;

import org.springdemo.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    private final List<Student> students = new ArrayList<>();

    @PostConstruct
    public void loadData() {
        students.add(new Student("vn1", "vn1"));
        students.add(new Student("vn2", "vn2"));
        students.add(new Student("vn3", "vn3"));
    }


    @GetMapping("/students")
    public List<Student> getStudents() {
        return students;
    }


    @GetMapping("/student/{studentId}")
    public Student getStudent(@PathVariable int studentId) {
        return students.get(studentId);
    }

}
