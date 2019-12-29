package bookStore.dao;

import bookStore.entity.User;

public interface UserDao {

	public abstract User getUser(String username);
}
