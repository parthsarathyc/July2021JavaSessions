package JavaSessions;

public class StringConcatination {

	public static void main(String[] args) {
	
		int a=10;
		int b=20; 
		String x="Hello";
		String y="World";
		
		  System.out.println(x+y+(a+b)); //output - Helloworld30
		  //x + y = added as string and (a+b)-> added as integers. The resultant of (a+b) will be added to x+y. 
		  System.out.println("value of a is " + a );//value of a is 10
		  System.out.println("sum of a and b is " + a+b); //sum of a and b is 1020
		  System.out.println("sum of a and b is " + (a+b)); //sum of a and b is 30
		
		double d1= 12.33;
		double d2= 14.33;
		System.out.println(a+b+d1+d2+x+y);// sum of a+b+d1+d2 will be added to string x and then y/ --> 56.66HelloWorld
		System.out.println(x+y+a+b+d1+d2);//HelloWorld102012.3314.33
        // x+y is HelloWorld. HelloWorld will be concatenated with a -> HelloWorld10 ( a new string). Then this process will continue to the next 
		
		char c1 ='a';
		char c2 ='b';
		
		System.out.println(c1); // output a 
		System.out.println(c1+c2);//output 195 ---> interview question 
		// Char is a part of numeric data type. Holds numeric type internally and that numeric is ASCII value 
		
		System.out.println((int) c1); //We get the ASCII value of the char. we convert the variable into integer. Output -> 97 ACII of 'a'    
		//ASCII value is applicable only for characters. 
		
		 System.out.println(10/2);  //output -> 5 
		 System.out.println(10/3);  //output will be 3 as 10 and 3 are integers hence the result is also integer and not a floating no
		 // It will not 3.33
		 System.out.println(10.0/3); // here numerator is float so result is also float . Output 3.33
		 System.out.println(10/3.0); // here denominator is float so result is also float . Output 3.33
		 System.out.println(10.0/3.0); // Both are float so result is float . Output 3.33
		 
		 
		 System.out.println(0/1); //output is 0
//		 System.out.println(9/0); //output - Java throws Arithmetic exception. 
//		 System.out.println(0/0); //output - Java throws Arithmetic exception. 
	//	 System.out.println(0.0/0); //output -NaN (not a number)
	//	 System.out.println(0.0/0.0); //output -NaN (not a number)
		// System.out.println(9.0/0); //output - Infinity

				
		 System.out.println(9 % 2 ); // This is reminder (Modules). Output is 1. 
		
		
		
		
		
	}

}
