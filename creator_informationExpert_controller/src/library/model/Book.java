package library.model;

public class Book {
	private String title;
	private String author;
	private String isbn;

	public Book(String titulo, String autor, String isbn) {
		this.title = titulo;
		this.author = autor;
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public String getIsbn() {
		return isbn;
	}
}
