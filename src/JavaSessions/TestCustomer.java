package JavaSessions;

public class TestCustomer {

	public static void main(String[] args) {
		
	 final int i=20;//makes constant values. Now this value cannot be changed 
	 
	 
		
		Customer c1= new Customer(); // customer  is public class and can be assessed from other class
		c1.name="tom";
		c1.emailid="gmail.com";
		c1.phone=666666666; 
		c1.isprime=true; 
		
		System.out.println(c1.name);
		System.out.println(Customer.category);//Accessed from class name as this is static 
		

	}

}
