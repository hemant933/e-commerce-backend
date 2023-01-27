package ShoppingCart;

import java.util.Arrays;

public  abstract class User {
	
	int id;
	private String name;
	private String type;
	private Item[] cart;
	private double checkOutAmtBeforeDiscount;
	private double checkOutAmtAfterDiscount;
	private Coupon[] coupon;
	private int indexToitem;
	private int index=0;
	
	private int ind=0;
	
	public double getCheckOutAmtAfterDiscount() {
		return checkOutAmtAfterDiscount;
	}


	public void setCheckOutAmtAfterDiscount(double checkOutAmtAfterDiscount) {
		this.checkOutAmtAfterDiscount = checkOutAmtAfterDiscount;
	}

	
	public User(int id, String name, String type) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
	}
	
	
	public double getCheckOutAmtBeforeDiscount() {
		return checkOutAmtBeforeDiscount;
	}


	public void setCheckOutAmtBeforeDiscount(double checkOutAmtBeforeDiscount) {
		this.checkOutAmtBeforeDiscount = checkOutAmtBeforeDiscount;
	}





	public Coupon[] getCoupon() {
		return coupon;
	}


	public void setCoupon(Coupon[] coupon) {
		this.coupon = coupon;
	}


	public int getInd() {
		return ind;
	}


	public void setInd(int ind) {
		this.ind = ind;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}


	public Item[] getCart() {
		return cart;
	}

	public void setCart(Item[] cart) {
		this.cart = cart;
	}

	public int getIndexToitem() {
		return indexToitem;
	}


	public void setIndexToitem(int indexToitem) {
		this.indexToitem = indexToitem;
	}

	public void addItemToCart(Item item) {
		if(item ==null)
			return;
		if(cart==null)
			cart=new Item[2];
		cart[index++]=item;
  	
	}
	
	public void addCoupon(Coupon coupons){
		if (coupons==null)
			return;
		if(coupon==null)
			coupon=new Coupon[2];
		coupon[ind++]=coupons;
		
	}
	
	public int getIndex() {
		return index;
	}


	public void setIndex(int index) {
		this.index = index;
	}

	public abstract void Checkout(Item[]cart , Coupon[] coupon);


	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", type=" + type + ", cart=" + Arrays.toString(cart)
				+ ", checkOutAmtBeforeDiscount=" + checkOutAmtBeforeDiscount + ", checkOutAmtAfterDiscount="
				+ checkOutAmtAfterDiscount + ", coupon=" + Arrays.toString(coupon) + "]";
	}

}
