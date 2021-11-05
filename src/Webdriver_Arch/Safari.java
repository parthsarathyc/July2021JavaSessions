package Webdriver_Arch;

public class Safari implements WebDriver {

	public  Safari() {
		System.out.println("launch Safari");
	}
	
	@Override
	public void findElememt() {
		System.out.println("findElememt");
		
	}

	@Override
	public void findElememts() {
		System.out.println("findElememts");
		
	}

	@Override
	public String getTitle() {
		
		return "Title of the page"; //return type is String 
	}

	@Override
	public void launchUrl(String URL) {
		System.out.println("launching url");
		
	}

	@Override
	public String getUrl() {
	 return "amazon.com"; 
		
	}

	@Override
	public void click() {
		System.out.println("click");
		
	}

	@Override
	public void sendkeys(String value) {
		
		System.out.println("enter the value" + value);
		
	}

	@Override
	public void close() {
		System.out.println("browser close" );
	
	}
	
	
}
