package ConstructorConcept;

public class User {
	
	private String name;  // Tom will get assigned here 
	private int age; //20 will get assigned here
	private String city;
	
	public User ( String name, int age) { // this constructor behaves like a setter as it is helping to set class variables 
		//so constructor helps to achieve encapsulation. 

		 this.name=name;
		 this.age=age; 
	}
	
	// to access this we need a getter 
	
	public String getName() {  //getter -we need getter methods to access variables. 
		return name; 
	}
	
	public User (String name, String city ) // accessed by object u2. 
	{
		this.city=city;
		this.name=name; 
	}
	//Below constructors are created vis short cut (source -> generate constructor using fields)  
	public User(String name, int age, String city) {
		// super();  -> remove the super keyword. 
		this.name = name;
		this.age = age;
		this.city = city;
	}

// we should never write business logic / code inside the constructor. It should be written only in methods/functions.  

	
	
	// Testuser class will pass the parameters to above constructor and the same will be passed to global variable name and age 
	// we need to access this class not execute the class directly. So main method is defined separately. 
	//Test user class is the starting point of execution. JVM will come to the main method and start the execution 

    
	
	
	}

















