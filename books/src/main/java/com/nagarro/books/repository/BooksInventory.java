package com.nagarro.books.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.nagarro.books.model.Book;

@Component
public class BooksInventory {

	private static List<Book> books= new ArrayList<Book>() {
		{
		add(new Book("1", "beWise", "veer"));
		add(new Book("2", "yesDoIt", "gunnu"));
		add(new Book("3", "JustThink", "veer"));
		}
	};

	public static List<Book> getBooks() {
		return books;
	}

	public static void setBooks(List<Book> books) {
		BooksInventory.books = books;
	}

	public void addBook(Book book) {
		this.books.add(book);
		
	}
	

}
