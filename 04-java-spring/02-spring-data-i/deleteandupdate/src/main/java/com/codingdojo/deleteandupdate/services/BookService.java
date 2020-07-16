package com.codingdojo.deleteandupdate.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.deleteandupdate.models.Book;
import com.codingdojo.deleteandupdate.repositories.BookRepository;

@Service
public class BookService {
	// adding the book repository as a dependency
	private final BookRepository bookRepository;
	
	public BookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
	
	// returns all the books
	public List<Book> allBooks() {
		return bookRepository.findAll();
	}
	
	// creates a book
	public Book createBook(Book b) {
		return bookRepository.save(b);
	}
	
	// retrieves a book
	public Book findBook(Long id) {
		Optional<Book> optionalBook = bookRepository.findById(id);
		if(optionalBook.isPresent()) {
			return optionalBook.get();
		} else {
			return null;
		}
	}
	
	// deletes a book
	public Book deleteBook(Long id) {
		Optional<Book> optionalBook = bookRepository.findById(id);
			if(optionalBook.isPresent()) {
				bookRepository.deleteById(id);
				return optionalBook.get();
			}
			return null;
	}
	
	// updates a book
	public Book updateBook(Long id, String title, String description, String lang, int numPages) {
		Optional<Book> optionalBook = bookRepository.findById(id);
		if(optionalBook.isPresent()) {
			Book bookToEdit = optionalBook.get();
			bookToEdit.setTitle(title);
			bookToEdit.setDescription(description);
			bookToEdit.setLanguage(lang);
			bookToEdit.setNumberOfPages(numPages);
			bookRepository.save(bookToEdit);
			return bookToEdit;
		}
		return null;
	}
	
	
}