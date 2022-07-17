
public abstract class Persona {

	// Variables
	protected String nombre;
	protected int edad;
	protected char sexo;
	protected boolean asistencia;
		
	// Constructor por defecto
	public Persona() {
		this("",0,'H',true);
	}

	// Construcor con todos los campos
	public Persona(String nombre, int edad, char sexo, boolean asistencia) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.asistencia = asistencia;
	}

	// Geters y seters
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
	
	// Método toString
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", asistencia=" + asistencia + "]";
	}

	// Método abstracto para que desarrollen las clases que hereden
	public abstract void novillos();
	
}
