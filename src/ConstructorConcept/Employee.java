package ConstructorConcept;

public class Employee {
	
	// try not to create methods with class names. 
	//duplicate constructors are nor allowed 
	
	public Employee()  // constructor has the same name as class name . This does  not have return type 
	{ // 0 parameter constructor -> default constructor 
		System.out.println("default const");
	}

	public Employee(int a)  //overloaded 
	{ // 1 parameter constructor 
		System.out.println("1 paramerer const" + a);
	}
	
	public Employee(int a, String b)  //overloaded 
	{ // 2 parameter constructor 
		System.out.println("2 paramerer const" + (a+b));
	}
	
	
	
	
	public static void main (String args[] )  // we should ideally write the main method in a different class. 
	{
		Employee e1= new Employee(); //default constructor will be called in this case as 
		// if we click on control and hover over  for new employee it takes me to the required constructor. 
		
		// constructor is not called by the object . We are not using any object reference to call the constructor. 
		// the moment we create the object of the class Java  will call the constructor. 

		 Employee e2= new Employee(10); //1 parameter constructor called 
		
		Employee e3= new Employee(10,"tom"); //2nd parameter constructor called 
		
		 //	Employee e3= new Employee(10,20); // error we do not have respective constructor 
	}
	 
	
}
