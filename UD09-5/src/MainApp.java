
public class MainApp {
	
	final static int NUM_ALUMNOS = 30;

	public static void main(String[] args) {
		
		Profesor profesor=new Profesor(generarNombre(), generarEdad(), generarSexo(), "matematicas");
		Estudiante [] estudiantes = new Estudiante[NUM_ALUMNOS];
		
		for (int i = 0; i < NUM_ALUMNOS; i++) {
			String nombre = generarNombre();
			int edad = generarEdad();
			char sexo = generarSexo();
			double nota = generarCalificacion();
			Estudiante estudiante = new Estudiante(nombre, edad, sexo, nota);
			estudiantes[i]=estudiante;
			
		}
		
		Aula aula = new Aula(23,profesor, NUM_ALUMNOS, estudiantes, "matematicas");
		
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
	
	private static int generarEdad() {
		int edad;
		edad = (int)(Math.random()*13+5);
		return edad;
	}
	
	private static char generarSexo() {
		int n;
		n = (int)(Math.random()*2);
		
		if(n==0) {
			return 'H';
		}else {
			return 'M';
		}
		
	}
	
	private static double generarCalificacion() {
		double nota;
		nota = Math.random()*10;
		return nota;
	}

}
