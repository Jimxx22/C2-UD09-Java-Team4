
public class Television extends Electrodomestico{
	// La clase televisión hereda de la clase electrodoméstico
	
	// Variables
	private double pulgadas;
	private boolean sintonizador;
	
	// Constantes
	private final static double PULGADAS_DEF = 20.0;
	private final static boolean SINTONIZADOR_DEF = false;

	// Constructor por defecto usando las constantes
	public Television() {
		super();
		pulgadas = PULGADAS_DEF;
		sintonizador = SINTONIZADOR_DEF;
	}
	
	// Constructor que pide el precio y el peso
	public Television(double precio, double peso) {
		super(precio, peso);
		pulgadas = PULGADAS_DEF;
		sintonizador = SINTONIZADOR_DEF;
	}

	// Constructor con todos los parámetros
	public Television(double precio, String color, char consumo, double peso, double pulgadas, boolean sintonizador) {
		super(precio, color, consumo, peso);
		this.pulgadas = pulgadas;
		this.sintonizador = sintonizador;
	}

	// Método precioFinal que amplía el método de la clase electrodoméstico
	public double precioFinal() {
		
		precio = super.precioFinal();
		// Más de 40 pulgadas el precio aumenta un 30%
		if(pulgadas > 40) {
			precio *= 1.3;
		}
		
		// Incluye sintonizador precio más 50
		if(sintonizador) {
			precio += 50;
		}
		
		return precio;
	}

	// Geters
	public double getPulgadas() {
		return pulgadas;
	}

	public boolean isSintonizador() {
		return sintonizador;
	}
	
	

}
