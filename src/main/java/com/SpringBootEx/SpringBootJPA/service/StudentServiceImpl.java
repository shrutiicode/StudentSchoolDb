package com.SpringBootEx.SpringBootJPA.service;

import com.SpringBootEx.SpringBootJPA.entity.Student;
import com.SpringBootEx.SpringBootJPA.repository.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

import static java.lang.Object.*;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentRepository studentRepository;

    //save operation
    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    //read operation
    @Override
    public List<Student> fetchStudentList() {
        return (List<Student>)studentRepository.findAll();
    }

    //update operation
    @Override
    public Student updateStudent(Student student, Long studentId) {

        Student studDB
                = studentRepository.findById(studentId).get();


        if (Objects.nonNull(
                student.getEmailId())
                && !"".equalsIgnoreCase(
                student.getEmailId())) {
            studDB.setEmailId(
                    student.getEmailId());
            studDB.setFirstName(student.getFirstName());
            studDB.setLastName(student.getLastName());
            studDB.setGuardianName(student.getGuardianName());
            studDB.setGuardianEmail(student.getGuardianEmail());
            studDB.setGuardianMobile(student.getGuardianMobile());

        }

        return studentRepository.save(studDB);
    }

    //delete operation
    @Override
    public void deleteStudentById(Long student) {
        studentRepository.deleteById(student);
    }
}
