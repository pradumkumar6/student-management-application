package com.pradum.studentmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {
    private StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    @PostMapping
    public Student save(
            @RequestBody Student student
    ){
        return  studentService.save(student);
    }
    @GetMapping("/{email}")
    public Student findByEmail(
            @PathVariable("email") String email
    ){
        return  studentService.findByEmail(email);
    }
    @PutMapping
    public Student updateStudent(
           @RequestBody Student student
    ){
        return  studentService.update(student);
    }
    @DeleteMapping("/{email}")
    public void delete(
           @PathVariable("email") String email
    ){
        studentService.delete(email);
    }
    @GetMapping
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }
}
