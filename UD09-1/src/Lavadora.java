
public class Lavadora extends Electrodomestico{
	// La clase lavadora hereda de la clase electrodoméstico
	
	// Variables
	private Double carga;
	
	// Constantes
	private final static Double CARGA_DEF=5.0;

	// Constructor por defecto usando la constante
	public Lavadora() {
		super();
		this.carga = CARGA_DEF;
	}
	
	// Constructor que pide el precio y el peso
	public Lavadora(double precio, double peso) {
		super(precio, peso);
		this.carga = CARGA_DEF;
	}

	// Constructor con todos los parámetros
	public Lavadora(double precio, String color, char consumo, double peso, double carga) {
		super(precio, color, consumo, peso);
		this.carga=carga;
	}

	// Geter
	public Double getCarga() {
		return carga;
	}

	// Método precioFinal que amplía el método de la clase electrodoméstico
	public double precioFinal() {
		precio = super.precioFinal();
		
		// Si la carga es mayor de 30 suma 50 al precio
		if(carga>30) {
			precio+=50;
		}
		
		return precio;
	}

	
	

}
