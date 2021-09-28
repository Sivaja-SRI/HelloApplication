package com.example.student.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.student.Model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Long>{

}
