package AccessModifiers;

public class Company {//same class 

	
	public String name; 
	private int sharePrice; 
	protected String hq;
	String address; //this means default 
	
	
	
	public static void main(String[] args) {
	
		Company c=new Company(); 
		c.name="IBM"; 
		c.sharePrice=100; //within the same class can be accessed. 
		

	}

}
