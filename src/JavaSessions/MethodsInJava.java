package JavaSessions;

public class MethodsInJava {

	public static void main(String[] args) { /// main is method so we cannot create methods inside the main method.
		// main methd is void as it cannot return anything . We do not use return inside
		// the main method.

		MethodsInJava obj = new MethodsInJava(); // object is required to call the non static methods.

		obj.test(); // output ->test method.This is called calling a method
		obj.sum(); // returns 30 from the method
		int i = obj.sum();
		System.out.println(i);
		String s= obj.getTrainername();  // this one is a better way as we can use the variable   as per our needs. 
		System.out.println(s);  // output -> get trainer name  naveen 
		System.out.println(obj.getTrainername());   //this also works but above method is better .
		
		if (s.equals("naveen"))
		{
			System.out.println("pass");
		}
		int s2=obj.add(10, 20);
		System.out.println(s2);  // output ->add method,  30 
		
		
		
	}

	// 1. no input and no return --> it is declared with void that means this method
	// cannot return anything.
	public void test() // ()-> required for declaring methods.
	{
		System.out.println("test method");
	}

	// 2. no input but some return
	public int sum() // we can start the method with void and at end of logic based on return type can change void to that correct return type --> int in this case
	{
		int a = 10; // Local variables
		int b = 20;
		int z = a + b;
		return z; // returns 30
	}

	public String getTrainername()
	 {
		 System.out.println("get trainer name ");
		 String name="naveen"; 
		 return name; 
	 }

	// 3. some input and some function 
	public int add ( int a,int b)  // give this function values 
	{
		System.out.println("add method ");
		int sum = a+b; 
		return sum; 
	}
	
	
	
}
