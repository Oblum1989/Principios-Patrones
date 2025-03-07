package library.controller;

import library.model.Book;
import library.service.Library;

/**
 * Esta clase utiliza el principio GRASP Controller ya que es el intermediario entre la interfaz de usuario (main) y la
 * lógica de negocio (la clase Library)
 *
 */
public class LibraryController {
	private Library library;

	public LibraryController() {
		this.library = new Library();
	}

	public void addBook(String title, String author, String isbn) {
		library.addBook(title, author, isbn);
	}

	public void showBooks() {
		for (Book book : library.getLibros()) {
			System.out.println("Title: " + book.getTitle() + ", Autor: " + book.getAuthor() + ", ISBN: " + book.getIsbn());
		}
	}
}
