package SCP;

public class Student {

	public static void main(String[] args) {
		//strings are not primitive data types . They are class
		
		// below are string literals. Creating the string objects without "new" keyword.  
		String s1="tom"; 
		String s2="tom"; 
		String s3="tom"; 

		
		// below conditions are true as they all are pointing to the same value 
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		System.out.println(s3==s1);


		// with new keyword 
		String s4= new String ("Hello World"); // 2 objects created 
		String s5= new String ("Hello World");// 1 object created 
		// 1 object as shown in the below diagram.
		//it will not create another "hello world" inside SCP as "hello world" is already present there 
		
		
		System.out.println(s4==s5);
		// this will give false as S4 and S5 are representing diff objects inside the heap. 
		//in this case they will check the memory address if the objects and hence == returns false. 
		
           //below will compare the value and returns true
		System.out.println(s4.equals(s5));
		
		s3= s3+ "java" ; 
		System.out.println(s3); // tomjava
		
		String t1="Hello";
		t1="world"; 
		System.out.println(t1); //output -world 
		
		// inside the memory hello will be created and referred by t1 
		//now world object will be created and t1 will break the connection with hello and point towards world. 
		
		//this is immutability. Hello will still be there and wont get replaced by world. A new string "world" got created with reference. 
		// Java has not changed the "hello" 
		// now "hello" are applicable for garbage collector for destruction. 
	
		
	
		// when we do the same with integers they are replaced 
		int i=10;
		i=20;
		//here 10 is replaced by 20 in case of intergers. 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
