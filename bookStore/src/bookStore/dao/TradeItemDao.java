package bookStore.dao;

import java.util.Collection;
import java.util.Set;

import bookStore.entity.TradeItem;

public interface TradeItemDao {

	public abstract void batchSave(Collection<TradeItem> items);
	
	public abstract Set<TradeItem> getTradeItemWithTradeId(int tradeId);
}
