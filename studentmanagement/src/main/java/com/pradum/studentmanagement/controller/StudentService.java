package com.pradum.studentmanagement.controller;

import java.util.List;


public interface StudentService {
    Student save(Student s);
    List<Student> getAllStudents();
    Student findByEmail(String email);
    Student update(Student s);
    void delete(String email);

}
