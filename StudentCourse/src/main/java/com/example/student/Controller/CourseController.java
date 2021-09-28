package com.example.student.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.student.Model.Course;
import com.example.student.Repo.CourseRepo;

@RestController
@RequestMapping("/course")

public class CourseController {
	@Autowired
	CourseRepo crp;
	@GetMapping
	public List<Course> getAll(){
		return crp.findAll();
	}
	@GetMapping("/{id}")
	public Course get(@PathVariable("id") String id) {
		return crp.findById(id).get();
	}
	@PostMapping
	public void add(@RequestBody Course course) {
		crp.save(course);
	}
	@PutMapping
	public void update(@RequestBody Course course) {
		crp.save(course);
	}
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") String id) {
		crp.deleteById(id);
	}
}
	
