
public class Television extends Electrodomestico{
	
	private double pulgadas;
	private boolean sintonizador;
	
	private final static double PULGADAS_DEF = 20.0;
	private final static boolean SINTONIZADOR_DEF = false;

	public Television() {
		super();
		pulgadas = PULGADAS_DEF;
		sintonizador = SINTONIZADOR_DEF;
	}
	
	public Television(double precio, double peso) {
		super(precio, peso);
		pulgadas = PULGADAS_DEF;
		sintonizador = SINTONIZADOR_DEF;
	}

	public Television(double precio, String color, char consumo, double peso, double pulgadas, boolean sintonizador) {
		super(precio, color, consumo, peso);
		this.pulgadas = pulgadas;
		this.sintonizador = sintonizador;
	}

	
	public double precioFinal() {
		
		precio = super.precioFinal();
		/*switch (consumo) {
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
		}*/
		
		if(pulgadas > 40) {
			precio *= 1.3;
		}
		
		if(sintonizador) {
			precio += 50;
		}
		
		return 0;
	}

	public double getPulgadas() {
		return pulgadas;
	}

	public boolean isSintonizador() {
		return sintonizador;
	}
	
	

}
