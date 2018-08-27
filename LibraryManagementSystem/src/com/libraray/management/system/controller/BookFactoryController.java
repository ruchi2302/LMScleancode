package com.libraray.management.system.controller;

import com.library.management.system.dto.Books;
import com.library.management.system.fatctory.BookCategoryFactory;

public class BookFactoryController {
	public static void startFactory() {
		Books books = BookCategoryFactory.getByCategory("ACTION").getBookName(100);

		System.out.println(books.getBookId() + " " + books.getBookName() + " " + books.getBookAuthor() + " "
				+ books.getPrice() + " " + books.getCategory());
	}

}
