package JavaSessions;

public class Assignments_Datatypes {

	public static void main(String[] args) {

		//Write a Java program to print 'Hello' on screen and then print your name on a separate line.
		System.out.println("hello");
		System.out.println("Naveen K");
		
		//=============================================================================================================
		
		//. Write a Java program to print the sum of two numbers.
		
		int a=10;
		int b=20;
		int sum=a+b; 
		//System.out.println( "sum of two mumber is " + " " +  (a+b));
		System.out.println( "sum of two mumber is " + " " +  sum);
		
		//============================================================================================================
		
		// WAP -Write a Java program to divide two numbers and print on the screen
		   int c=50;
		   int d=3;
		   float division = c/d; 
		   
		   System.out.println("division of 2 number is" + " " +  division);
		//=======================================================================
		   System.out.println(-5 + 8 * 6);
		   System.out.println((55+9) % 9);
		   System.out.println(20 + -3*5 / 8);
		   System.out.println(5 + 15 / 3 * 2 - 8 % 3);
	//================================================================================================================
		   double calc = ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)) ; 
		   System.out.println(calc);
//=============================================================================================
		   
		   //WAP - ry to concat "Hello Selenium" with a character 't'.
		   System.out.println("Hello Selenium" + "t");
//================================================================================================
		   
		   System.out.println("Your Toal amount is" + " " + (100+200+3400));
		   
		   //=========================================================================================
		   
		   byte b3 = 065;
		   System.out.println(b3);
		   
//*************************************************************************************************************
		   //CONDITIONAL OPERATORS 
		   //greatest of 3 numbers 
		   int aa=21; 
		   int bb=79;
		   int cc=87; 
		   
		   if ( aa> bb && aa> cc)
		   {
			   System.out.println("greatest number is " + " " + aa);
		   } else if(bb> cc)
		   {
			   System.out.println("greatest number is " + " " + bb);
		   } else 
		   {
			   System.out.println("greatest number is " + " " + cc);
		   }
		 
	//=============================================================================================================	   
		   
		   //WAP - Write a Java program to test a number is positive or negative.
		   
		   int check = -35;
	
		   
		   if (check > 0)
		   {
			   System.out.println("positive");
		   }
		   else 
		   {
			   System.out.println("negative");
		   }
		   
		   
	}

}
