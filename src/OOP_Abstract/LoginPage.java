package OOP_Abstract;

public class LoginPage extends Page { // Page is parent 

	
	
	public LoginPage() {
		System.out.println("login page -> default const");
	}
	
	public LoginPage(int a) {
		System.out.println("login page -> param const" + a );
	}
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public void title() {
		
		System.out.println("LP- title ");
	}

	@Override
	public void header() {
		
		System.out.println("LP- header");
	}

	
	public void doLogin()	//individual method
	{
		System.out.println("login to app");
	}
	
	
	@Override  //over ridden method. 
	public void timeOut() {  
		
		System.out.println("page time out is" + 5);
	}
}
