package OOPS_Interface;

public interface US_Medical extends WHO { // extends interface to interface 
	
	int min_fee=10; //in interface variables are static and final by default
	
	
	
	public void physcioServices();
	
	
	public void oncologyServices();
	
	public void dentalServices();
	
	public void darmaServices();
	
	public void emergiencyServices(); 
	
	//from JDK 1.8
// 1. can have static method with a body
	
	public static void medicalEquipment()
	{
		System.out.println("US -- medicalEquipment");
	}
	
 //2. can have default method with method body. This is not abstract as the method is havig its own body. 
	//default method is non static and cannot be "final". This method can be over ridden
	default void medicalCertificate()
	{
		System.out.println("US-medical certificate");
	}
}
