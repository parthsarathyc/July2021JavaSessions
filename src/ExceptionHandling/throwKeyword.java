package ExceptionHandling;

public class throwKeyword {

	public static void main(String[] args) {
		//throw keyword generates your own exception. 
		
		try {   //throw exception should be surrounded by try catch block. 
		throw new Exception ("data not found exception ");  // this is syntax for throw
		}
		catch (Exception e) {
			System.out.println("data not found exception");
			e.printStackTrace(); //info about the exception we created 
		}
		System.out.println("===========================================================");
		//use  cases - Exception handling from framework
		//data not coming from excel sheets , not able to connect with DB, Data not coming from JSON
		// we want o use our own exceptions and not java exceptions 
		
		String data =null; // assume this data is coming from some excel. No data present so null now.
		
		if (data==null) {
			
			try {   
				throw new Exception ("EXCELdatanotfoundexception "); 
				}
				catch (Exception e) {
					System.out.println(" EXCEL data not found exception");
					e.printStackTrace(); 
				}
		} else
		{
			System.out.println("data is found ");
		}
		
	}

}
