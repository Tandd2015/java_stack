package com.codingdojo.show.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.show.models.Book;
import com.codingdojo.show.repositories.BookRepository;

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

		// updates a book
	public Book updatedBook(Book book) {
		return this.bookRepository.save(book);
	}
	
	// updates a book
	public Book updateBook(Long id, String title, String description, String language, Integer numOfPages) {
		Optional<Book> optionalBook = bookRepository.findById(id);
		if(optionalBook.isPresent()) {
			Book bookToEdit = optionalBook.get();
			bookToEdit.setTitle(title);
			bookToEdit.setDescription(description);
			bookToEdit.setLanguage(language);
			bookToEdit.setNumberOfPages(numOfPages);
			bookRepository.save(bookToEdit);
			return bookToEdit;
		}
		return null;
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
}
