package ShoppingCart;

public class Coupon {
	
	private int id;
	private int discountPercentage;

	public Coupon() {
		// TODO Auto-generated constructor stub
	}

	public Coupon(int id, int discountPercentage) {
		super();
		this.id = id;
		this.discountPercentage = discountPercentage;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDiscountPercentage() {
		return discountPercentage;
	}

	public void setDiscountPercentage(int discountPercentage) {
		this.discountPercentage = discountPercentage;
	}

	@Override
	public String toString() {
		return "Coupon [id=" + id + ", discountPercentage=" + discountPercentage + "]";
	}
	
	

}
