package com.libraray.management.system.serviceImpl;

import com.library.management.system.dto.Books;
import com.library.management.system.service.BookLibrary;

public class CodingBook implements BookLibrary {

	@Override
	public Books getBookName(int bookid) {
		ShowBooks.showCodingBookList();
		return BookServiceImpl.getCodingBook(bookid);
	}

}
