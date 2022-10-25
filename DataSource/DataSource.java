package DataSource;

import Entity.Book;
import Entity.BookStorage;
import Entity.BorrowList;
import Entity.BorrowRequest;
import Entity.Customer;
import Entity.ReturnList;
import Entity.ReturnRequest;
import Entity.Stock;
import Entity.Type;
import Entity.BookCategory;

public class DataSource {
	public static Book[] bookList = {
		new Book(1, "BOOK A", "1234", "Author A", 10000),
		new Book(2, "BOOK B", "5678", "Author B", 20000),
		new Book(3, "BOOK B", "5678", "Author C", 20000),
		new Book(4, "BOOK B", "5678", "Author D", 20000)
	};
	
	public static Type[] typeList = {
		new Type(1, "Novel"), 
		new Type(2, "Love"), 
		new Type(3, "Sci-fi")
	};

	public static BookCategory[] bookCategoryList = {
		new BookCategory(bookList[0], typeList[0]),
		new BookCategory(bookList[0], typeList[1]),
		new BookCategory(bookList[1], typeList[1]),
		new BookCategory(bookList[1], typeList[2])
	};
	public static BookStorage[] bookStorageList = {
		new BookStorage(1, "Syd", "120 Nguyen Binh Khiem"),
		new BookStorage(2, "Mel", "78 To Ky Q12")
	};

	public static Stock[] stockList = {
		new Stock(bookStorageList[0],bookList[0], 5000),
		new Stock(bookStorageList[0],bookList[1], 5000),
		new Stock(bookStorageList[1],bookList[0], 200),
		new Stock(bookStorageList[1],bookList[1], 300),
	};

	public static Customer[] customerList = {
		new Customer(1, "Nguyen Van A"),
		new Customer(2, "Nguyen Van B"),
		new Customer(3, "Nguyen Van C")
	};

	public static BorrowRequest[] borrowRequestList = {
		new BorrowRequest(1, customerList[0], bookStorageList[0], 1, "01/01/2010"),
		new BorrowRequest(2, customerList[0], bookStorageList[1], 1, "01/10/2020")
	};
	
	public static BorrowList[] BorrowBookList = {
		new BorrowList(borrowRequestList[0], bookList[0]),
		new BorrowList(borrowRequestList[0], bookList[1]),
		new BorrowList(borrowRequestList[1], bookList[0])
	};

	
	public static ReturnRequest[] returnRequestList = {
		new ReturnRequest(1, borrowRequestList[0], "01/05/2020"),
		new ReturnRequest(2, borrowRequestList[1], "01/05/2020")
	};
	
	public static ReturnList[] returnBookList = {
		new ReturnList(returnRequestList[0], bookList[0]),
		new ReturnList(returnRequestList[0], bookList[1])
	};
	
}
