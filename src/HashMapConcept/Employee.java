package HashMapConcept;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Employee {

	public static void main(String[] args) {
		
	HashMap<String, String> empMap= new HashMap<String, String>();
		
//new HashMap<String, String>(); -> this is the object
	//empMap -> object reference name 
	
	// to fill / add values -> .put method is used 
	//every key and value pair is called set 
	
	empMap.put("QTP", "func test tool ");  //keys and values set /pair 
	empMap.put("selnium", "web test tool ");
	empMap.put("jmeter", "load test tool ");
	empMap.put("postman", "api test tool ");
	empMap.put("postman", "api document test tool ");//duplicate key allowed 
	empMap.put(null, "no tool "); // null key 
	empMap.put(null, "no product ");
	empMap.put("zalium", null);
	
//==================================================================================================
	System.out.println(empMap.get("QTP"));// output - func test tool 
	System.out.println(empMap.get("cypress"));// output - null 
	
	System.out.println(empMap.get("postman")); //output -api document test tool
	// latest value is given when key is duplicate 
	
	System.out.println(empMap.get(null)); //no product
	
	System.out.println("zalium"); //null 
//========================================================================================================
	System.out.println(empMap);
	//output-{null=no product , postman=api document test tool , zalium=null, selnium=web test tool , QTP=func test tool , jmeter=load test tool }
	//null takes the 0th index and rest are randonly allocated based on hashmap key  and corresponding  index. Hence this is orderless collection
//=====================================================================================================================
	
	//for each loop 
	//Map.Entry<String,String> - key and value both are strings 
	for (Map.Entry<String,String> e: empMap.entrySet()) {
		//entryset method gives all the entries in the hashmap in form of  of set/pair 
		 //e will go to each and every set and get the value 
		
		String key= e.getKey();   // return type is string now 
		String value = e.getValue(); // to fetch the values 
		System.out.println(key + " ;" +value );
	}
	
	// the output does not maintain the order 
//===========================================================================================================================
	//we use linkedHashMap  if we want to maintain the order 
	//the same for each loop will now give output  in maintained order 
	
	for (Map.Entry<String,String> e: empMap.entrySet()) {
		
		String key= e.getKey();   
		String value = e.getValue(); 
		System.out.println(key + " ;" +value );
	
	}
	
	//=================================================================
	
	//using lambda 
	
	
	empMap.forEach((k,v) -> System.out.println(k +";"+v ));
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
