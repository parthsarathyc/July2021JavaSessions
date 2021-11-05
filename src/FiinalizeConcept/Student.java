package FiinalizeConcept;

public class Student {
	
	String name ="tom"; 
	
	@Override  
	public void finalize() {
		System.out.println("student - finalize method ");
	}
	


}
