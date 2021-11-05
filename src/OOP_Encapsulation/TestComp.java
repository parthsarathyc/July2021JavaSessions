package OOP_Encapsulation;

public class TestComp {

	public static void main(String[] args) {
	
		
		Company obj= new Company(); //cannot access private properties from other class. 
	obj.setEmpCount(12);
	obj.setHq("bang");
	obj.setName("IBM");

	System.out.println(obj.getEmpCount());
	System.out.println(obj.getHq());
	System.out.println(obj.getName());
	
	// Output 
//	12
//	bang
//	IBM
	}

}
