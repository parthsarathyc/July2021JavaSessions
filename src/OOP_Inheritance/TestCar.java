 package OOP_Inheritance;

public class TestCar {

	public static void main(String[] args) {
			
		
		Audi a= new Audi();
		a.childLock();// Method present in Audi
		a.start(); //method present in parent class - Car 
		a.stop(); // method present in parent class - Car 
		a.refuel(); // method present in parent class - Car 
	 // 	a.autoparking() //siblings cannot inherit properties from each other 
		// this method is in BMW class and cannot be inherited. 
		
		
		
		
		BMW b=new BMW();
	
		b.engine();  // able to access this from grandparent class - vehicle. 
		
		  Car c=new Car(); 
		  
		  c.engine();// able to access from parent class - vehicle 
		  
		//  Top casting with grandparent class 
		  new BMW(); 

		 //child class object can be refereed by grand parent ref variable 
		  //every BMW  is a car and every BMW is a vehicle too.
		  Vehicle v1 =  new BMW();
		//  v1.start  --> we cannot access child class properties. 
		  v1.engine(); // allowed as is part of vehicle class.
		  //   vi.autoparking()  --> This is individual method of BMW so cannot be accessed. 
//Java will check the object reference is from vehicle and autoparking() is method  of BMW. 
		  //ref type check will fail. 
		  
		  
		  //downcasting -> this is not allowed at run time. 
		  
		  
//		BMW b2=  = (BMW) new Vehicle (); 
	
	
	
	
	}

}
