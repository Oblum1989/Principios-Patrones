package library;

import library.controller.LibraryController;

/**
 * Esta clase utiliza el principio GRASP de Information Expert ya que es la responsable de conocer la lógica de la app
 * y de interactuar con el controller para agregar y/o mostrar libros
 *
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LibraryController controller = new LibraryController();
		controller.addBook("El Resplandor", "Stephen King", "4578421545");
		controller.addBook("La metamorfosis", "Franz Kafka", "0987654321");

		controller.showBooks();
	}

}
