package OOP_Abstract;

public abstract class Page {//abstract word has to added 
	
	public Page() {    // constructor -> constructor name will remain as class name
		//default constructor 
		System.out.println("page - default const");
	}
	
	
	public Page(int a) {    // overloading constructor 
		System.out.println("page - one param const"  + a);
	}
	
	//we cannot call object of abstract class hence can't call the constructor directly. 
	//constructor will be called when you create object of its child class. 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	// abstraction is enhanced version of interface. 
	//cannot create object of abstract class -it cannot be instantiated. 
	//abstract class can have zero abstract method also
	//its a wrong concept that abstract class should have atleast one abstract method.
	// abstract class can have only abstract methods as well. This means no other method other than abstract class. 
	// we can have combination of both abstract and non abstract method. --> Partial abstraction. 
	// we can achieve 0 to 100 % abstraction 
	// interface will come under 100% abstraction category.
	//you can create constructor of abstract class 
	
	
	public abstract void title(); //abstract keyword has to be mentioned as this is abstract method.
	public abstract void header(); 
	
	public void timeOut() {  // its a normal method and allowed in abstract class 
		//this method can be overridden
		System.out.println("page time out is" + 20);
	}
	
	public final void logo() {  // final method that cannot be overridden 
		System.out.println("page ...logo" );
	}
	
	public static void getUrl() {   // static method cannot be over ridden 
		System.out.println("https://www.xyz.com" );
	}
	
}
