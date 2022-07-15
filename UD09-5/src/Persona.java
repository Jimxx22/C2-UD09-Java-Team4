
public abstract class Persona {

	protected String nombre;
	protected int edad;
	protected char sexo;
	protected boolean asistencia;
		
	public Persona() {
		this("",0,'H',true);
	}

	public Persona(String nombre, int edad, char sexo, boolean asistencia) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.asistencia = asistencia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public boolean isAsistencia() {
		return asistencia;
	}

	public void setAsistencia(boolean asistencia) {
		this.asistencia = asistencia;
	}
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", asistencia=" + asistencia + "]";
	}

	public abstract void novillos();
	
}
