package bookStore.entity;

public class Account {
	
	private int accountId;
	private float balance;
	
	public Account(int accountId, float balance) {
		super();
		this.setAccountId(accountId);
		this.setBalance(balance);
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}
	
	public String toString() {
		return "Account [accountId = " + accountId + ", balance = " + balance + "]";
	}

}
