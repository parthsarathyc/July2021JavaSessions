package JavaSessions;

public class LoopsConcept {

	public static void main(String[] args) {
	
	//for loop 
	
		for (int i=0;i<=10;i++)   // --> this format should be used 
		{
			System.out.println(i);  // for go to int i and initialize , then check the condition i<=10;, then print i, then increment i,then
			//check the condition -->continue the loop. 
		}
		//======================================================
		//below program also works without i++. this is not a good code and will lead to infinite loop. 
//		for (int i=0;i<=10;)
//		{
//			System.out.println(i);  
//		}
//=========================================================================================
		// below is also right syntax 
		for (int i=0;i<=10;)
		{
			System.out.println(i);  
			i++; 
		}
//================================================================================
		// below is also right syntax 
		int i=0; 
		for (;i<=10;)
		{
			System.out.println(i);  
			i++; 
		}
	//====================================================================================
		
		//interview question -> what will be output of below  --> infinite loop java will take the condition to be always true
		//this code is ot used 
//		for(;;)
//		{
//			System.out.println("bye");
//		}
		
	//=================================================================================	
		//char can be used in for loop  
		
		for( char c='a'; c<='z';c++)  //print a to z .  
		{
			System.out.println(c);
		}
		  
		  // to print ASCII value 
		
		for( int c='a'; c<='z';c++)  //prints ASCII value -> 97 to 122.   
		{
			System.out.println(c);
		}
		  
//=======================================================================================
		for( double d= 1.0; d<=10.0 ;d++)  //output-> 1.0 2.0 3.0 4.0 5.0 6.0 7.0 8.0 9.0 10.0  
		{
			System.out.print(d +" ");
		}
		
		// we can use similar logic in Jenkins to increase the build number
		
	//====================================================================================
		
//		for( String s= "test"; s.equals("selenium") ;s++)  // <= is only for primitive data types, hence .equals is used. 
//		{												// throws  mismatch error as ++ is to   number for char,int,double no etc. 
//			System.out.print(s +" ");
//		}
//		
//		==========================================================================================
		
		//do-while loop
		
		int r=1;
		do {
			System.out.println(r);  // prints 1 to 10
			r++; 
		}
		while(r<=10); 
			
		//===========================================================================
		
		int m=1;
		do {
			System.out.println(m);  // Prints 1 ( only once) / After 1 is printed it will check the condition. Do is executed at least once 
			r++; 
		}
		while(m >=10); 
		
		//=================================================================================
		
		System.out.println("==============================================");
		// loop with break
		for ( int j=1;j<=10;j++)
		{
			System.out.println(j);
			if (j%5==0) {
				System.out.println("Hi"); // output -> 1,2,3,4,4,Hi
			break;                         // break takes this out of the for loop not just the if condition 
			}
		}
		
		
		
	}

}
