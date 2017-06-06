package poc.google.springmvc.service;

import java.util.List;

import poc.google.springmvc.model.Courses;
import poc.google.springmvc.model.Student;


public interface UserService {
	
	List<Student> findAllUsers(); 
	List<Courses> findAllCourses(); 
	
}
