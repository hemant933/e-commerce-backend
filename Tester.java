package ShoppingCart;

public class Tester {
	
	private User user;
	//private String type="Prime";
	
	private String type="NonPrime";
	public static void main(String[] args) {
	
		Tester test = new Tester();

	}
	public Tester() {
		
		createUser();
		
		Coupon coupon1 = new Coupon(1,5);
		Coupon coupon2 = new Coupon(2,10);
		
		Item item1=new Item(1,"mobile",20000);
		user.addItemToCart(item1);
		user.addCoupon(coupon1);
		
		Item item2=new Item(2,"earphone",2000);
		user.addItemToCart(item2);
		user.addCoupon(coupon2);
		
		user.Checkout(user.getCart(),user.getCoupon());
		
		System.out.println(user);
	}
	
	public void createUser()
	{
		if(type=="Prime")
			user=new PrimeUser(1,"Hemant","Prime");
		
		if(type=="NonPrime")
			user=new NonPrimeUser(2,"Hariom","NonPrime");
	}
	

}