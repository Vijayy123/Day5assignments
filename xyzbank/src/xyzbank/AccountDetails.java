package xyzbank;

public class AccountDetails{
	String owner_name;
	Address addr;
	private String accType;

	public String getAccType() {
		return accType;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}

	int Amount;
	String Status;

	public AccountDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getOwner_name() {
		return owner_name;
	}

	public void setOwner_name(String owner_name) {
		this.owner_name = owner_name;
	}

	public int getAmount() {
		return Amount;
	}

	public void setAmount(int amount) {
		Amount = amount;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	@Override
	public String toString() {
		return "AccountDetails [owner_name=" + owner_name + ", addr=" + addr + ", accType=" + accType + ", Amount="
				+ Amount + ", Status=" + Status + "]";
	}

	

	

	
}
