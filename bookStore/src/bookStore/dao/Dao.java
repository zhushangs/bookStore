package bookStore.dao;

import java.util.List;

public interface Dao<T> {

	/*
	 * @ param sql: sql
	 * @ param args: args
	 * @ return new created ID
	 */
	long insert(String sql, Object ...args);
	
	void update(String sql, Object ...args);
	
	T query(String sql, Object ...args);
	
	List<T> queryForList(String sql, Object ...args);
	
	<V> V getStringVal(String sql, Object ...args);
	
	void batch(String sql, Object[] ...args);
}
