
public class Estudiante extends Persona{
	//La clase Estudiante hereda de la clase Presona
	
	// Variables
	private double calificacion;
	
	// Constructor con parámetros de estudiante y parámetros heredados de la clase Persona
	public Estudiante(String nombre, int edad, char sexo, double calificacion) {
		super(nombre, edad, sexo, true);
		this.calificacion = calificacion;
		novillos();
	}

	// Método heredado de la clase Persona para calcular si el estudiante hará novillos
	@Override
	public void novillos() {
		double prob = Math.random();
		if(prob > 0.5) {
			asistencia = false;
		}
	}

	public double getCalificacion() {
		return calificacion;
	}

	public boolean isAprovado() {
		if(calificacion>=5) {
			return true;
		}else {
			return false;
		}
	}

	// Método toString
	@Override
	public String toString() {
		return "\nEstudiante ["+super.toString()+"calificacion=" + calificacion + "]";
	}
}
