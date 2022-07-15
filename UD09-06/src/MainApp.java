
public class MainApp {
	
	final static int NUM_ESPECTADORES = 30;

	public static void main(String[] args) {
		
		Pelicula pelicula = new Pelicula("Avatar 2",200,16,"David Marcos");
		Cine cine = new Cine(pelicula, 20);
		 
		for (int i = 0; i < NUM_ESPECTADORES; i++) {
			String nombre = generarNombre();
			int edad = generarEdad();
			double dinero = generarDinero();
			Espectador espectador = new Espectador(nombre, edad, dinero);
		}

	}
	
	private static String generarNombre() {
		String nombre = "";
		int longitudNombre, vocal;
		longitudNombre = (int)Math.random()*6+3;		//Longitud del nombre aleatoria de 3 a 9
		
		for(int i = 0; i < longitudNombre; i++) {
			if(i%2==0) {
				nombre += (char)Math.random()*26+97;	//Generar letra aleatoria
			} else {
				vocal = (int) (Math.random()*5);		//generar letra vocal aleatoria
				switch (vocal) {
				case 0:
					nombre += 'a';
					break;
				case 1:
					nombre += 'i';
					break;
				case 2:
					nombre += 'u';
					break;
				case 3:
					nombre += 'e';
					break;
				case 4:
					nombre += 'o';
					break;
				}
			}
		}
		
		return "";
	}
	
	private static int generarEdad() {
		int edad;
		edad = (int)Math.random()*100;
		return 0;
	}
	
	private static double generarDinero() {
		double dinero;
		dinero = Math.random()*50;
		return 0.0;
	}

}
