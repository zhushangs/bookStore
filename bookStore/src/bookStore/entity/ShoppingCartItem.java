package bookStore.entity;

public class ShoppingCartItem {
	private Book book;
	private int quantity;
	
	public ShoppingCartItem(Book book) {
		this.setBook(book);
		this.setQuantity(1);
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	/*
	 * return the total money in the shoppring cart 
	 */
	
	public float getItemPrice() {
		return this.book.getPrice() * this.quantity;
	}
	
	public void increment() {
		this.quantity++;
	}
	
	public String toString() {
		return "ShoppingCartItem [book = " + book + ", quantity = " + quantity + "]";
	}
}
