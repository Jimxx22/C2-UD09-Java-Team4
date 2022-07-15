
public class Espectador {
	
	String nombre;
	int edad;
	Double dinero;
	
	
	
	public Espectador() {
		this ("",18,100.0);
	}
	
	public Espectador( int edad, Double dinero) {
		this ("",edad,dinero);
	}

	public Espectador(String nombre, int edad, Double dinero) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.dinero = dinero;
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

	public Double getDinero() {
		return dinero;
	}

	public void setDinero(Double dinero) {
		this.dinero = dinero;
	}

	@Override
	public String toString() {
		return "Espectador [nombre=" + nombre + ", edad=" + edad + ", dinero=" + dinero + "]";
	}

}
