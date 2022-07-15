
public class Cine {
	
	private Pelicula peli;
	private double precio;
	
	public Cine() {
		this.precio = 0.0;
	}

	public Cine(Pelicula peli, double precio) {
		super();
		this.peli = peli;
		this.precio = precio;
	}

	public Pelicula getPeli() {
		return peli;
	}

	public void setPeli(Pelicula peli) {
		this.peli = peli;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Cine [precio=" + precio + "]";
	}
	
	
}
