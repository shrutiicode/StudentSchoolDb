package com.SpringBootEx.SpringBootJPA.repository;

import com.SpringBootEx.SpringBootJPA.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {

 //   void delete(Long studentId);
}
