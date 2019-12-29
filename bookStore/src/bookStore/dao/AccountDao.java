package bookStore.dao;

import bookStore.entity.Account;

public interface AccountDao {

	public abstract Account getAccount(int id);
	
	public abstract void updateBanlance(int accountid, float amount);
	
}
