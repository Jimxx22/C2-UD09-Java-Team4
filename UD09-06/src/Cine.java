
public class Cine {
	
	private Pelicula peli;
	private double precio;
	private Asiento[][] asientos;
	
	public Cine() {
		this.peli = new Pelicula();
		this.precio = 0.0;
		for (int i = 1; i <= 8; i++) {
			for (int j = 1; j <= 9 ; j++) {
				this.asientos [i][j] = new Asiento(i,(char)(64 + j));
			}
		}
	}

	public Cine(Pelicula peli, double precio) {
		this.peli = peli;
		this.precio = precio;
		for (int i = 1; i <= 8; i++) {
			for (int j = 1; j <= 9 ; j++) {
				this.asientos [i][j] = new Asiento(i,(char)(64 + j));
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
