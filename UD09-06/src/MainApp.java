

public class MainApp {
	
	// Si queremos que cree nuevos espectadores solo tendremos que cambiar el valor de esta constante
	final static int NUM_ESPECTADORES = 30;
	static int numEspectadores = 0;
	static Cine cine; 
	static Pelicula pelicula;
	
	public static void main(String[] args) {
		
		// Declaramos la película usando el generador aleatorio de nombres para el director
		pelicula = new Pelicula("Avatar 2",200,16,generarNombre()+" "+generarNombre());
		// construimos el cine con la pelicula atreiormente creada y el precio de la entrada
		cine = new Cine(pelicula, 8);		
		
		// Llamamos la función de generación y validación de los espectadores y los colocamos en un asiento
		genracionEspectadores();	
		
		//Mostrar información
		mostrarCine();

	}
	
	private static void mostrarCine() {
		//mostramos todos los asientos del cine i su informacion
		for(int i = 0; i < cine.getAsientos().length; i++) {
			for (int j = 0; j < cine.getAsientos()[0].length; j++) {
				System.out.println(cine.getAsientos()[i][j].toString());
			}
		}
				
		// Mostramos la película que se va a proyectar
		System.out.println("\nPelicula: "+pelicula.toString());
				
		// Mostramos quantos espectadores han entrado 
		System.out.println("Numero de espectadores: "+numEspectadores);
	}
	
	private static void genracionEspectadores() {
		
		// Generamos los espectadores
		for (int i = 0; i < NUM_ESPECTADORES; i++) {
			String nombre = generarNombre()+" "+generarNombre();
			int edad = generarEdad();
			double dinero = generarDinero();
			Espectador espectador = new Espectador(nombre, edad, dinero);
			
			// Llamamos el método compareTo de la clase Cine para saber si el espectador cumple los requisitos para ver la película,
			// si no es así nos saltamos todo lo que queda del bucle for.
			if(!cine.compareTo(espectador)) {
				continue;
			} 
			
			// Sumamos el número de espectadores que van a ver la película
			numEspectadores++;
			
			boolean sentado = false;
			
			// Le asignamos un asiento libre al espectador que cumple los requisitos 
			while(!sentado) {
				int fila,columna;
				fila = (int)(Math.random()*8);
				columna = (int)(Math.random()*9);
				if(!cine.getAsientos()[fila][columna].isOcupado()) {
					sentado = true;
					cine.getAsientos()[fila][columna].setEspectador(espectador);
					cine.getAsientos()[fila][columna].ocupado();
				}
			}
		}
	}	
	
	// Generador de nombre aleatorios sin sentido
	private static String generarNombre() {
		String nombre = "";
		int longitudNombre, vocal;
		longitudNombre = (int)(Math.random()*6+3);		//Longitud del nombre aleatoria de 3 a 9
		
		for(int i = 0; i < longitudNombre; i++) {
			if(i%2==0) {
				nombre += (char)(Math.random()*26+97);	//Generar letra aleatoria
				if(i == 0) {
					nombre.toUpperCase();
				}
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
		
		return nombre;
	}
	
	// Generador de edades aleatorias de 0 a 100
	private static int generarEdad() {
		int edad;
		edad = (int)(Math.random()*100);
		return edad;
	}
	
	// Generador de dinero aleatorio de 0 a 50
	private static double generarDinero() {
		double dinero;
		dinero = Math.random()*50;
		return dinero;
	}

}
