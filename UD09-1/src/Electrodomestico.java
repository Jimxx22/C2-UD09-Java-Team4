
public class Electrodomestico {
	
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
	
	public double precioFinal() {
<<<<<<< HEAD
	
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
=======
		switch (consumo) {
		case 'A':
			precio += 100;
			break;
		case 'B':
			precio += 80;
			break;
		case 'C':
			precio += 60;
			break;
		case 'D':
			precio += 50;
			break;
		case 'E':
			precio += 30;
			break;
		case 'F':
			precio += 10;
			break;
		}
		
		if(peso > 80) {
			precio += 100;
		} else if (peso >= 50) {
			precio += 80;
		} else if (peso >= 20) {
			precio += 50;
		} else {
			precio += 10;
>>>>>>> refs/remotes/origin/David
		}
		
		return precio;
	}
	
	
}
