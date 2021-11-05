package JavaSessions;

import java.util.ArrayList;

// this is Team class - generic class and we are not creating any main method here. 
//So creating a new class with main method 
public class Team {

	public ArrayList<String> getDivesList(String teamname) //pass team name to this method and return devices list 
	{
		
		System.out.println("team name is " + teamname);
		
		
		ArrayList<String> devicelist= new ArrayList<String> (); //return is list of devices hence should be arraylist		
		if (teamname.equalsIgnoreCase("QA"))
			{
			devicelist.add("oneplus");
			devicelist.add("Samsung");
			devicelist.add("Honor"); 
			} else if (teamname.equalsIgnoreCase("dev")) {
				devicelist.add("oneplus");
				devicelist.add("Samsung");
			} else if (teamname.equalsIgnoreCase("devops"))
			{
				devicelist.add("iphone");
			}
			else
			{
				System.out.println("team name not found" + teamname);
			}
				
		return devicelist; // main method was void at the start of the program. 
		//As the return type is ArrayList hence now changed to arraylist
		// we are using arraylist as the application remains dynamic as the device list may increase.
		//hence arraylist or dynamic array os preferred. 
// a function can return multiple values in the form of arrays or arraylist
		
		
	}
	
	
	public void launchBrowser(String browsername)
	{
		switch (browsername.toLowerCase()) {  // to lowercase to convert capital to small/
		case "chrome":
			System.out.println("launch chrome");
			break;
		
		case "firefox":
			System.out.println("launch ff");
			break; 
			
		case "safari":
			System.out.println("launch safari");
			break;


		default:
			System.out.println("please pass the right browsername" + browsername);
			break;
		}
		
	}
	
	public Object[] studentInfo(String name)
	// Start will void and after placing return type at end decide on return type of the method. 
	//object array will be returned. 
	{
		System.out.println("student name is" + name);
		Object info[] = new Object[3]; //object array to place items of different data types.
		
		
		if (name.equals("kartik")) {
			info[0]="Kartik Sharma"; 
			info[1]=10; 
			info[2]='A'; 
			}
		else if (name.equals("Sonu")) {
			info[0]="Sonu Gupta"; 
			info[1]=10; 
			info[2]='B'; 
	}
		
		else if (name.equals("Ravi")) {
			info[0]="Ravi"; 
			info[1]=12; 
			info[2]='B'; 
	}
		
		else 
		{
			System.out.println("student name is not found" + name);
			
		}
		
		return info; // info object is getting filled hence we need to return info 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
