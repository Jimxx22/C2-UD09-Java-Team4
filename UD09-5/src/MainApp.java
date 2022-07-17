
public class MainApp {
	
	// Variables
	final static int NUM_ALUMNOS = 30;
	static Profesor profesor;
	static Estudiante [] estudiantes;
	static Aula aula;
 
	// Método main
	public static void main(String[] args) {
		
		profesor=new Profesor(generarNombre(), generarEdad(), generarSexo(), "matematicas");
		
		generarEstudiantes();
		
		aula = new Aula(23,profesor, NUM_ALUMNOS, estudiantes, "matematicas");
		
		validadorClase();	
	}
	
	// Función que genera y rellena la array de nuevos estudiantes
	public static void generarEstudiantes() {
		estudiantes = new Estudiante[NUM_ALUMNOS];
		
		for (int i = 0; i < NUM_ALUMNOS; i++) {
			String nombre = generarNombre();
			int edad = generarEdad();
			char sexo = generarSexo();
			double nota = generarCalificacion();
			Estudiante estudiante = new Estudiante(nombre, edad, sexo, nota);
			estudiantes[i]=estudiante;
			
		}
	}
	
	// Función que informa de si se puede dar clase, si no se puede informa del porqué
	public static void validadorClase() {
		if(aula.sePuedeDarClasse()) {
			System.out.println(aula.contarSexo());
		}else if(profesor.isAsistencia()){
			System.out.println("No puede dar classe. El profesor no ha venido.");
		}else if(profesor.getMateria()!=aula.getMateria()){
			System.out.println("No puede dar classe. No es el aula asignada.");
		}else {
			System.out.println("La mayoria de alumnos no han asistido.");
		}
	}
	
	// Generador de nombres aleatorios sin sentido
	private static String generarNombre() {
		String nombre = "";
		int longitudNombre, vocal;
		longitudNombre = (int)(Math.random()*6+3);		//Longitud del nombre aleatoria de 3 a 9
		
		for(int i = 0; i < longitudNombre; i++) {
			if(i%2==0) {
				nombre += (char)(Math.random()*26+97);	//Generar letra aleatoria
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
	// Generador aleatorio de edades, de 13 y 18 años
	private static int generarEdad() {
		int edad;
		edad = (int)(Math.random()*13+5);
		return edad;
	}
	
	// Generador aleatorio de Sexos
	private static char generarSexo() {
		int n;
		n = (int)(Math.random()*2);
		
		if(n==0) {
			return 'H';
		}else {
			return 'M';
		}
		
	}
	// Generador aleatorio de calificaciones de 0 a 10
	private static double generarCalificacion() {
		double nota;
		nota = Math.random()*10;
		return nota;
	}

}
