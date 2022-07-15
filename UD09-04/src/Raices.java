
public class Raices {
	Double a, b, c;

	public Raices(Double a, Double b, Double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public void obtenerRaices() {
		double raiz = 0;
		if (tieneRaices()) {
			raiz = Math.sqrt(getDiscriminante());
		}
		System.out.println(raiz);
	}
		
	public void obtenerRaiz() {
		if (tieneRaiz) {
			double raiz = Math.sqrt(getDiscriminante());
		}
		
	}

	public boolean tieneRaiz() {
		if(getDiscriminante() == 0) {
			return true;
		} else {
			return false;
		}
	}
		
	public double getDiscriminante() {
		Double res;
		
		res=(Math.pow(b, 2))-4*a*c;
		
		return res;
	}
	
	public void calcular() {
		if(tieneRaiz()) {
			
		} else if (tieneRaices()) {
			
		}
	}

	public boolean tieneRaices() {
		
		if(getDiscriminante()>=0) {
			return true;
		}else {
			return false;
		}
	}
}
