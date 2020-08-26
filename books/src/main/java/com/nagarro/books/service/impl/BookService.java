package com.nagarro.books.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.books.model.Book;
import com.nagarro.books.repository.BookRepository;

@Service
public class BookService {

	@Autowired
	BookRepository bookRepository;

	public List<Book> getAllBooks() {

		return bookRepository.getAllBooks();
	}

	public Book getBook(String id) {
		return bookRepository.getBook(id);
	}

	public void addBook(Book book) {
		bookRepository.addBook(book);

	}
	
	public void deleteBook(String id)
	{
		bookRepository.deleteBook(id);
	}

}
