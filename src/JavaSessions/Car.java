package JavaSessions;

public class Car {
	
	String name;
	int price;
	String color;
	static int wheels =4 ;  //Initialized value D
	
	public static void main(String[] args) {
       
		Car c1 =new Car(); 
		c1.name="BMW";
		c1.price=70;
		c1.color="white";
		
		Car c2 =new Car(); 
		c2.name="Audi";
		c2.price=80;
		c2.color="gray";

		Car c3 =new Car(); 
		c1.name="Honda";
		c1.price=20;
		c1.color="black ";

		
		System.out.println(c1.color +" " +c1.price+" " +Car.wheels);// To access static property it has to be accessed by class name
		//and not object name as Static is not a part of the object. 
		
		// we can access static variable through object ref name too but java will give warning. This is wrong practice
		System.out.println(c1.wheels);
		
		// we can access static variables directly 
		System.out.println(wheels);

	}

}
