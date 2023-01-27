package ShoppingCart;


public  class NonPrimeUser extends User{
	
	private double price;
	  private double discountPercentage;

	public NonPrimeUser(int id, String name, String type) {
		super(id, name, type);
		
	}
	
	public void Checkout(Item[] cart , Coupon[] coupon) {
		int i;
		for(i=0;i<getIndex();i++)
		{
			price=price+cart[i].getPrice();
		}
		setCheckOutAmtBeforeDiscount(price+150.0);

		
		for(i=0;i<getInd();i++) {
			discountPercentage=discountPercentage +coupon[i].getDiscountPercentage();
		}
		setCheckOutAmtAfterDiscount(price-(price*discountPercentage)/100);
	} 

	}

