package poc.google.springmvc.model;

public class Courses {
	
	private long id;
	private String courseName;
	private double version;
	private String email;
	
	
	public Courses(){
		id=0;
	}
	
	public Courses(long id, String courseName, double version, String email){
		this.id = id;
		this.courseName = courseName;
		this.version = version;
		this.email = email;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public double getVersion() {
		return version;
	}
	public void setVersion(double version) {
		this.version = version;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
