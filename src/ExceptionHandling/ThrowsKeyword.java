package ExceptionHandling;

public class ThrowsKeyword {

	public void m1()  {

		m2();
	}

	public void m2()  {

		m3();
	}

	public void m3() { 
		try {      // handle the exception with try catch block 
		int a=9/0; 
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException is coming ");
		}
		
	}

	public static void main(String[] args) {
		// exception should be never handled inside the main method.
		// this should be handled by the individual method only.
//main method is the user who is using the features by making the object of the class 
		//hence method should not be used to handle the exceptions 

		ThrowsKeyword obj = new ThrowsKeyword();
		obj.m1();

		System.out.println("bye.....");

	}

}
