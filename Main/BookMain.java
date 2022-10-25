package Main;

import DataSource.DataSource;
import Service.Service;

public class BookMain {
	public static void main(String[] args) {

		/*
		 *  CONSOLE LOG PROGRAM BORROW LIST:
		 */
		Service.printBorrowList(DataSource.borrowRequestList, DataSource.BorrowBookList);
	}
}
