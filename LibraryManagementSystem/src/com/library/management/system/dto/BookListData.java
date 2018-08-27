package com.library.management.system.dto;

import java.util.ArrayList;

public class BookListData {

	public static ArrayList<Books> getCodingBookList() {
		ArrayList<Books> list = new ArrayList<Books>();
		list.add(new Books(101, "Java", "XYZ", 550f, "Laxmi Publication", "CODING"));
		list.add(new Books(102, "C++", "PQR", 650f, "Dheeru Publication", "CODING"));
		list.add(new Books(103, "C", "Yashwant", 750, "ABC", "CODING"));
		list.add(new Books(104, "VB", "AMAN", 850, "OBC", "CODING"));
		return list;
	}

	public static ArrayList<Books> getHorrorBookList() {
		ArrayList<Books> list = new ArrayList<>();
		list.add(new Books(101, "Shirley", "hfg", 1000, "fgsfj", "HORROR"));
		list.add(new Books(102, "Frank", "dgs", 2000, "jfsjk", "HORROR"));
		list.add(new Books(103, "Stephen", "gsgjh", 3000, "ydfgajgf", "HORROR"));
		list.add(new Books(104, "Ghost Story", "gdjhsg", 4000, "fgsjkdfg", "HORROR"));

		return list;
	}

	public static ArrayList<Books> getComedyBookList() {
		ArrayList<Books> list = new ArrayList<>();
		list.add(new Books(101, "Three Men in a Boat", "dgjg", 173, "gdjh", "COMEDY"));
		list.add(new Books(102, "Queen Lucia.", "fhjcs", 432, "shgfsjhg", "COMEDY"));
		list.add(new Books(103, "The Loved One.", "sdassq", 968, "fhgsjg", "COMEDY"));
		list.add(new Books(104, "The Diary of a Nobody.", "sdsafa", 354, "efegh", "COMEDY"));
		return list;
	}

	public static ArrayList<Books> getActionList() {
		ArrayList<Books> list = new ArrayList<>();
		list.add(new Books(100, "Thor", "sdjsg", 123, null, "ACTION"));
		list.add(new Books(456, "Avengers", null, 432, null, "ACTION"));
		list.add(new Books(797, "IronMan", null, 968, null, "ACTION"));
		list.add(new Books(753, " AntMan", null, 354, null, "ACTION"));
		return list;
	}

}
