package com.library.management.system.fatctory;

import com.libraray.management.system.serviceImpl.ActionBook;
import com.libraray.management.system.serviceImpl.ComedyBook;
import com.libraray.management.system.serviceImpl.HorrorBook;
import com.library.management.system.service.BookLibrary;

public class BookCategoryFactory {

	public static BookLibrary getByCategory(String type) {
		String Type = type.toUpperCase();
		switch (Type) {
		case "HORROR":
			return new HorrorBook();
		case "ACTION":
			return new ActionBook();
		case "COMEDY":
			return new ComedyBook();

		}
		return null;
	}

}
