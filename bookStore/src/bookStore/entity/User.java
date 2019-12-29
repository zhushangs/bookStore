package bookStore.entity;

import java.util.HashSet;
import java.util.Set;

public class User {
	
	private int userId;
	private int accountId;
	private String userName;
	private Set<Trade> trades = new HashSet<Trade>();
	
	public User(int userId, String username, int accountId) {
		super();
		this.userId = userId;
		this.userName = username;
		this.accountId = accountId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Set<Trade> getTrades() {
		return trades;
	}

	public void setTrades(Set<Trade> trades) {
		this.trades = trades;
	}
	
	public String toString() {
		return "UserInfo [userId = " + userId + ", username = " + userName + ", accountId = " + accountId + "]";
	}

}
