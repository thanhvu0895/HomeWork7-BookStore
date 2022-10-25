package Service;

import java.util.ArrayList;

import Entity.Book;
import Entity.BookStorage;
import Entity.BorrowList;
import Entity.BorrowRequest;
import Entity.Customer;
import Entity.ReturnList;
import Entity.ReturnRequest;
import Entity.Stock;
import Entity.Type;

public class Service {

	public static void printBorrowList (BorrowRequest[] borrowRequests, BorrowList[] borrowList){
		//1. show borrows list
		System.out.println("BORROW LIST");
		
		//2. show borrow and return status of a book		
		System.out.println("|| ID ||      CUSTOMER NAME      ||   STORAGE NAME   ||  DATE BORROWED  ||     LIST BOOK          ||   BOOK AUTHOR   ||   ISBN   ||");
		System.out.println("||----||-------------------------||------------------||-----------------||------------------------||-----------------||----------||");
		for (BorrowRequest br : borrowRequests) {
			if (br == null) {
				System.out.println("No borrowed Book");
				break;
			} else {
				String customerName = br.getCustomer().getName();
				String storageName = br.getStorage().getName();
				String dateBorrowed = br.getCheckoutTime();
				for (int i = 0; i < borrowList.length; i++){
					if (borrowList[i].getBorrowRequest().getId() == br.getId()){
						String bookName = borrowList[i].getBook().getName();
						String Author = borrowList[i].getBook().getAuthor();
						String ISBN = borrowList[i].getBook().getIsbn();
						System.out.printf("|| 0%d ||       %s      ||       %s        ||    %s   ||", i+1 , customerName, storageName, dateBorrowed);
						System.out.printf(" %s                 ||  %s       || %s     ||\n", bookName, Author, ISBN);
					}
				}
			}
		}
	}

	
	
	/***
	 * 
	 * @param borrowRequestId
	 * @param borrowRequests
	 * @return Customer Name from Borrow Request ID
	 */

	public static String getCustomerNameByBorrowRequest(int borrowRequestId, BorrowRequest[] borrowRequests , Customer[] customers) {
		for (BorrowRequest b : borrowRequests) {
			if(b.getId() == borrowRequestId) {
				int customerId = b.getCustomer().getId();
				return getCustomerNameById(customerId, customers);
			}
		}
		return null;
	}
	
	
	/***
	 * 
	 * @param customerId
	 * @param customers
	 * @return
	 */
	public static String getCustomerNameById (int customerId, Customer[] customers) {
		for (Customer c: customers) {
			if(c.getId() == customerId) {
				return c.getName();
			}
		}
		return null;
	}


	public static String getStorageNameByStorageId (int storageId, BookStorage[] bookStorages) {
		for (BookStorage bs: bookStorages) {
			if(bs.getId() == storageId) {
				return bs.getName();
			}
		}
		return null;
	}
}
