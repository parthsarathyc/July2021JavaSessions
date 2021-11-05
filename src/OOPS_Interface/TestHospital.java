package OOPS_Interface;

public class TestHospital {

	public static void main(String[] args) {
	
		FortisHospital fh= new FortisHospital(); 
		US_Medical.medicalEquipment(); //cant be accessed by fortis hospital class. 
		fh.medicalCertificate(); //overridden from child class 
		//output-FS-medical certificate
		
	
		
		
		//	US_Medical.min_fee=20; --> This wont be allowed as US_Medical.min_fee is "final" and cant be changed
			System.out.println(US_Medical.min_fee);// this will provide constant value of 10 
	}

}
