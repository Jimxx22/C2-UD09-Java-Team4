
public abstract class Electrodomestico {
	
	protected double precio;
	protected String color;
	protected char consumo;
	protected double peso;
	
	protected final static char CONSUMO_DEF = 'F';
	protected final static double PRECIO_BASE = 100;
	protected final static double PESO_DEF = 5;
	protected final static String COLOR_DEF = "blanco";
	
	public Electrodomestico() {
		this(PRECIO_BASE,COLOR_DEF,CONSUMO_DEF,PESO_DEF);
	}

	public Electrodomestico(double precio, String color, char consumo, double peso) {
		this.precio = precio;
		if (comprobarColor(color)) {
			this.color = color;
		} else {
			this.color = COLOR_DEF;
		}
		if (comprobarConsumoEnergetico(consumo)) {
			this.consumo = consumo;
		}else {
			this.consumo = CONSUMO_DEF;
		}
		this.peso = peso;
	}

	public Electrodomestico(double precio, double peso) {
		this.precio = precio;
		this.peso = peso;
		this.color = COLOR_DEF;
		this.consumo = CONSUMO_DEF;
	}

	public double getPrecio() {
		return precio;
	}

	public String getColor() {
		return color;
	}

	public char getConsumo() {
		return consumo;
	}

	public double getPeso() {
		return peso;
	}
	
	private boolean comprobarConsumoEnergetico(char letra) {
		boolean valido = false;
		
		String letras = "ABCDEF";
		valido = letras.contains(Character.toString(letra));
		
		return valido;
	}
	
	private boolean comprobarColor(String color) {
		boolean valido = false;
		
		String[] colores = {"blanco","negro","rojo","azul","gris"};
		int i = 0;
		while (i < colores.length && !valido) {
			if (colores[i].equals(color.toLowerCase())) {
				valido = true;
			}
			i++;
		}
		
		return valido;
	}
	
	public abstract double precioFinal();
	
	
}
