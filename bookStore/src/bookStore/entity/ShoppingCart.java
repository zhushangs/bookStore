package bookStore.entity;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {

	private Map<Integer, ShoppingCartItem> books = 
			new HashMap<Integer, ShoppingCartItem>();
	
	
	public void addBook(Book book) {
		ShoppingCartItem item = books.get(book.getBookId());
		
		if (item == null) {
			item = new ShoppingCartItem(book);
			books.put(book.getBookId(), item);
		} else {
			item.increment();
		}
	}
	
	
	public Collection<ShoppingCartItem> getItems() {
		return books.values();
	}
	
	
	public int getBookQuantity() {
		int bookQuantity = 0;
		
		for(ShoppingCartItem item: books.values()) {
			bookQuantity += item.getQuantity();
		}
		
		return bookQuantity;
	}
	
	public float getTotalPrice() {
		float total = 0;
		
		for(ShoppingCartItem item: books.values()) {
			total = item.getItemPrice();
		}
		
		return total;
	}
	
	public void removeItem(int bookId) {
		books.remove(bookId);
	}
	
	public void updateQuantity(int bookId, int quantity) {
		ShoppingCartItem item = books.get(bookId);
		
		if(item != null) {
			item.setQuantity(quantity);
		}
		
	}
	
	public void clearCart() {
		this.books.clear();
	}
	
	public boolean isEmpty() {
		return books.isEmpty();
	}
	
	public boolean hasBook(int id) {
		return books.containsKey(id);
	}
	
	public Map<Integer, ShoppingCartItem> getBooks() {
		return books;
	}
	
	public String toString() {
		return "ShoppingCart [books=" + books + "]";
	}
	
}
