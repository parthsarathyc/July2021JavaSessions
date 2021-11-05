package HashMapConcept;

import java.util.HashMap;

public class AmazonWeb {
	
	public void doLogin(String un, String pwd) { 
		
		System.out.println(un + ":" + pwd);
	}
	
	public HashMap<String, String> getUserCredentials() { // return is Hashmap 
		//key - role (admin)
		//value - credentials (admin: admin) 
		
		HashMap<String, String> credMap= new HashMap<String, String>() ; 
		credMap.put("customer", "naveen@gmail : naveen123"); 
		credMap.put("seller", "seller@gmail : seller123"); 
		credMap.put("vendor", "vendor@gmail : vendor123"); 
		credMap.put("partner", "partner@gmail : partner123"); 
		
		return credMap; 
		
	}

	public static void main(String[] args) {
		
		AmazonWeb obj = new AmazonWeb(); 
		
		String custCred= obj.getUserCredentials().get("customer");
		String cred []= custCred.split(":"); 
		String username=cred[0]; 
		String password=cred[1]; 
		
		obj.doLogin(username, password);
		
		
	}

}
