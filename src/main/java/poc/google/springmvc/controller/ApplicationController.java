package poc.google.springmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import poc.google.springmvc.model.Courses;
import poc.google.springmvc.model.Student;
import poc.google.springmvc.service.UserService;

@RestController
public class ApplicationController {

	@Autowired
	UserService userService;  //Service which will do all data retrieval/manipulation work


	//-------------------Retrieve All Users--------------------------------------------------------

	@RequestMapping(value = "/studentslist", method = RequestMethod.GET)
	public ResponseEntity<List<Student>> listAllUsers() {
		List<Student> users = userService.findAllUsers();
		if(users.isEmpty()){
			return new ResponseEntity<List<Student>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
		}
		return new ResponseEntity<List<Student>>(users, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/courseslist", method = RequestMethod.GET)
	public ResponseEntity<List<Courses>> listAllCourses() {
		List<Courses> course = userService.findAllCourses();
		if(course.isEmpty()){
			return new ResponseEntity<List<Courses>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
		}
		return new ResponseEntity<List<Courses>>(course, HttpStatus.OK);
	}

}