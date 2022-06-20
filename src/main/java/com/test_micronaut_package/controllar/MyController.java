package com.test_micronaut_package.controllar;

import java.sql.SQLException;
import java.util.List;

import javax.inject.Inject;

import com.test_micronaut_package.entity.Student;
import com.test_micronaut_package.services.StudentService;

import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Delete;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;
import io.micronaut.http.annotation.Post;

@Controller
public class MyController {
	
	@Inject
	private StudentService service;
	
	@Get("/student")
	 public List<Student> getStudents() throws ClassNotFoundException, SQLException
	{
		return this.service.getStudents();
	}
	
	@Get("/student/{studentid}")
	public Student getStudent(@PathVariable String studentid ) throws NumberFormatException, ClassNotFoundException, SQLException
	{
		return this.service.getStudent(Integer.parseInt(studentid));
		
	}
	@Post("/student")
	public Student addStudent(@Body Student student) throws ClassNotFoundException, SQLException
	{
		return this.service.addStudent(student);
	}
	
	@Delete("student/{studentid}")
	public void deletestudent(@PathVariable String studentid) 
	{
		this.service.deletStudent(Integer.parseInt(studentid));
	}
}
