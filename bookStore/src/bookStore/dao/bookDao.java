package bookStore.dao;

import java.awt.print.Book;
import java.util.Collection;
import java.util.List;

import bookStore.entity.ShoppingCartItem;
import bookStore.web.CriteriaBook;
import bookStore.web.Page;


public interface bookDao {

	public abstract Book getBook(int id);
	
	public abstract Page<Book> getPage(CriteriaBook cb);
	
	public abstract long getTotalBookNumber(CriteriaBook cb);
	
	public abstract List<Book> getPageList(CriteriaBook cb, int pageSize);
	
	public abstract int getStoreNumber(int id);
	
	public abstract void batchUpdateStoreNumberAndSalesNumber(Collection<ShoppingCartItem> items); 
}
