package OOP_Inheritance;

public class BMW extends Car { // gives error when we try to extend with truck class 
	//multiple inheritance is not allowed in Java,. 
	// This is called a diamond  problem or multiple inheritance problem. 

	
	int speed =200; 
	
	
	
	//Child class - BMW is the child of Car or Car is a superclass or BMW and BMW is a subclass of car
	
	@Override        //@Override - this is not mandatory to write this.
	//But if we write this and this does not give any error that would mean method is overridden. 
	                 // it is a good practice to have this annotation. 
	public void start()
	{
		System.out.println("BMW start ");  //overridden method 
	}
	
	public void autoparking()
	{
		System.out.println("BMW autopark ");
	}

}
