package FiinalizeConcept;
public class Employeee extends Student {
	
//	@Override  
//	public void finalize() {
//		System.out.println("employee - finalize method ");
//	}

	public static void main(String[] args) {
		
		Employeee e1= new Employeee(); 
		e1=null;      
	
		Student s1= new Student(); 
		s1=null; 
//		
		System.out.println("employee main method ");
		System.gc();  //parent method will be called by child class 
	
		System.out.println("end of  main method ");
		
	}

}
