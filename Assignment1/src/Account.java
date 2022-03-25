
public class Account {

	private static final String Account_Type = null;
	private static int counter = 100000;
	int Account_Number;
	String Account_opening_date;
	Double Account_Balance;
	AccType Account_type;
	Customer customer;

	public Account(String account_opening_date, Double account_Balance, AccType account_type, Customer customer) {
		super();
		Account_opening_date = account_opening_date;
		Account_Balance = account_Balance;
		Account_type = account_type;
		this.customer = customer;
		Account_Number=counter;
		counter++;
	}
	public void displayAccountDetails(Account account) {
		System.out.println("Account Number : " + account.Account_Number);
		System.out.println("Account Balance : " + account.Account_Balance);
		System.out.println("Account Type : " + account.Account_type.toString());
		System.out.println("Customer Id : " +account.getCustomer().Customer_id );
	}
	public int getAccount_Number() {
		return Account_Number;
	}

	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	@Override
	public String toString() {
		return "Account [Account_Number=" + Account_Number + ", Account_opening_date=" + Account_opening_date
				+ ", Account_Balance=" + Account_Balance + ", Account_type=" + Account_type + "]";
	}
}

enum AccType {
	FD, SB
}
