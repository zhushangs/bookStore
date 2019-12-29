package bookStore.entity;

public class TradeItem {
	
	private int itemId;
	private int quantity;
	private int tradeId;
	private int bookId;
	private Book book;
	

	public TradeItem(int itemId, int quantity, int tradeId, Book book) {
		super();
		this.itemId = itemId;
		this.quantity = quantity;
		this.tradeId = tradeId;
		this.book = book;
	}


	public int getItemId() {
		return itemId;
	}


	public void setItemId(int itemId) {
		this.itemId = itemId;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public int getTradeId() {
		return tradeId;
	}


	public void setTradeId(int tradeId) {
		this.tradeId = tradeId;
	}


	public int getBookId() {
		return bookId;
	}


	public void setBookId(int bookId) {
		this.bookId = bookId;
	}


	public Book getBook() {
		return book;
	}


	public void setBook(Book book) {
		this.book = book;
	}
	
	public String toString() {
		return "TradeItem [itemId = " + itemId + ", quantity = " + quantity + ", tradeId = " + tradeId + ", book = " 
				+ book + "]";
	}
	
}
