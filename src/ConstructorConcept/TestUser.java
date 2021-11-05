package ConstructorConcept;

public class TestUser {

	//Test user class is the starting point of execution. JVM will come to the main method and start the execution 
	public static void main(String[] args) {
	
		// User  u1= new User();  //compile time error as there is no default constructor defined.  
		// advantage - we cannot now create random objects. 
		// We can create object only for the respective constructor that is defined.

		
		User  u1= new User("tom", 20); //no error as we have given the right arguments and java found the 
		// respective  constructor.
		System.out.println(u1.getName()); // output - tom 
		
		// to change the name 
		User  u2= new User("jerry", 20); 
		System.out.println(u2.getName()); //output - jerry 
		
		
		// One should not create default constructor as it will allow creation of blank objects. 
		// People may create unnecessary  . 
		
		User U2= new User("pune", "sonu");
		
		//Note - Once we have  setter , getters and constructors together in a program we can have better memory utilization 
		// as we can restrict the users from making unnecessary objects
		
	}

}
