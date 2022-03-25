
public class BankDemo {
	public static void main(String[] args) {
		
		Customer customer = new Customer("vijay", "vgr", "123456", "abc@gmail.com");
		customer.displayCustomerDetails(customer);
		
		Customer customer1= new Customer("vijay Kumar", "Gudur", "123678", "cde@gmail.com");
		customer1.displayCustomerDetails(customer1);
		
		Customer customer2= new Customer("Kumar", "nellore", "910678", "fgi@gmail.com");
		customer2.displayCustomerDetails(customer2);
		
		Account account=new Account("12-06-1995",500.00,AccType.SB,customer);
		account.displayAccountDetails(account);
		
		Account account1=new Account("12-06-1995",500.00,AccType.SB,customer1);
		account1.displayAccountDetails(account1);

		
		Account account2=new Account("18-07-1997",5000.00,AccType.FD,customer2);
		account2.displayAccountDetails(account2);
	}

}
