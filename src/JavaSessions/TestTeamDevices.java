package JavaSessions;

import java.util.ArrayList;
import java.util.Arrays;

public class TestTeamDevices {

	public static void main(String[] args) {
		
			Team t1=new Team(); // calling team class to access the methods. 
			ArrayList<String>  QAdevices   =  t1.getDivesList("QA"); 
			//When we mouse over a method we see the complete signature 
			// the output is Arraylist String hence to be stored in Arraylist
			//once we mouse over the output is shown as array list String.  
			
			System.out.println(QAdevices);// Arraylist can be directly printed without for loop 
			//Output - team name is QA
			// Output - [oneplus, Samsung, Honor]
			
			if (QAdevices.size()==3) {
				System.out.println("pass");
			}
			
			if (QAdevices.contains("Honor")) {  //checking from arraylist 
				System.out.println("Honor is present");
			}
			
			// we are using arraylist as the application remains dynamic as the device list may increase.
			//hence arraylist or dynamic array os preferred. 
	
	//***********************************************************************************************************
			
			t1.launchBrowser("Chrome");
			
			Object ob[]= t1.studentInfo("kartik"); //data is stored in object array. When we mouse over we can see that. 

	       // as this is static array we need for loop 
			
				for (int i=0; i<ob.length;i++) {
					System.out.println(ob[i]);
				}
	 
			// we can print the arraylist without for loop by below: 
			System.out.println(Arrays.toString(ob));
			
			
	}

	
	
}
