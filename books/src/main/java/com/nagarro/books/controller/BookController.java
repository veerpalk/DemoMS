package com.nagarro.books.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.books.model.Book;
import com.nagarro.books.service.impl.BookService;

@RestController
@RequestMapping(value = "/books")
public class BookController {

	Logger log = LogManager.getLogger(BookController.class);

	@Autowired
	BookService bookService;

	@GetMapping("/")
	public List<Book> getAllBooks() {
		log.info("Get All Books..");
		return bookService.getAllBooks();

	}

	@GetMapping("/{id}")
	public Book getBook(@PathVariable String id) {
		log.info("get book with id:{} ", id);
		return bookService.getBook(id);
	}

	@DeleteMapping("{/id}")
	public void deleteBook(@PathVariable String id) {
		log.info("delete book with id:{} ", id);
		bookService.deleteBook(id);
	}

	@PostMapping("/")
	public void addBook(@RequestBody Book book) {
		log.info("add book with id:{} ", book);
		bookService.addBook(book);
	}

}
