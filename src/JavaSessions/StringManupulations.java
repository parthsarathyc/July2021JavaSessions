package JavaSessions;

public class StringManupulations {

	public static void main(String[] args) {
		
		String str= "This is my java code and i am so happy"; 
	//length of string - how many characters in the string.  
		
		int len= str.length(); 
		System.out.println(len); //including blank space 
		
		//high and low index 
		System.out.println("li=" + 0);//0th index 
		System.out.println("Hi=" + (len-1)); //highest index 
		
		System.out.println(str.charAt(6));  // Character as per index number
	//	System.out.println(str.charAt(-1)); // -ve indexing is not there in java. 
		//Output - stringIndex out of bound exception
//		System.out.println(str.charAt(38)); ////Output - stringIndex out of bound exception
		
		System.out.println(str.indexOf('j')); // output 11. Finds index of a character in the string 
		System.out.println(str.indexOf('i')); // index of the immediate character where it is available
		//output - 2 i.e 1st occurrence of i 
		
		// to find the 2nd value of i 
		System.out.println(str.indexOf('i', 3)); //find i and start from 3rd index. 
		////output is 5 
		//but above is hardcoding so can be coded as below
		
		System.out.println(str.indexOf('i', str.indexOf('i')+1));//output is 5 
		
		//position of a string 
		System.out.println(str.indexOf("java"));//output 11. 
		System.out.println(str.indexOf("python"));//output -1 , this is when the string is not available. 
		
		String username= "welcome admin";
		if (username.indexOf("admin")>0) {
			System.out.println("pass");
			
		} else {
				System.out.println("fail");
		}
		
	
		//contains -> returns true or false -> a boolean. 
		
		String s1= "title is account login";
		System.out.println(s1.contains("login"));  // output -true 
		
		String s2= "title is account Login";
		System.out.println(s2.contains("login"));  // output -false as java is case sensitive  
		
		//compare -- Result is true or false -boolean. 
		
		String s3= "welcome admin"; 
		String s4= "welcome admin"; 
		
		 System.out.println(s3.equals(s4)); // can be used in if else conditions
		System.out.println(s3.equalsIgnoreCase(s4));  // can be used in if else conditions
	
		// trim -remove spaces from the corner 
	
	 String st= "     Hello   World    "; 
	 System.out.println(st.trim()); // output - Hello   World. Spaces removed from corners
	
	// remove all the white spaces. 
	
	 String stt= "     Hello   World  testing     "; 
	 System.out.println(stt.replaceAll("\\s", "")); //output -HelloWorldtesting 
	 // "\\s-> this is the regular expression or symbol of all white spaces. 
	
	// change "01-01-1990" "01/01/1990";   
	 
	 String dob= "01-01-1990"; 
	 System.out.println(dob.replaceAll("-", "/"));
	 
	 // lowercase, uppercase 
	 
	 String sc= "this is my java code"; 
	 System.out.println(sc.toUpperCase());//output-THIS IS MY JAVA CODE
	 System.out.println(sc.toLowerCase());//output-this is my java code
	 
	 //split - important 
	 
	 String lang = "java_python_javascript_ruby";
	 
	 String lg[]=lang.split("_");//when we mouse over it gives suggestion to store output in sting array. 
	  
	 for (int i = 0; i < lg.length; i++) {
		System.out.println(lg[i]);
	}
	 
	 //OR 
	 
	 for(String e : lg)
	 {
		 System.out.println(e);
	 }
	 
	 System.out.println(lg[0]);// output - java
	 System.out.println(lg[1]); // output - python
	 System.out.println(lg[2]); //output - javascript
	 System.out.println(lg[3]); //output - ruby
	// System.out.println(lg[4]);//array index out of bound exception 
	 
	 
	 String test ="testingxXXseleniumXxXQTPXXxXAutomation";
	 
	String t[]= test.split("xX"); 
	 
	 System.out.println(t[0]); //testing
	 System.out.println(t[1]);//XseleniumX
	 System.out.println(t[2]);//QTPXX
	 System.out.println(t[3]); //Automation
//	 System.out.println(t[4]); ////array index out of bound exception 
	 
	 
	 
	 
	 String test1 ="xXtestingxXXseleniumXxXQTPXXxXAutomation";
	 
		String t1[]= test1.split("xX"); 
		 
		 System.out.println(t1[0]); //blank -no value here 
		 System.out.println(t1[1]);//testing
		 System.out.println(t1[2]); // XseleniumX
		 System.out.println(t1[3]); //QTPXX
		 System.out.println(t1[4]);//Automation
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
