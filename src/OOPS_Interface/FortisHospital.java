package OOPS_Interface;

public class FortisHospital extends Hospital implements US_Medical,UK_Medical,Indian_Medical {  
	

	// @Override -gives error. This is independent method in fortis hospital class. 
		public static void medicalEquipment()
		{
			System.out.println("FH -- medicalEquipment");
		}
		@Override  //means default method can be over ridden. 
		public void medicalCertificate() //default was giving w=error hence changed to public 
		{
			System.out.println("FS-medical certificate");
		}
	
	
	@Override  // WHO method added because this class implements -> USMedical and USMedicals extends WHO
	public void covid19Test() {
	
		System.out.println("FH- covid 19 test");
	}
	
	
	@Override      //overridden from hopsital class. Parent is Hospital class 
	public void helpDesk()
	{
		System.out.println("FH- hospital helpdesk");
	}

	
	
	
	
	@Override
	public void physcioServices() {      //Method from from US medical 
	
		System.out.println("FH -physcioServices ");
	}

	@Override
	public void oncologyServices() {     //Method from from US medical 
	
		System.out.println("FH -oncologyServices ");
	}

	@Override
	public void dentalServices() {			//Method from from US medical 
		
		System.out.println("FH -dentalServices ");
	}

	@Override
	public void darmaServices() { //Method from from US medical 
	
		System.out.println("FH -darmaServices "); 
	}

	@Override
	public void pediaServices() { //Method from from UK medical 

		System.out.println("FH -pediaServices "); 
	}

	@Override
	public void cardioServices() { //Method from from UK medical 
		
		System.out.println("FH -cardioServices "); 
	}

	@Override
	public void neuroServices() { //Method from from India medical 
		
		System.out.println("FH -neuroServices "); 
	}

	@Override
	public void orthoServices() {  //Method from from India medical 
		System.out.println("FH -orthoServices "); 
	}

	@Override
	public void entServices() {  //Method from from India medical 
	
		System.out.println("FH -entServices "); 
	}

	@Override
	public void emergiencyServices() { 	//  common method  US,UK and India. 
		//This will be implemented only once otherwise this will become duplicate method. 
		//override wont be 3 times only once 
		System.out.println("FH-emergiencyServices");
		
	}  
	
	//individual method 
	public void insurance()
	{
		System.out.println("individual method " );
		
		
	}
	









	
	
}
