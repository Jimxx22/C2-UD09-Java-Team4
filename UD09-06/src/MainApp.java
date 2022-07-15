

public class MainApp {
	
	final static int NUM_ESPECTADORES = 30;

	public static void main(String[] args) {
		
		Pelicula pelicula = new Pelicula("Avatar 2",200,16,"David Marcos");
		Cine cine = new Cine(pelicula, 8);
		int numEspectadores = 0;
		 
		for (int i = 0; i < NUM_ESPECTADORES; i++) {
			String nombre = generarNombre()+" "+generarNombre();
			int edad = generarEdad();
			double dinero = generarDinero();
			Espectador espectador = new Espectador(nombre, edad, dinero);
			//System.out.println(espectador);
			if(!cine.compareTo(espectador)) {
				continue;
			} 
			numEspectadores++;
			
			boolean sentado = false;
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
		
		for(int i = 0; i < cine.getAsientos().length; i++) {
			for (int j = 0; j < cine.getAsientos()[0].length; j++) {
				System.out.println(cine.getAsientos()[i][j].toString());
			}
		}
		System.out.println("Numero de espectadores: "+numEspectadores);

	}
	
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
	
	private static int generarEdad() {
		int edad;
		edad = (int)(Math.random()*100);
		return edad;
	}
	
	private static double generarDinero() {
		double dinero;
		dinero = Math.random()*50;
		return dinero;
	}

}
