package BuilderPattern;

public class LoginPage {

	//POJO - Plain Old java Objects
	
	private String Username;
	private String password;

    // constructor 
	// right click-> source-> generate constructor using field.  
	public LoginPage(String username, String password) {
		
		Username = username;
		this.password = password;
	}
	//getters and setters 
	//right click-> source-> generate getters and setters 
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {      
		Username = username;
		
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	} 
	
	//this method is expecting the object of LoginPage class. 
	public void doLogin (LoginPage LoginPage )   // Object ref lp is passed in LoginPage.
	//Now the object properties are passed in the method. 
	//Now the object has 2 references - lp and LoginPage
     //this is also called by reference
	{
		System.out.println(LoginPage.getPassword());
		System.out.println(LoginPage.getUsername());
		
	
	}
	
	
}
