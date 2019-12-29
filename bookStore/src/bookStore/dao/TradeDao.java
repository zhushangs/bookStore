package bookStore.dao;

import java.util.Set;

import bookStore.entity.Trade;

public interface TradeDao {

	public abstract int insert(Trade trade);
	
	public abstract Set<Trade> getTradesWithUserId(int userId);
}
