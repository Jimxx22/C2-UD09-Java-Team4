
public class Cine {
	
	private static final int MAX_FILA = 8;
	private static final int MAX_COLUMNA = 9;
	
	private Pelicula peli;
	private double precio;
	private Asiento[][] asientos = new Asiento[MAX_FILA][MAX_COLUMNA];
	
	public Cine() {
		this.peli = new Pelicula();
		this.precio = 0.0;
		for (int i = 0; i < asientos.length; i++) {
			for (int j = 0; j < asientos[0].length ; j++) {
				this.asientos [i][j] = new Asiento(i+1,(char)(65 + j));
			}
		}
	}

	public Cine(Pelicula peli, double precio) {
		this.peli = peli;
		this.precio = precio;
		for (int i = 0; i < asientos.length; i++) {
			for (int j = 0; j < asientos[0].length ; j++) {
				this.asientos [i][j] = new Asiento(i+1,(char)(65 + j));
			}
		}
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
	
	public Asiento[][] getAsientos() {
		return asientos;
	}

	public void setAsientos(Asiento[][] asientos) {
		this.asientos = asientos;
	}

	public boolean compareTo (Object a) {
		Espectador e1 = (Espectador) a;
		if (e1.getDinero() >= precio && e1.getEdad() >= peli.getEdadMinima()) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Cine [peli=" + peli + ", precio=" + precio + "]";
	}

	
	
	
}
