
public class Raices {
	private Double a, b, c;

	public Raices(Double a, Double b, Double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	private boolean tieneRaiz() {
		if(getDiscriminante() == 0) {
			return true;
		} else {
			return false;
		}
	}
		
	private double getDiscriminante() {
		Double res;
		
		res=(Math.pow(b, 2))-4*a*c;
		
		return res;
	}
	
	public void calcular() {
		if(tieneRaiz()) {
			
		} else if (tieneRaices()) {
			
		}
	}

	private boolean tieneRaices() {
		
		if(getDiscriminante()>=0) {
			return true;
		}else {
			return false;
		}
	}
}
