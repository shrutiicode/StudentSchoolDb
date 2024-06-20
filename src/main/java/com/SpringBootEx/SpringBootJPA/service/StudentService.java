package com.SpringBootEx.SpringBootJPA.service;
import com.SpringBootEx.SpringBootJPA.entity.Student;

import java.util.List;

public interface StudentService {

    Student saveStudent(Student student);

    // Read operation
    List<Student> fetchStudentList();

    // Update operation
    Student updateStudent(Student student,
                                Long studentId);

    // Delete operation
    void deleteStudentById(Long studentId);


}
