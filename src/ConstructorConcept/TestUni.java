package ConstructorConcept;

import java.util.ArrayList;



public class TestUni {

	public static void main(String[] args) {
		
		
		ArrayList<String> courselist1= new ArrayList<String>(); 
		courselist1.add("physics"); 
		courselist1.add("chem"); 
		courselist1.add("maths"); 
		
		Uni u1= new Uni("Delhi Uni", "new delhi", courselist1); 
		
		
		System.out.println(u1.getHq() + " " + u1.getName()); // output - new delhi Delhi Uni
		System.out.println(u1.getCourseList());// output -[physics, chem, maths]

		u1.setHq("pune");  //Setting new HQ 
		
		
		System.out.println(u1.getHq()); //output - pune

		
		
	}

}
