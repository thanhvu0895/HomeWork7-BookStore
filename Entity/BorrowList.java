package Entity;

public class BorrowList {
	
	private BorrowRequest borrowRequest;
	private Book book;
	
	public BorrowList() {
		// TODO Auto-generated constructor stub
	}

	public BorrowList(BorrowRequest borrowRequest, Book book) {
		super();
		this.borrowRequest = borrowRequest;
		this.book = book;
	}

	public BorrowRequest getBorrowRequest() {
		return borrowRequest;
	}

	public void setBorrowRequest(BorrowRequest borrowRequest) {
		this.borrowRequest = borrowRequest;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}
}
