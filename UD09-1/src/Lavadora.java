
public class Lavadora extends Electrodomestico{
	
	private Double carga;
	private final static Double CARGA_DEF=5.0;

	public Lavadora() {
		super();
		this.carga = CARGA_DEF;
	}
	

	public Lavadora(double precio, double peso) {
		super(precio, peso);
		// TODO Auto-generated constructor stub
	}


	public Lavadora(double precio, String color, char consumo, double peso, double carga) {
		super(precio, color, consumo, peso);
		this.carga=carga;
	}

	public Double getCarga() {
		return carga;
	}

	
	public double precioFinal() {
		super.precioFinal();
		
		if(carga>30) {
			precio+=50;
		}
		
		return precio;
	}

	
	

}
