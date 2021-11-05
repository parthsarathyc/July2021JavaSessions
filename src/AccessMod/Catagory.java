package AccessMod;

import AccessModifiers.Company; //Different package subclass 
//import is required as are trying to extend this class from different package 

public class Catagory extends Company{

	public static void main(String[] args) {
		Catagory cg= new Catagory(); 	
		cg.hq="MS";
		cg.name="HYD"; 
	// 	cg.address  --> cannot access default 
	//	cg.shareprice -> can't be accessed as it is private in nature 
		
	}

}
