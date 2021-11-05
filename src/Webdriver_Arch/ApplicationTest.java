package Webdriver_Arch;

public class ApplicationTest {
	
	static WebDriver Driver; 
	//static so that it can be directly used in the main method. 
	
	public static void main(String[] args) {
		String browser ="chrome";
		
		if (browser.equals("chrome")) {
			Driver = new ChromeDriver(); 
		}else if (browser.equals("firefox")) {
			Driver = new Firefox(); 
		}
		else if (browser.equals("Safari")) {
			Driver = new Safari(); 
		}else
		{
			System.out.println("pass the right browser");
		}
		Driver.findElememt();
		Driver.getTitle();
		Driver.sendkeys("naveen"); 
		Driver.findElememts();
		Driver.getUrl();
		

	}

}
