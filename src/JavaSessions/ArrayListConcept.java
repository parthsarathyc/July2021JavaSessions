package JavaSessions;

import java.util.ArrayList;    //import is used after package name 

public class ArrayListConcept {

	public static void main(String[] args) {
		
		
		ArrayList ar = new ArrayList(); //  Array list to be imported as it is a default class. "ar" is a variable name and we are 
		//creating object of Array list class 
		//java.util is already available in JDK and ArrayList class has to be imported from there. 
		//	we re not using ArrayList ar[]  = new ArrayList(), because arraylist is a class and [] is used for static array 
		
		System.out.println(ar.size()); // calculates Pc=0 (Physical capacity)
		
		//***************************************************************
//		ArrayList ar1 = new ArrayList(20);
//		System.out.println(ar1.size()); //output physical capacity will be zero and vitual capacity 20. This type of code is not used. 
		
		
//************************************************************************		
		// adding values to arraylist 
		
		ar.add(100); //  0th index  - Array index will be maintained internally 
		ar.add(200);  //  1st  index
		ar.add(300); //  2nd   index
		
		System.out.println(ar.size()); // output - 3 . We use .size method for array list and .length method for static array
		//Physical capacity = 3 
		ar.add(400); //  3rd  index
		ar.add(500); //  4th  index
	//******************************************************
		
		System.out.println(ar.size()); // output 5 
		ar.remove(3); // 400 removed
		System.out.println(ar.get(3));//output 500 
		System.out.println(ar.size()); // output 4 
		
	//**********************************************************
		ar.add("test");  // string can be added 
		ar.add(12.56); // float can be added
		// to print all the values from arraylist : for loop
		
		for(int i=0;i<ar.size();i++)
		{
			System.out.println(ar.get(i));              // get method to fetch the values. 
		}
			
		for  (Object e: ar )  // using Object as diff data hypes are present in Arraylist 
		{
			System.out.println(e);
		}
		
			// time complexity for both is O(n)- linear equation.  
		
//======================================================================================================
		
		
		ArrayList<String> emplist =new ArrayList<String>(); //array list restricted for strings only. 
		  
		for (String e: emplist )
		{
			System.out.println(e);
		}
		ArrayList<Integer> empno =new ArrayList<Integer>(); // we need to write"Integer" as Integer is a class . Only int data can be added
		
		for (int e: empno )
		{
			System.out.println(e);
		}
		ArrayList<Object> empdata =new ArrayList<Object>();// stores all data types hence suing Object. 
		empdata.add("hello");
		empdata.add(123);
		empdata.add(true);
		empdata.add('F');
		
		for (Object e: empdata )
		{
			System.out.println(e);
		}
		
		System.out.println(empdata); // this works in arrayList but not in static  array .
		// Output ->  [hi, 123, true, F]  -> this will bein List form ( inside square bracket). 
		
		 for( int i=0;i< empdata.size();i++ )
		 {
			 System.out.println(empdata.get(i));
			  if (empdata.get(i).equals("hello")) {
				System.out.println("Hello");
				break;     // comes out of the entire if and for loop .Output ->  hello,Hello

			}
		 }
		
		 
		  
		
		
	}

}
