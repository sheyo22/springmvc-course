package org.example.service;

import org.example.domain.Student;

import java.util.List;

public interface StudentService {
    int addStudent(Student student);
    Student findStudent(int id);
    List<Student> findAllStudents();
}
