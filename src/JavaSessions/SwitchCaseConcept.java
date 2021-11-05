package JavaSessions;

public class SwitchCaseConcept {

	public static void main(String[] args) {
	
		String browser ="chrome";
		
		// write switch and control shift. Below template will be generated 
		//duplicate cases are not allowed 
		//we can have only 1 case such as 	case "chrome". Comma sepeated cases are now allowed such as 	case "chrome","firefox". 
		
		switch (browser) {   // key is browser
		case "chrome":                                 //only chrome will be checked and rest of the cases will not be checked 
			System.out.println("launch chrome");
			break;  // with break this comes out of the switch case
			
		case "Firefox":                    // this code will not be checked 
			System.out.println("launch Firefox");
			break;
			
		case "safari":                      // this code will not be checked 
			System.out.println("launch safari");
			break;

		default:                             // executes when the condition is not satisfied. Works somehow like "else"
			System.out.println("input correct browser");
			break;
		}

		//================================================================================================================
		
		// which no is the highest.
		
		//&& -> logical . We also call it as -short circuit operator. 
		
		
		int x=100;
		int y=200;
		int z =300; 
		
		if (x>y && x>z)     // condition 1 false && condition 2 false . So false && false => false
							// as the condition 1 is false so && will not check the 2nd condition and come out of if condition. 
		{
			System.out.println("x is greatest");
		}
		else if (y>z)   // Now this condition will be checked . Result -> false
		{
			System.out.println("y is greatest");
		}
		else     // code goes to else and prints value of z 
		{
			System.out.println("z is greatest");
		}
		
	}

}
