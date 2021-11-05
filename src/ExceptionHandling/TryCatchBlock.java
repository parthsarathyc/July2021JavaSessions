package ExceptionHandling;

public class TryCatchBlock {
     
	String name ="selenium"; // class level declaration 
	public static void main(String[] args) {
	
		int a=10;
		int b=0; 
		
		System.out.println("a");
		System.out.println("a");
		System.out.println("a");
		
		try {    
		
			int i=a/b;  
			TryCatchBlock obj=null; 
			System.out.println(obj.name); 
		}   
		catch (Throwable e){   //able to catch the exception.
			
			System.out.println("ArithmeticException is coming"); 
			
			e.printStackTrace(); 
		}
		
//		catch (NullPointerException e){  
//			
//			System.out.println("NullPointerException is coming"); 
//			
//			e.printStackTrace(); 
//		}
		
		System.out.println("b");
		System.out.println("b");
		System.out.println("b");
		
		
		
		

	}

}
