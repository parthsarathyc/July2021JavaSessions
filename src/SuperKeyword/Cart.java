package SuperKeyword;

public class Cart  extends Product{
		
	//creating constructors of cart class 
	
	public Cart()
	{	super(10); 
	System.out.println("default  constructor for cart class ");
	}
	
	public Cart(int price) //1000 will be given to the constructor
	{	super(price); 
	System.out.println("default  constructor for cart class ");
	}

	int maxPrice=200;
	
	public void getPrice() {
		System.out.println("cart price" + maxPrice);
		System.out.println("product price " + super.maxPrice); 
		System.out.println(super.finalPrice); //output 1100 -Step 5 from Product class 
		}
	
	@Override
	public void delivery() 
	{
		
		System.out.println("deliver the prouct to the given cart address");
		super.delivery();
	}
	
	public static void main(String[] args) {
	
		Cart obj= new Cart(1000); // this will be given to the constructor 
		
		obj.getPrice();

		


		
	}

}
