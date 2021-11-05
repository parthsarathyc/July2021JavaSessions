package BuilderPattern;

public class LoginTest {

	public static void main(String[] args) {
	
		LoginPage lp = new LoginPage("admin", "aa");
		lp.doLogin(lp); 
		// object reference is passed to above method. 
		
		//advantage -
		// no need to pass n number of parameters.
		//if there is a registration form with 50 fields then its best to use the above approach.
		// its recommended if we have more than 7 parameters then pass the complete object. 
		
	}

}
