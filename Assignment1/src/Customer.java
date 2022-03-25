
public class Customer {

	private static int counter = 1000;
	public int Customer_id;
	public String Customer_Name, Customer_Address, Customer_Telephone, Customer_Email;

	public int getCustomerId() {
		return Customer_id;
	}

	public Customer(String customer_Name, String customer_Address, String customer_Telephone, String customer_Email) {
		super();
		Customer_Name = customer_Name;
		Customer_Address = customer_Address;
		Customer_Telephone = customer_Telephone;
		Customer_Email = customer_Email;

		Customer_id = ++counter;
	}

	public void displayCustomerDetails(Customer customer) {
		System.out.println("Customer ID : " + customer.Customer_id);
		System.out.println("Customer Name :  " + customer.Customer_Name);
		System.out.println("Customer Address :  " + customer.Customer_Address);
		System.out.println("Customer Email :  " + customer.Customer_Email);
		System.out.println("Customer Phone :  " + customer.Customer_Telephone);
	}

	@Override
	public String toString() {
		return "Customer [Customer_id=" + Customer_id + ", Customer_Name=" + Customer_Name + ", Customer_Address="
				+ Customer_Address + ", Customer_Telephone=" + Customer_Telephone + ", Customer_Email=" + Customer_Email
				+ "]";
	}

}