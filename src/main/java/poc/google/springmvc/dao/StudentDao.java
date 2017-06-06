package poc.google.springmvc.dao;

import java.util.List;
import poc.google.springmvc.model.Student;


public interface StudentDao {

	List<Student> findAllStudents();

}

