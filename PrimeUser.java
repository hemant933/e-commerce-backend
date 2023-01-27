package ShoppingCart;


public class PrimeUser extends User{
	
	private double price;
    private double discountPercentage;

	public PrimeUser(int id, String name, String type) {
		super(id, name, type);
		
	}
	
	public void Checkout(Item[]cart , Coupon[] coupon) {
		int i;
		for(i=0;i<getIndex();i++)
		{
			price=price+cart[i].getPrice();
		}
		setCheckOutAmtBeforeDiscount(price);
     
	
		for(i=0;i<getInd();i++) {
			discountPercentage=discountPercentage +coupon[i].getDiscountPercentage();
		}
		setCheckOutAmtAfterDiscount(price-(price*discountPercentage*2)/100);
	} 

	
}
