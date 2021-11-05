package JavaSessions;

public class Assignments {

	public static void main(String[] args) {
		
//Loops Assignment: 
		
		// WAP - print "I am Batman" 5 times 
		
		String p="I am Batman"; 
		
		for (int i=0;i<=4;i++)
		{
			System.out.println(p);
		}
		
//=================================================================================================
		
		//// WAP - print "I am Batman" 9 times 
		
		for (int i=0;i<=8;i++)
		{
			System.out.println(p);
		}
		
//=================================================================================================
		
		// WAP to print 10 to 1 using for, while and do-while loop
		
		for (int i=10;i>=1;i--)
		{
			System.out.println(i);
		}
		
		int i=10; 
		while (i>=1) {
		System.out.println(i);
			i=i-1; 
		}
			
		i=10; 
		
		do {
			System.out.println(i);
			i--; 
			
		} while (i>=1) ;
//============================================================================================================
		
		//Write a program in Java to print "Hello World" ten times using while loop
		
		String print= "Hello World"; 
		while (i<=10) {
			System.out.println(print);
			i=i+1; 
			
		}
		
//================================================================================================================
		
		//Write a program in Java to print 1 to 10 using while loop but quit if multiple of 7 is encountered
		// Modules and break 
		
		i=1; 
		
		while (i<=10) {
			System.out.println(i);
			
			if (i%7==0) 
			{
				break; 
			}		
			
		i++; 
		}
		
		//======================================================================================================================
		
		
		
		

		
			
		
	}
		
}
		
	


