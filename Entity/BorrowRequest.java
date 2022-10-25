package Entity;

public class BorrowRequest {
	private int id;
	private Customer customer;
	private BookStorage storage;
	private int quantity;
	private String checkoutTime;
	
		
	public BorrowRequest() {
		// TODO Auto-generated constructor stub
	}


	public BorrowRequest(int id, Customer customer, BookStorage storage, int quantity, String checkoutTime) {
		super();
		this.id = id;
		this.customer = customer;
		this.storage = storage;
		this.quantity = quantity;
		this.checkoutTime = checkoutTime;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Customer getCustomer() {
		return customer;
	}


	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	public BookStorage getStorage() {
		return storage;
	}


	public void setStorage(BookStorage storage) {
		this.storage = storage;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public String getCheckoutTime() {
		return checkoutTime;
	}


	public void setCheckoutTime(String checkoutTime) {
		this.checkoutTime = checkoutTime;
	}
	
}
