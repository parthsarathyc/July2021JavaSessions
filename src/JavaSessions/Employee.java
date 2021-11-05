package JavaSessions;

public class Employee {

	
	//class variables - will be common for all the objects but their values will be different. Defined above the "main" method. 
	//They are also called global variables 
	//class properties 
			String name;   // dont assign values here such as String name="Tom" as then the name will be common for the class. 
			               // can be accessed with object .  
			int age;
			double salary;
			boolean isActive; 

	public static void main(String[] args) {
	
		String name = "peter" ; // local variables 
		System.out.println(name);  // output -> peter. We dont need any object ref to call it as it is not a part of the object. 
		
		Employee e1= new Employee(); 
		e1.age=11;
		e1.salary=30.00;
		e1.name="tom";
		e1.isActive=true; 
		
		System.out.println(e1.age);
		System.out.println(e1.salary);
		System.out.println(	e1.name);  // this will always access the class properties and not the local variable 
		System.out.println(e1.isActive);
		//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	// 	new object creation. This object will create a Xerox of the variables and send them to the new object
		Employee e2= new Employee(); // this object takes the class properties 
		e2.name="tom";
		e2.isActive=true; 
		 
		System.out.println(e1.name +" " + e2.age + " " + e2.salary + " " + e2.isActive  ); // able to access all the class properties 
		
		new Employee().age= 10 ; // object created without ferance 
		
		Employee e5= new Employee(); 
		e5=null; 
		System.out.println(e5.name); // output will be "NullPointerException" as e5 (object reference) is now pointing to null. 
		
		System.gc();  // calls the garbage collector and destroys the object highlighted. 
		
		
		
	}

}
