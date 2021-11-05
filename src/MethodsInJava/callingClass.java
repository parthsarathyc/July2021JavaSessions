package MethodsInJava;

public class callingClass {

	public static void main(String[] args) {

		ActualMethod obj=new ActualMethod(); 
		obj.add(2, 4); //Write a program to print the sum of two numbers entered by user by defining your own method
		
		System.out.println(obj.multiply(22, 2));//Define a method that returns the product of two numbers entered by user.
		
		System.out.println(obj.circumference(2));
		
		obj.evenOdd(5);
		
		obj.prime(3);
		
		obj.grade(5);
		
		obj.fact(5);
		
	}

}
