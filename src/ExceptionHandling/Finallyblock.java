package ExceptionHandling;

public class Finallyblock {

	public static int getNum(String name) { 
	
		
		if (name.equals("Tom")) {
		
		try {
			int marks=90/2; 
			System.exit(0);//terminate the program . Finally case wnt be executed in this case 
			// will shut down JVM. 
			//This is the only way to ignore finally block 
			return marks ; 	
		}
		catch(ArithmeticException e)
		{
			return 40;  
		}
		
		finally {
		return 10; 
	
		}
		
		}else if (name.equals("Ravi")) {
			return 100;
		
		}else
		{
			return 50;
		}
	}

	public static void main(String[] args) {
		System.out.println(getNum("naveen"));
		
	 
//		int a=10;
//		int b=0; //changed to 0 to get exception
//		
//		System.out.println("test");
//		
//		try {
//			int div= a/b; 
//		} catch (ArithmeticException e) {
//			System.out.println("ArithmeticException is coming");
//			
//		}  
//		finally {  // exception coming or not finally block will be always executed
//			System.out.println("end.......");
//		}
//	

	}

}
