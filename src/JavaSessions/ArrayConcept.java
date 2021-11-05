package JavaSessions;

public class ArrayConcept {

	public static void main(String[] args) {
		
		//int array 
		
		int i[]=new int[4]; //array declaration
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
	//	i[4]=70; // ArrayIndexOutOfBoundsException as we have defined array till a[3]. We cannot go beyond the highest index 
	//	i[-1]=70;//ArrayIndexOutOfBoundsException
		
		System.out.println("Li =" + 0);
		System.out.println(i.length);// length of the array. Output -> 4
		int l=i.length; 
		System.out.println("Hi=" + (l-1)); // highest index is 3 
		 
		System.out.println(i[0]);    // 10
		System.out.println(i[3]);    //40
	//	System.out.println(i[4]); // ArrayIndexOutOfBoundsException - this is run time exception not compile time.
		//when exception is caught during compiling its compile time. When exceptioncomes after running the program its run time exception.
		// there is no i[4] or 4th index hence the error. 
	//	System.out.println(i[-1]); //-ve indexing is not allowed in Java though -ve indexing is allowed in python. ==> run time exception 
		
		System.out.println(i[0] + i[3]); // 10+40=50  
		
//		System.out.println(i[4]); // ArrayIndexOutOfBoundsException as we have defined array till a[3]. We cannot go beyond the 
		// Highest index 
		// we can store only 4 values in the array
	//=====================================================================================================	
		
		// to print all values from array : use for loop 
		
		for (int k=0;k<i.length;k++)
		{
			System.out.println(i[k]);
		}
		
		// for each loop  --> works same as for loop / also called enhanced for loop
		
		for (int e: i)   // data type of the values, declare a variable ( e in this case) : variable name ( i is the array variable name
			// in this case)
			// e will go each index of i  and take out the values 
		{
			System.out.println(e);
		}
		
		// time complexity for both "for" loops is linear --> O(n). Hence performance of both the for loops is same. 
//=================================================================================================================		
		// object array 
		 //object can hold any kind of data 
		
		Object employee[] =new Object[5]; 
		employee[0]= "Lisa"; 
		employee[1]= 30; 
		employee[2]= "F"; 
		employee[3]= 40.22; 
		employee[4]= true; 
		
		// to print all the employee values 
		for(int n=0; n< employee.length;n++)
		{
			System.out.println(n + "=" + employee[n]);
			
		}
		System.out.println("========================");
		//using for each loop 
		int count=0; 
		for(Object e:employee )
		{
			System.out.println(count+"="+ e);
			count++; 
		}
	}

}
