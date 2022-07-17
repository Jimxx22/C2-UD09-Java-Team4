
public class Electrodomestico {
	
	// Variables
	protected double precio;
	protected String color;
	protected char consumo;
	protected double peso;
	
	// Constantes
	protected final static char CONSUMO_DEF = 'F';
	protected final static double PRECIO_BASE = 100;
	protected final static double PESO_DEF = 5;
	protected final static String COLOR_DEF = "blanco";
	
	// Constructor por defecto con las constantes
	public Electrodomestico() {
		this(PRECIO_BASE,COLOR_DEF,CONSUMO_DEF,PESO_DEF);
	}

	// Constructo con todos los parámetros
	public Electrodomestico(double precio, String color, char consumo, double peso) {
		this.precio = precio;
		// Usamos el método que comprueba que el color es correcto si no ponemos el por defecto
		if (comprobarColor(color)) {
			this.color = color;
		} else {
			this.color = COLOR_DEF;
		}
		// Usamos el método que comprueba que el consumo es correcto si no ponemos el por defecto
		if (comprobarConsumoEnergetico(consumo)) {
			this.consumo = consumo;
		}else {
			this.consumo = CONSUMO_DEF;
		}
		this.peso = peso;
	}

	// Constructor que solo pide el precio y el peso
	public Electrodomestico(double precio, double peso) {
		this.precio = precio;
		this.peso = peso;
		this.color = COLOR_DEF;
		this.consumo = CONSUMO_DEF;
	}

	// Geters y seters
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
	
	// Método que comprueba que el valor de consumo es correcto
	private boolean comprobarConsumoEnergetico(char letra) {
		boolean valido = false;
		
		String letras = "ABCDEF";
		valido = letras.contains(Character.toString(letra));
		
		return valido;
	}
	
	// Método que comprueba que el valor de color es correcto
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
	
	// Método para calcular el precio final, sumamos dependiendo del consumo y el peso que tenga el producto
	public double precioFinal() {
	
		switch (consumo) {
		case 'A':
			precio+=100;
			break;
		case 'B':
			precio+=80;
			break;
		case 'C':
			precio+=60;
			break;
		case 'D':
			precio+=50;
			break;
		case 'E':
			precio+=30;
			break;
		case 'F':
			precio+=10;
			break;
		default:
			break;
		}
		
		if(peso<=19) {
			precio+=10;
		}else if(peso<=49) {
			precio+=50;
		}else if(peso<=79) {
			precio+=80;
		}else {
			precio+=100;
		}
		
		return precio;
	}
	
	
}
