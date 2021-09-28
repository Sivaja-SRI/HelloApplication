package com.example.student.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.student.Model.Course;

@Repository
public interface CourseRepo extends JpaRepository<Course, String>{

}
