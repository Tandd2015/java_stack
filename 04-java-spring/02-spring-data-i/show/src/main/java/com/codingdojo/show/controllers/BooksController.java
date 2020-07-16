package com.codingdojo.show.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.codingdojo.show.services.BookService;
import com.codingdojo.show.models.Book;

@Controller
public class BooksController {
	
	private final BookService bookService;
	
	public BooksController(BookService bookService) {
		this.bookService = bookService;
	}

	public BookService getBookService() {
		return bookService;
	}
	
	// page display new Book (jsp)
	@RequestMapping("/books/new")
	public String newBook(@ModelAttribute("book") Book book) {
		return "/books/new.jsp";
	}
	
	// show all Books
	@RequestMapping("/books")
	public String index(Model model) {
		List<Book> books = bookService.allBooks();
		model.addAttribute("books", books);
		return "/books/index.jsp";
	}
	
	// create new Book post for form
	@RequestMapping(value="/books", method=RequestMethod.POST)
	public String create (@Valid @ModelAttribute("book") Book book, BindingResult result) {
		if(result.hasErrors()) {
			return "/books/new.jsp";
		} else {
			bookService.createBook(book);
			return "redirect:/books";
		}
	}
	
	// show one Book
	@RequestMapping("/books/{id}")
	public String show(@PathVariable("id") Long id, Model model) {
		Book book = bookService.findBook(id);
		model.addAttribute("book", book);
		return "/books/show.jsp";
	}
	
	// page display update Book (jsp)
	@RequestMapping("/books/{id}/edit")
	public String edit(@PathVariable("id") Long id, Model model) {
		Book book = bookService.findBook(id);
		model.addAttribute("book", book);
		return "/books/edit.jsp";
	}
	
	// updates the current book from a form 
	@RequestMapping(value="/books/{id}", method=RequestMethod.PUT)
	public String update(@Valid @ModelAttribute("book") Book book, BindingResult result) {
		if(result.hasErrors()) {
			return "/books/edit.jsp";
		} else {
			bookService.updatedBook(book);
			return "redirect:/books";
		}
    }
	
	// deletes the current 
	@RequestMapping(value="/books/{id}", method=RequestMethod.DELETE)
	public String destroy(@PathVariable("id") Long id) {
		bookService.deleteBook(id);
		return "redirect:/books";
	}
}	
