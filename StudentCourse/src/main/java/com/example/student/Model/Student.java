package com.example.student.Model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnore;
@XmlRootElement
@Entity
public class Student {
	@Id
	private long StudentId;
	private String Name;
	private String Institute;
	@ManyToMany
	@JoinTable(name = "student_course",joinColumns = {@JoinColumn(name="Student_Id",referencedColumnName="StudentId")},inverseJoinColumns =  {@JoinColumn(name="Course_Id",referencedColumnName="CourseId")})
	private List<Course>courses=new ArrayList<Course>();
	
	public Student() {
		super();
	}

	public Student(long studentId, String name, String institute, List<Course> courses) {
		super();
		StudentId = studentId;
		Name = name;
		Institute = institute;
		this.courses = courses;
	}

	public long getStudentId() {
		return StudentId;
	}

	public void setStudentId(long studentId) {
		StudentId = studentId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getInstitute() {
		return Institute;
	}

	public void setInstitute(String institute) {
		Institute = institute;
	}
	@JsonIgnore
	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
}
