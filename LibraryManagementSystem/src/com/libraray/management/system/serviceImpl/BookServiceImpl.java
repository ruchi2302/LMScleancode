package com.libraray.management.system.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import com.library.management.system.dto.BookListData;
import com.library.management.system.dto.Books;
import com.library.management.system.service.BookService;

public class BookServiceImpl implements BookService {

	@Override
	public void search(int bookId) {
		Books b1 = new Books(101, "C++", "Yashwant", 260.0f, "Kartik Publication", "Programming");
		Books b2 = new Books(102, "OOP", "BalaGuruSwamy", 300f, "Laxmi Publication",  "Technology");
		Books b3 = new Books(103, "Machine Learning", "XYZ", 600f, "Laxmi Publication", " ");
		List<Books> bookList = new ArrayList<Books>();
		bookList.add(b1);
		bookList.add(b2);
		bookList.add(b3);
		bookList.stream().filter(n -> n.getBookId() == bookId).forEach(System.out::print);

	}
	
	
	public static Books getCodingBook(int id) {
		System.out.println("Selected Book");
		return BookListData.getCodingBookList().stream().filter((p) -> p.getBookId() == id).findAny().orElse(null);
	}

	public static Books getHorrorBook(int id) {
		return BookListData.getHorrorBookList().stream().filter((p) -> p.getBookId() == id).findAny().orElse(null);
	}

	public static Books getComedyBook(int id) {
		return BookListData.getComedyBookList().stream().filter((p) -> p.getBookId() == id).findAny().orElse(null);
	}

	public static Books getActionBook(int id) {
		return BookListData.getActionList().stream().filter((p) -> p.getBookId() == id).findAny().orElse(null);
	}
}
