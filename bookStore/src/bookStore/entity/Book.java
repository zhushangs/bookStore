package bookStore.entity;

import java.util.Date;

public class Book {
	
	private int bookId;
	private String author;
	
	private String title;
	private float price;
	
	private Date publish_date;
	private int sales_amount;
	
	private int store_number;
	private String remake;
	
	
	public Book(int bookId, String author, String title, float price, Date publish_date, int sales_amount,
			int store_number, String remake) {
		super();
		this.bookId = bookId;
		this.author = author;
		this.title = title;
		this.price = price;
		this.publish_date = publish_date;
		this.sales_amount = sales_amount;
		this.store_number = store_number;
		this.remake = remake;
	}


	public Integer getBookId() {
		return bookId;
	}


	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public float getPrice() {
		return price;
	}


	public void setPrice(float price) {
		this.price = price;
	}


	public Date getPublish_date() {
		return publish_date;
	}


	public void setPublish_date(Date publish_date) {
		this.publish_date = publish_date;
	}


	public int getSales_amount() {
		return sales_amount;
	}


	public void setSales_amount(int sales_amount) {
		this.sales_amount = sales_amount;
	}


	public int getStore_number() {
		return store_number;
	}


	public void setStore_number(int store_number) {
		this.store_number = store_number;
	}


	public String getRemake() {
		return remake;
	}


	public void setRemake(String remake) {
		this.remake = remake;
	}
	
	public String toString() {
		return "Book [ bookId = " + bookId + ", author = " + author + ", title = " + title + ", price = " + price
				+ ", publish_date = " + publish_date + ", sales_amount = " + sales_amount + ", store_number = " + 
				store_number + ", remake = " + remake + "]";
	}
	
}
