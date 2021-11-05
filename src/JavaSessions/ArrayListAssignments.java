package JavaSessions;

import java.util.ArrayList;

public class ArrayListAssignments {

	public static void main(String[] args) {
	
		//. Write a Java program to create a new array list, add some colors (string) and print out the collection
		
		ArrayList<String> arr= new ArrayList<String>();
		arr.add("red");
		arr.add("green");
		arr.add("blue"); 
		
		System.out.println(arr);
		
		//Write a Java program to insert an element into the array list at the first and last positions.
		arr.add(0, "first");
		arr.add(arr.size(), "last");
		System.out.println(arr);
		
		//Write a Java program to retrieve an element (at a specified index) from a given array list.
		int i=2; 
		System.out.println(arr.get(i));
		
		//Write a Java program to update specific array element by given element.
		
		 arr.add(3, "update");
		 System.out.println(arr);
		 
		 //Write a Java program to remove the third element from a array list. 
		 arr.remove(3);
		 System.out.println(arr);
		 
		 // Write a Java program to search an element in a array list.
		 String search="Y";
		 
		 for (int j = 0; j < arr.size(); j++) {
		     
		       if (arr.get(j).equals(search)) {
				System.out.println("yes");
			}
				
			}
		 
		 //. Write a Java program to reverse elements in a array list
		       
		 ArrayList<String> reverse= new  ArrayList<String>(); 
		 
		    for (int j = arr.size()-1; j >= 0; j--) {
		
				  reverse.add(arr.get(j))  ;
			}
		 
		    System.out.println(reverse);
		 
		 //Write a Java program of swap two elements in an array list.
		      System.out.println(arr);
		
		    String A=  arr.get(0); 
		   String B=  arr.get(1); 
		    arr.remove(0);
		    arr.add(0, B);
		    arr.remove(1);
		    arr.add(1, A);
		   
		
		System.out.println(arr);
	
		//Write a Java program to empty an array list.
		
//			arr.removeAll(arr); 
//	
//	     System.out.println("empty atrry list" + arr);
	     
	     //Write a Java program to trim the virtual capacity of an array list the current list size.
	     
		  
			arr.trimToSize();
			System.out.println(arr);
	
			
			// Write a Java program to print all the elements of a ArrayList using the position of the elements
			
			for (int j = 0; j < arr.size(); j++) {
				System.out.println("first elelment is" + " " + arr.get(j));
				
			}
			
			
	}
			
		
		 
	}


