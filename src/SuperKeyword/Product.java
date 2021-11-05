package SuperKeyword;

public class Product {

	int finalPrice;  // 1100 will be assigned from this.finalprice (step 20) 
	public Product()   
	{
		System.out.println("default constructor");
	}
	
	public Product(String name) 
	{
		System.out.println("One parameter const" + name);
	}
	
	
	public Product(int price)  //1000 from Cart class will be sent here 
	{
		System.out.println("One parameter const" + price );
		this.finalPrice=price +10; // 1000+10=1100-> will be assigned to finalPrice
	}
	
	int maxPrice =100; 
	
	public void delivery() 
	{
		System.out.println("deliver the prouct to the given address");
	}
	
	public static void main(String[] args) {
	
		Product p = new Product(); 
		System.out.println(p.maxPrice);
		
		
	}

}
