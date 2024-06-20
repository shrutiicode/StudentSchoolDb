package com.SpringBootEx.SpringBootJPA.Controller;

import com.SpringBootEx.SpringBootJPA.entity.Student;
import com.SpringBootEx.SpringBootJPA.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    //save operation
    @PostMapping("/students")
    public Student saveStudent(@RequestBody Student student){
        return studentService.saveStudent(student);
    }

    //read operation
    @GetMapping("/students")
    public List<Student> fetchStudentList(){
        return studentService.fetchStudentList();
    }

    //update operation
    @PutMapping("/students/{id}")
    public Student updateStudents(@RequestBody Student student,@PathVariable("id") Long studentId){
        return studentService.updateStudent(student,studentId);
    }

    //delete operations
    @DeleteMapping("/students/{id}")
    public String deleteStudent( @PathVariable("id") Long studentId){
        studentService.deleteStudentById(studentId);
        return "deleted successfully";
    }
}
