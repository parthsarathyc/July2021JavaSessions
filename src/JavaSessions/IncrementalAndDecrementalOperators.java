package JavaSessions;

public class IncrementalAndDecrementalOperators {

	public static void main(String[] args) {

      
		int a=1;
		System.out.println(a); // output 1. 
		int b=a++; 
		System.out.println(a); //output 2 -->increase the value of a by 1. 
		System.out.println(b); //output 1 -->  original value of " a" to be given to b. 
		
		int c=-99;
		int d=c++;
		
		System.out.println(c);// output -98
		System.out.println(d);//output -99
		
				
		int h=1;
		int g=++h; 
		System.out.println(h); //output 2 --> increase the value of a by 1
		System.out.println(g); //output 2--> increase the value then assign it to g. 
		
		int p=-97;
		int q=++p; 
		
		System.out.println(p); //output -96
		System.out.println(q);  // output -96
		
		// post decrement  : -- ( decrease the value by 1) 
		
		int r =2;
		int s= r--; 
		
		System.out.println(r); //output 1
		System.out.println(s); //output 2, original value of r given to s
		
		
		int	x= -999;
		int y =x--; 
		
		System.out.println(x);//output -1000
		System.out.println(y); //output -999
		
		//Pre decrement 
		
		int u=2;
		int v=--u; 
		
		System.out.println(u); // output  1
		System.out.println(v);//output 1
		
		int n=2;  // interview question 
		System.out.println(n++); //output 2, due to left to right execution n will be printed first then ++ operation
		System.out.println(n);//output 3,  post increment operator in above step n will be stored in the memory. 
		
		int m=3;
		System.out.println(++m);//output 4. m is increased increased inside the memory with per increment operator.
		
		int f='a';
		int k='b'; 
		
		System.out.println(f); // print ASCII value of a i.e 97
		System.out.println(f+k); // adds ASCII value of a and b i.e 195. 
		
		char b1='a'; 
		char b2='b'; 
		System.out.println(b1+b2); //output 195
		System.out.println(""+b1+b2);// output ab
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
