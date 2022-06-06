package order;

public class OrderLine {
	private String items;
	private double price;
	private int quatity;
	private int ETA;
	private String OrderLinestatus;
	
	public String getItem() {
		return items;
	}
	public void setItem(String item) {
		this.items = item;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuatity() {
		return quatity;
	}
	public void setQuatity(int quatity) {
		this.quatity = quatity;
	}
	public int getETA() {
		return ETA;
	}
	public void setETA(int eTA) {
		ETA = eTA;
	}
	
	public String getItems() {
		return items;
	}
	public void setItems(String items) {
		this.items = items;
	}
	public String getOrderLinestatus() {
		return OrderLinestatus;
	}
	public void setOrderLinestatus(String orderLinestatus) {
		OrderLinestatus = orderLinestatus;
	}
}
