package poc.google.springmvc.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Hibernate;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import poc.google.springmvc.model.Student;

@Repository("studentDao")
public class StudentDaoImpl extends AbstractDao<Integer, Student> implements StudentDao {

	static final Logger logger = LoggerFactory.getLogger(StudentDaoImpl.class);
	

	@SuppressWarnings("unchecked")
	public List<Student> findAllStudents() {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("name"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.
		List<Student> students = (List<Student>) criteria.list();
		
		return students;
	}

	public void save(Student user) {
		persist(user);
	}
}
