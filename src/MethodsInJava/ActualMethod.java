package MethodsInJava;



public class ActualMethod {
	// Write a program to print the sum of two numbers entered by user by defining
	// your own method
	public void add(int a, int b) {
		System.out.println(a + b);
	}

	// Define a method that returns the product of two numbers entered by user.
	public int multiply(int a, int b) {
		int product = a * b;
		return product;
		
	

	}


//.Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.

//2 * 3.14.radius 
	public double circumference(int r) {
		double circumference;
		circumference = 2 * 3.14 * r;
		return circumference;

	}

//Define a program to find out whether a given number is even or odd.

	public void evenOdd(int a) {
		if (a % 2 == 0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}
	}
	
	
	
	

//7. Define a method to find out if number ﻿is prime or not.
	// prime -> divided by itself =reminder = 0
	public void prime(int a) {
		boolean flag = false; 
		for (int i = 2; i < a/2; i++) {
			if (a % i == 0) {
				flag=true; 
				break; 
			}
			
		
		}
		if (flag ==false) {
			System.out.println("prime number" + a);
		 
		}

	}


	
	//====================================================================================================
	
//	
//	Write a program which will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:
//		Marks        Grade
//		91-100         AA
//		81-90          AB
//		71-80          BB﻿
//		61-70          BC
//		51-60          CD
//		41-50          DD
//		<=40          Fail
	

   public void grade(int a)
   {
	   if (a> 90 && a<=100) {
		   System.out.println("grade AA");
		
	}else if (a> 80 && a<=90) {
		   System.out.println("grade BB");
			
	}else if (a> 70 && a<=80) {
		   System.out.println("grade CC");
			
	}else if (a> 60 && a<=70) {
		   System.out.println("grade DD");
			
	}else if (a> 50 && a<=60) {
		   System.out.println("grade EE");
			
	}if (a> 40 && a<=50) {
		   System.out.println("grade EEE");
			
	}else if ( a<=40) {
		   System.out.println("grade FF");
			
	}
	   
//	Write a program to print the factorial of a number by defining a method named 'Factorial'.
//	Factorial of any number n is represented by n! and is equal to 1*2*3*....*(n-1)*n. E.g.-
//	4! = 1*2*3*4 = 24
//	3! = 3*2*1 = 6
//	2! = 2*1 = 2
//	Also,
//	1! = 1
//	0! = 0
	
	

	   
   }

	
	public void fact(int a) 
	{  int f=1; 
		for (int i=1;i<=a;i++)
		{
			f=f*i; 
		}
		
		System.out.println(f);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
