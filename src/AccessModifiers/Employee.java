package AccessModifiers;

public class Employee extends Company { //employee is child class (sub class )
	//same package subclass 

	public static void main(String[] args) {
	
		Employee e= new Employee();
		e.name="IBM";
		e.hq="NY";
		e.address="test address"; 
	//	e.shareprice -> can't be accessed as it is private in nature 

	}

}
