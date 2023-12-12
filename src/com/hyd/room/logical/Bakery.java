package com.hyd.room.logical;

public class Bakery {
	private int shopId;
	private String shopName;
	private String itemName;
	private double price;
	
	
	@Override
	public String toString() {
		return "Bakery [shopId=" + shopId + ", shopName=" + shopName + ", itemName=" + itemName + ", price=" + price
				+ "]";
	}

	public int getShopId() {
		return shopId;
	}

	public Bakery(int shopId, String shopName, String itemName, double price) {
		super();
		this.shopId = shopId;
		this.shopName = shopName;
		this.itemName = itemName;
		this.price = price;
	}

	public void setShopId(int shopId) {
		this.shopId = shopId;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
