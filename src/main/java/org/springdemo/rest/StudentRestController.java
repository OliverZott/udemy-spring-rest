package org.springdemo.rest;

import org.springdemo.entity.Student;
import org.springdemo.entity.StudentErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

        if ((studentId >= students.size()) || (studentId < 0)) {
            throw new StudentNotFoundException("Student Id not found: " + studentId);
        }

        return students.get(studentId);
    }


    @ExceptionHandler
    public ResponseEntity<StudentErrorResponse> handleException(StudentNotFoundException exc) {

        StudentErrorResponse error = new StudentErrorResponse();

        error.setStatus(HttpStatus.NOT_FOUND.value());
        error.setMessage(exc.getMessage());
        error.setTimesStamp(System.currentTimeMillis());

        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<StudentErrorResponse> handleException(Exception exc) {

        StudentErrorResponse error = new StudentErrorResponse();

        error.setStatus(HttpStatus.BAD_REQUEST.value());
        error.setMessage(exc.getMessage());
        error.setTimesStamp(System.currentTimeMillis());

        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }

}
