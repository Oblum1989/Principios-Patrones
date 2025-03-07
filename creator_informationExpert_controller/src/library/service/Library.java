package library.service;

import java.util.ArrayList;
import java.util.List;

import library.model.Book;

/**
 * Esta clase utiliza el principio Grasp "Creator" ya que es responsable de la creación de instancias de libros y agregarlas
 * a una lista interna
 *
 */
public class Library {
	private List<Book> books;

	public Library() {
		this.books = new ArrayList<>();
	}

	public void addBook(String title, String author, String isbn) {
		Book libro = new Book(title, author, isbn);
		books.add(libro);
	}

	public List<Book> getLibros() {
		return books;
	}
}
