package JavaSessions;

public class Users {

	
	String name;
	int age;
	String city; 
	public static void main(String[] args) {
		
// 3 set of xerox will be taken of class properties and assigned to the objects u1,u2 and u3.
		
		Users u1= new Users(); // object creation 
		u1.age=20;
		u1.name="neeraj" ;
		u1.city="pune"; 
		
		Users u2= new Users(); // object creation
		u2.age=30;
		u2.name="sonu" ;
		u2.city="Bang"; 
		
		Users u3= new Users(); // object creation
		u3.age=35;
		u3.name="sagar" ;
		u3.city="Delhi"; 
		
		System.out.println(u1.name + " " + u1.age + " " + u1.city);
		System.out.println(u2.name + " " + u2.age + " " + u2.city);
		System.out.println(u3.name + " " + u3.age + " " + u3.city);
		
		u1=u2; 
		System.out.println(u1.name + " " + u1.age + " " + u1.city);
		System.out.println(u2.name + " " + u2.age + " " + u2.city);
		System.out.println(u3.name + " " + u3.age + " " + u3.city);
		
		u2=u3; 
		System.out.println(u1.name + " " + u1.age + " " + u1.city);
		System.out.println(u2.name + " " + u2.age + " " + u2.city);
		System.out.println(u3.name + " " + u3.age + " " + u3.city);
		
		
		u3=u1; 
		System.out.println(u1.name + " " + u1.age + " " + u1.city);
		System.out.println(u2.name + " " + u2.age + " " + u2.city);
		System.out.println(u3.name + " " + u3.age + " " + u3.city);
		
		
		
	}

}
