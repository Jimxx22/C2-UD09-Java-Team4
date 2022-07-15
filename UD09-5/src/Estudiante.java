
public class Estudiante extends Persona{
	
	private double calificacion;
	private boolean aprovado;
	
	public Estudiante(String nombre, int edad, char sexo, double calificacion) {
		super(nombre, edad, sexo, true);
		this.calificacion = calificacion;
		novillos();
	}

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

	@Override
	public String toString() {
		return "\nEstudiante ["+super.toString()+"calificacion=" + calificacion + "]";
	}
}
