package Webdriver_Arch;

public interface WebDriver extends SearchContacts {
	
	@Override
	 public void findElememt(); 
	
	@Override
	 public void findElememts(); 

	
	
	public String getTitle(); 
	//this method will return a string hence return type is changed to String
	//its not that abstract methods have to be void. 
	
	public void launchUrl(String URL );
	//this is again abstract method as it does not have a body and only signature is defined. 
	
	public String getUrl( );
	
	public void click( );
	
	public void sendkeys(String value );
	public void close( );
	
	
	
	
	
}
