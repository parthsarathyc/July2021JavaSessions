package JavaSessions;

public class MainMethodOverloading {

	public static void main(String[] args) {
		
		System.out.println("my main method");  // this will be output once we run this and JVM will run this method only. 
	}


	public static void main(int a) {  // main  method can be overloaded by changing the parameter. 
		 //    static method can be overloaded by changing the parameter
		//Static method cannot be over ridden
		
		System.out.println("my main method" + a);
	}

		public static void main(int a, int b) {  //this is method overloading 
		
			System.out.println("my main method" + a+b);
	}

		public static String main() //this is method overloading
		{
			return "Tom"; 
		}
		
		
}
