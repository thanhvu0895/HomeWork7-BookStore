package Entity;

public class ReturnList {
	private ReturnRequest returnRequest;
	private Book book;
	
	public ReturnList() {
		// TODO Auto-generated constructor stub
	}

	public ReturnList(ReturnRequest returnRequest, Book book) {
		super();
		this.returnRequest = returnRequest;
		this.book = book;
	}

	public ReturnRequest getReturnRequest() {
		return returnRequest;
	}

	public void setReturnRequest(ReturnRequest returnRequest) {
		this.returnRequest = returnRequest;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}
	
}
