package bookStore.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Trade {
	
	private int tradeId;
	private int userId;
	private Date tradeTime;
	private Set<TradeItem> item = new HashSet<>();
	
	public Trade(int tradeId, int userId, Date tradetime) {
		super();
		this.tradeId = tradeId;
		this.userId = userId;
		this.tradeTime = tradetime;
	}

	public int getTradeId() {
		return tradeId;
	}

	public void setTradeId(int tradeId) {
		this.tradeId = tradeId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public Date getTradeTime() {
		return tradeTime;
	}

	public void setTradeTime(Date tradeTime) {
		this.tradeTime = tradeTime;
	}

	public Set<TradeItem> getItem() {
		return item;
	}

	public void setItem(Set<TradeItem> item) {
		this.item = item;
	}
	
	public String toString() {
		return "Trade [tradeId = " + tradeId + ", userId = " + userId + ", tradeTime = " + tradeTime + "]";
	}

}
