package OOP_Abstract;

public class TestPage {

	public static void main(String[] args) {
	
		LoginPage lp= new LoginPage(10) ; 
  
		// sequence -> loginpage (int a) will be first checked
		//will go the parent constructor and call the default constructor 
		//go back loGinPage and get into the method body of loginpage (int a)

		//output -> 		page - default const
		//					login page -> param const10
		
		
		// Note it will not call -> Page(int a) .We need Super keyword to call this.
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		lp.title(); //output - LP- title 
		lp.header(); // output -LP- header
		lp.timeOut(); // calls the child class. Output -page time out is5 
		lp.logo(); // Cant be overridden as it is final. Can be accessed from child class. 
		Page.getUrl(); // Static method called by class name. 
		
		
		
		
		//topcasting - Child class object can be refereed by parent abstract class variable. 
		Page p	=new	LoginPage (); 
		//p.dologin -> this does not work as the reference type check will fail. 
		//we cannot access individual method. 
		p.title(); //can be accessed as it is coming from page class   
		p.header(); //can be accessed as it is coming from page class  
		
	  
		
		//downcasting is not allowed as shown below . 
	//	new Page(); -Throws error at compile time 
		
	}

}
