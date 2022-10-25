package Entity;

public class ReturnRequest {
	private int id;
	private BorrowRequest borrowRequest;
	private String returnTime;
	
	public ReturnRequest() {
		// TODO Auto-generated constructor stub
	}
	
	public ReturnRequest(int id, BorrowRequest borrowRequest, String returnTime) {
		super();
		this.id = id;
		this.borrowRequest = borrowRequest;
		this.returnTime = returnTime;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public BorrowRequest getBorrowRequest() {
		return borrowRequest;
	}

	public void setBorrowRequest(BorrowRequest borrowRequest) {
		this.borrowRequest = borrowRequest;
	}


	public String getReturnTime() {
		return returnTime;
	}

	public void setReturnTime(String returnTime) {
		this.returnTime = returnTime;
	}
}
