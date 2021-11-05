package JavaSessions;

public class Staticmethids {
	
	
	public static void sendmail () { //Static method 
		  
		System.out.println("send mail");
	}
	
	public  void getmail () { // non static method 
		  
		System.out.println("get mail");
	}
	
	public static void main(String[] args) {
		  
		Staticmethids obj = new Staticmethids(); 
		obj.sendmail();  
		//. Object will be created in the stack and called by obj. Photocopy of getmail will be created in the object
		// non static methods can be called via objects
		//*********************************************************************************************
		
		// To call static method.
		
		Staticmethids.sendmail();  // called using class name 
		
		sendmail(); // can be called directly 
		
		obj.getmail(); // can be called with obj reference but not a recommended method. 
		
	}

}
