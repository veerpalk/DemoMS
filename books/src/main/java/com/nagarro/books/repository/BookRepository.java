package com.nagarro.books.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nagarro.books.enums.ErrorCode;
import com.nagarro.books.exceptions.DataNotFoundException;
import com.nagarro.books.model.Book;

@Component
public class BookRepository {

	@Autowired
	BooksInventory booksInventory;

	public List<Book> getAllBooks() {

		return booksInventory.getBooks();

	}

	public Book getBook(String id) {
		Book foundBook = null;
		for (Book book : booksInventory.getBooks()) {
			if (book.getId().equals(id)) {
				foundBook = book;
			}
		}
		if (foundBook == null) {
			throw new DataNotFoundException(ErrorCode.NO_DATA_DOUND);
		}
		return foundBook;
	}

	public void deleteBook(String id) {
		booksInventory.getBooks().removeIf(book -> book.getId().equals(id));
	}

	public void addBook(Book book) {
		booksInventory.addBook(book);

	}

}
