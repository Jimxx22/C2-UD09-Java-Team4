
public class MainApp {

	public static void main(String[] args) {

		Libro libro1 = new Libro("978-84-08-25733-2","La ladrona de huesos","Manel Loureiro",504);
		Libro libro2 = new Libro("978-84-233-6158-8","El camino del fuego","Maria Oruna",400);
		
		System.out.println(libro1);
		System.out.println(libro2);
		if(libro1.getPaginas()>libro2.getPaginas()) {
			System.out.println("El libro con max paginas es "+libro1.getPaginas());
		} else {
			System.out.println("El libro con max paginas es "+libro2.getPaginas());
		}

	}

}
