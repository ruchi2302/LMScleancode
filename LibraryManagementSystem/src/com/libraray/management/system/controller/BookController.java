package com.libraray.management.system.controller;

import java.util.Scanner;

import com.libraray.management.system.serviceImpl.BookServiceImpl;

public class BookController {
	public static void main(String[] args) {
		BookServiceImpl bookserviceimpl = new BookServiceImpl();
		Scanner sc = new Scanner(System.in);
		int bookId = sc.nextInt();
		bookserviceimpl.search(bookId);
	}

}
