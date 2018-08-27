package com.libraray.management.system.serviceImpl;

import com.library.management.system.dto.BookListData;

public class ShowBooks {
	public static void showCodingBookList() {
		BookListData.getCodingBookList().forEach(
				(books) -> System.out.println(books.getBookId() + " " + books.getBookName() + " " + books.getPrice()));
	}

	public static void showHorrorBookList() {
		BookListData.getHorrorBookList().forEach(
				(books) -> System.out.println(books.getBookId() + " " + books.getBookName() + " " + books.getPrice()));
	}

	public static void showComedyBookList() {
		BookListData.getComedyBookList().forEach(
				(books) -> System.out.println(books.getBookId() + " " + books.getBookName() + " " + books.getPrice()));
	}

	public static void showActionList() {
		BookListData.getActionList().forEach(
				(books) -> System.out.println(books.getBookId() + " " + books.getBookName() + " " + books.getPrice()));

	}

}
