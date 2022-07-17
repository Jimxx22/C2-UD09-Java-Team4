
public class MainApp {

	public static void main(String[] args) {

		// Declaramos los dos libros
		Libro libro1 = new Libro("978-84-08-25733-2","La ladrona de huesos","Manel Loureiro",504);
		Libro libro2 = new Libro("978-84-233-6158-8","El camino del fuego","Maria Oruna",400);
		
		// Mostramos los dos libros con sus métodos toString
		System.out.println(libro1);
		System.out.println(libro2);
		
		// Llamamos al método que compara las páginas de los libros
		libro1.masPaginas(libro2);
		
	}

}
