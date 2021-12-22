package org.example.dao;

import org.example.domain.Student;

import java.util.List;

public interface StudentDao {
    int insertStudent(Student student);
    Student selectStudent(int id);
    List<Student> selectAllStudents();
}
