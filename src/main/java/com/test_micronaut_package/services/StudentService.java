package com.test_micronaut_package.services;

import java.util.List;
import java.util.Optional;

import javax.inject.Inject;
import javax.inject.Singleton;

import com.test_micronaut_package.entity.Student;
import com.test_micronaut_package.repository.Repository;

@Singleton
public class StudentService {
	
	@Inject
	private Repository repository;
	
	public List<Student> getStudents(){
		
		return repository.findAll();	
	}
	
	public Student getStudent(int i) {
		
		return repository.findById(i).get();
		
		
	}
	
	public Student addStudent(Student student)
	{
		repository.save(student);
		return student;
	}
	
	public void deletStudent(Integer studentid) {
		
		repository.deleteById(studentid);
	}

}
