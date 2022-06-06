package order;

import java.util.List;

public class order {
		private double totalAmount;
		private int orderDate;
		private String orderstatus;
		private List<OrderLine> orderLines;
		private List<Address> addresses;
		public double getTotalAmount() {
			return totalAmount;
		}
		public void setTotalAmount(double totalAmount) {
			this.totalAmount = totalAmount;
		}
		public int getOrderDate() {
			return orderDate;
		}
		public void setOrderDate(int orderDate) {
			this.orderDate = orderDate;
		}
		
		public String getOrderstatus() {
			return orderstatus;
		}
		public void setOrderstatus(String orderstatus) {
			this.orderstatus = orderstatus;
		}
		public List<OrderLine> getOrderLines() {
			return orderLines;
		}
		public void setOrderLines(List<OrderLine> orderLines) {
			this.orderLines = orderLines;
		}
		public List<Address> getAddresses() {
			return addresses;
		}
		public void setAddresses(List<Address> addresses) {
			this.addresses = addresses;
		}
	}

