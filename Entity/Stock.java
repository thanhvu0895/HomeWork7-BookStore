package Entity;

public class Stock {
	
	private BookStorage storage;
	private Book book;
	private int quantity;
	
	public Stock() {
		// TODO Auto-generated constructor stub
	}

	public Stock(BookStorage storage, Book book, int quantity) {
		super();
		this.storage = storage;
		this.book = book;
		this.quantity = quantity;
	}

	public BookStorage getStorage() {
		return storage;
	}

	public void setStorage(BookStorage storage) {
		this.storage = storage;
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
	
}
