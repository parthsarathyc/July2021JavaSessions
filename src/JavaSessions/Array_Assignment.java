package JavaSessions;

public class Array_Assignment {

	public static void main(String[] args) {
		
//		Question 1: Write a program to print the following pattern using for loop:
//
//
//			00 01 02 03 04 05 06 07 08 09 
//			10 11 12 13 14 15 16 17 18 19 
//			20 21 22 23 24 25 26 27 28 29 
//			30 31 32 33 34 35 36 37 38 39 

		  for (int i=0;i<=3;i++)
		  {

			  
			  for ( int j=0; j<=9;j++)
			  {
				  System.out.print(i+"" +j);
			  }
			  System.out.println();
		  }
		
	//====================================================================
		  
//		  Question 2: Write a program to create a static Array, having following cricket data:
//			  --name(String), age(age), team name(String), DOB(String), gender(char), Strike Rate(Double), isActive(boolean)
//			  --Try to create multiple Object Arrays for different players 
//			  --Try to print all the values of each player on the console using normal for/while loop and for each loop
//		
		  
		  Object obj[]= new Object[8]; 
		  	obj[0]= "naveen";
		  	obj[1]= "labs";
		  	obj[2]= "33";
			obj[3]= 5.66;
			
			obj[4]= "javaProf";
		  	obj[5]= "labs";
		  	obj[6]= "35";
			obj[7]= 6.66;
		  
		  for (int i = 0; i < obj.length; i++) {
			System.out.println(obj[i]);
		}
//=====================================================================================
		  
//		  Question 3: Try to print the following pattern on the console:
//			  n = 4
//			  n = 3
//			  n = 2
//			  n = 1
//			  n = 0
	
	 int a[]=new int[5]; 
	 a[0] =4; 
	 a[1] =3; 
	 a[2] =2; 
	 a[3] =1; 
	 a[4] =0; 
	
	
	  for (int i = 0; i < a.length; i++) {
			System.out.println("n" + "=" + a[i]);
		}

	//=====================================================================================
	  
	  
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
