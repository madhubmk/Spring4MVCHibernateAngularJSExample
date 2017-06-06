package poc.google.springmvc.service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import poc.google.springmvc.dao.StudentDao;
import poc.google.springmvc.model.Courses;
import poc.google.springmvc.model.Student;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService{
	
	private static final AtomicLong counter = new AtomicLong();
	
	@Autowired
	private StudentDao dao;
	
	//private static List<Student> students;
	private static List<Courses> coursesList;
	
	static{
		//students = populateDummyUsers();
		coursesList = populateDummyCourses();
	}

	public List<Student> findAllUsers() {
		return dao.findAllStudents();
	}
	
	
	public List<Courses> findAllCourses() {
		return coursesList;
	}
	
//	private static List<Student> populateDummyUsers(){
//		List<Student> users = new ArrayList<Student>();
//		users.add(new Student(counter.incrementAndGet(),"Madhu", "Hyderabad", "madhu@abc.com"));
//		users.add(new Student(counter.incrementAndGet(),"Tomy", "ALBAMA", "tomy@abc.com"));
//		users.add(new Student(counter.incrementAndGet(),"Kelly", "UK", "kelly@abc.com"));
//		return users;
//	}

	private static List<Courses> populateDummyCourses() {
		List<Courses> course = new ArrayList<Courses>();
		course.add(new Courses(counter.incrementAndGet(),"JAVA", 1.8, "madhu@abc.com"));
		course.add(new Courses(counter.incrementAndGet(),"AngularJS", 4.1, "tomy@abc.com"));
		course.add(new Courses(counter.incrementAndGet(),"AEM", 6.1, "kelly@abc.com"));
		return course;
	}

}
