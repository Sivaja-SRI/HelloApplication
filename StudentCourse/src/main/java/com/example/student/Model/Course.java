package com.example.student.Model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnore;
@XmlRootElement
@Entity
public class Course {
	@Id
	private String CourseId;
	private String Name;
	private int Duration;
	@ManyToMany(mappedBy = "courses")
	private List<Student>students =new ArrayList<Student>();
	
	public Course() {
		super();
	}

	public Course(String courseId, String name, int duration, List<Student> students) {
		super();
		CourseId = courseId;
		Name = name;
		Duration = duration;
		this.students = students;
	}

	public String getCourseId() {
		return CourseId;
	}

	public void setCourseId(String courseId) {
		CourseId = courseId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getDuration() {
		return Duration;
	}

	public void setDuration(int duration) {
		Duration = duration;
	}
	@JsonIgnore
	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}
}
