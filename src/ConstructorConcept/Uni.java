package ConstructorConcept;

import java.util.ArrayList;



public class Uni {

	private String name; 
	private String hq;
	private ArrayList<String>courseList;
	
	// class should e a template and data should be provided by the user 
	
	public Uni(String name, String hq, ArrayList<String> courseList) {
		// super();
		this.name = name;
		this.hq = hq;
		this.courseList = courseList;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHq() {
		return hq;
	}

	public void setHq(String hq) {
		this.hq = hq;
	}

	public ArrayList<String> getCourseList() {
		return courseList;
	}

	public void setCourseList(ArrayList courseList) {
		this.courseList = (ArrayList<String>) courseList;
	} 
	
	
	
	
	
}
