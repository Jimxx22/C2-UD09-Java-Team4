
public class Raices {
	Double a, b, c;

	public Raices(Double a, Double b, Double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public boolean tieneRaiz() {
		if(getDiscriminante() == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public void calcular() {
		if(tieneRaiz()) {
			
		} else if (tieneRaices()) {
			
		}
	}

}
