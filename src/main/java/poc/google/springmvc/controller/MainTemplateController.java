package poc.google.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/item")
public class MainTemplateController {
	
    @RequestMapping(value="/courses")
    public String getCourseTemplate() {
    	System.out.println("***********Courses");
    	return "templates/courses";	
    }

    @RequestMapping(value="/home")
    public String getHomeTemplate() {
    	System.out.println("***********home");
    	return "templates/home";	
    }

    @RequestMapping(value="/students")
    public String getStudentsTemplate() {
    	System.out.println("***********students");
    	return "templates/students";	
    }

}

