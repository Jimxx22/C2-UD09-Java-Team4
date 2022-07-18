
public class Espectador {
	
	// Variables
	private String nombre;
	private int edad;
	private Double dinero;
	
	
	// Constructor por defecto
	public Espectador() {
		this ("",18,100.0);
	}
	
	// Constructo con la edad y el dinero solo
	public Espectador( int edad, Double dinero) {
		this ("",edad,dinero);
	}

	// Constructor con todos los parámetros
	public Espectador(String nombre, int edad, Double dinero) {
		this.nombre = nombre;
		this.edad = edad;
		this.dinero = dinero;
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

	public Double getDinero() {
		return dinero;
	}

	public void setDinero(Double dinero) {
		this.dinero = dinero;
	}

	// Método toString para mostrar la información del espectador
	@Override
	public String toString() {
		return "Espectador [nombre=" + nombre + ", edad=" + edad + ", dinero=" + dinero + "]";
	}

}
