package JavaSessions;

public class ConditionalOperators {

	public static void main(String[] args) {
		
    int a=10;
    int b=20;
    
    System.out.println(a==b);//output - false. 
    
    
		if (a==b) {
			System.out.println("they are equal ");
		}
		else   // else is not mandatory in java 
		{            
			System.out.println("they are not equal ");
		}
			
	//======================================================================	
		
		boolean flag=true; // as flag value can be changed hence this is not a dead code.There is no hard coding. 
		
	if (flag)
	{
		System.out.println("hi");
			}
	else {
		System.out.println("bye");
	}
		
	
//====================================================================
	// the program below checks all the if conditions. Nested if condition 
	
	int total =100;
	
	if (total<=100)
	{
		System.out.println("totall is less than or eq to 100" ); //output - prints this 
		 if(total>=80)
		 {
			 System.out.println("total is lgreater tna or rq to 80");  //output - prints this 
			 	if(total==80)
			 	{
			 		System.out.println("total eq to 80");
			 	}
		 }	
	}
	//===================================================================
	// else is optional

	if (total<=200)
	{
		System.out.println("totall is less than or eq to 100" ); //output - prints this 
		 if(total>=80)
		 {
			 System.out.println("total is lgreater tna or rq to 80");  //output - prints this 
			 	if(total==80)
			 	{
			 		System.out.println("total eq to 80");
			 	}
			 	else {
			 		System.out.println("pass");  //output - prints this
			 	}
		 }	
		 else {
			 System.out.println("NA");
		 }
		 
	}
	else {
		System.out.println("bye");
	}
	//===========================================================================
	//whenever you are doing string comparison do not use "==" operator
	//primitive data types t be compared with "==" operator
	//.equals compares the values "==" compares the references. 
	
	// in below code all if conditions get checked even though the condition is satisfied in 1st if condition 
	// not a good code as if we have multiple browsers then it will go to all the if conditions and check them.increases compilation time
	
	//logic - to launch the browser -ch,ff ,safari. 
//	
	String browser="chrome";

	if (browser.equals("chrome"))
	{
		System.out.println("launch chrome");
}
	if (browser.equals("firefox"))
	{
		System.out.println("launch ff");
	}
	if (browser.equals("safari"))
	{
		System.out.println("launch safari");
	}
	else
	{
		System.out.println("please input the correct browser");
	}
	
	
	//===========================================================================================
	
	
	// to comment multiple code - control + / (forward slash) 
	// else if -> these are 2 different key words in java. else / if. 
	// in below code the condition is satisfied in the 1st if condition and the code will  enter the rest of the code. 

	if (browser.equals("chrome"))
	{
		System.out.println("launch chrome");
	}
	else if (browser.equals("firefox"))
	{
		System.out.println("launch ff");
	}
	else if (browser.equals("safari"))
	{
		System.out.println("launch safari");
	}
	else
	{
		System.out.println("please input the correct browser");
	}
	
	// if we have 100 if condition and  and the condition gets satisfied in the 100th if condition, then we have to check all 100 ifs
	// hence the below code is better tan this one - switch case statement
//========================================================================================================
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	}

}
