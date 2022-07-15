
public class Estudiante extends Persona{
	
	private double calificacion;
	
	public Estudiante(String nombre, int edad, char sexo, double calificacion) {
		super(nombre, edad, sexo);
		this.calificacion = calificacion;
	}

	@Override
	public boolean novillos() {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}
