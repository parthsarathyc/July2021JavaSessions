package BuilderPattern;

public class TestShop {

	public static void main(String[] args) {
		
		Shopping shop=new Shopping();  
	 // with object ref shop we can access all the individual method created in shopping class.
		
		shop.
			login("naveen", "pwd")        //returning current class object 
				.doSearch("macBook pro")     //returning current class object 
						.addToCart("macBook pro")   //returning current class object 
							.doPayment("5888888768", 1224)   //returning current class object 
								.logout();                      //returning current class object 
		
		
		//  shop.login("naveen", "pwd") -> this is returning the current class object so when we put a dot we can access other methods as well. 
		//shop.login("naveen", "pwd") -> represents the same class object. 

		
		// we are creating only 1 object and each and every method is returning current class object. 
		//above is an end to end   scenario --> a bulder patter or chaining mechanism 
		
		//===========================================================================================================================
		
		
		// another example - 
		shop.login(212121212, 2222)
			.checkOrder("macbook pro")
				.logout(); 
		
		
		
		
		
	}

}
