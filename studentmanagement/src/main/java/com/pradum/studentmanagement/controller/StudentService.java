package com.pradum.studentmanagement.controller;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    public List<Student> getAllStudents(){
        return List.of(
                new Student(
                        "Pradum",
                        "Kumar",
                        "pradumjaiswar790@gmail.com",
                        23
                ),
                new Student(
                        "Manish",
                        "Kumar",
                        "manishkumar790@gmail.com",
                        23
                )
        );

    }

}
