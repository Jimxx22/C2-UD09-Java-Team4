
public class Raices {
	private Double a, b, c;

	public Raices(Double a, Double b, Double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public void obtenerRaices() {
		double resultado1, resultado2;
		resultado1 = -b+Math.sqrt(getDiscriminante()/(2*a));
		resultado2 = -b-Math.sqrt(getDiscriminante()/(2*a));
		System.out.println("Solucion 1: "+resultado1);
		System.out.println("\nSolucion 2: "+resultado2);
		
	}
		
	public void obtenerRaiz() {
		double resultado1;
		resultado1 = -b;
		System.out.println("Solucion: "+resultado1);
		
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
			obtenerRaiz();
		} else if (tieneRaices()) {
			obtenerRaices();
		} else {
			System.out.println("No existe solucion");
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
