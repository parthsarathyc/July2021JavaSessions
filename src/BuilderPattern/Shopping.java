package BuilderPattern;

public class Shopping {
	
	// return this --> add this to every method. 
	// change method return type to class name -> Shopping for all the methods.

	public Shopping login(long ph, int otp) { //login woth phone no and OTP 
		
		System.out.println("login to app" + ph+":"+ otp);
		return this;
	}
	
	public Shopping login(String un, String pwd) {  //overloading the method
		
// As We are returning "this" i.e  we are returning the current class object,changing the return type to class name
//login with user ID and password 
		System.out.println("login to app" +un+ ":"+ pwd);
		return this; // will return the current class object . The current class is shopping 
// note we cannot other return types in the same method such as int , string etc ass it already has "return this" 
		
	}
	
// Note - Whenever you are returning this keyword from any method the return type of the method is current class object. 
//current class is shopping so return type is shopping 
	
	public Shopping doSearch(String productName)    //searching the product
	{
		System.out.println("do search with: " + productName);
		
		return this;
//	return new Shopping(); ---> we can use this one instead of 	return this;

		
// new Shopping(); ==> this is same as return this. But with this approach many objects will be created due to new Shopping();. 
//if we use return this -> whatever the current object is going on it will point to the same object and will be returned back.
//No extra objects will be created with return this and reduce unnecessary objects creation in heap memory .
// return this is more preferred. 
		
	}
	
	public Shopping doSearch(String productName, String color)    //Overloading the method
	{
		System.out.println("do search with: " + productName+ ":" + color );
		return this;
	}
	
	
	public Shopping addToCart(String productName)  // adding to cart 
	{
		System.out.println("adding to cart :" + productName);
		return this;
	}
	
	public Shopping doPayment(String cc, int otp)    // credit card and otp for payment 
	{
		System.out.println("making payment with:" +cc+ otp);
		return this;
	}
	
	public Shopping doPayment(String UPI, int otp, int code)    // Overloading the method 
	{
		System.out.println("making payment with:" +UPI+ otp+ code);
		return this;
	}
	
	
	
	public Shopping doPayment(long ccNumber, String password)    // Overloading the method 
	{
		System.out.println("making payment with:" +ccNumber+ password);
		return this;
	}
	
	public Shopping checkOrder (String productName)
	{
		System.out.println("product :" + productName + "order id is  1234");
		return this;
	}

	public Shopping logout()
	{
		System.out.println("logout from application");
		return this;
	}





}
