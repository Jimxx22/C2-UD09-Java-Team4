
public class Raices {
	private double a, b, c;

	public Raices(double a, double b, double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public void obtenerRaices() {
		double resultado1, resultado2;
		resultado1 = (-b+(Math.sqrt(getDiscriminante())))/(2*a);
		resultado2 = (-b-(Math.sqrt(getDiscriminante())))/(2*a);
		
		System.out.println("\nSolucion 1: "+resultado1);
		System.out.println("Solucion 2: "+resultado2);
		
	}
		
	public void obtenerRaiz() {
		double resultado1;
		resultado1 = (-b)/(2*a);
		System.out.println("\nSolucion: "+resultado1);
		
	}
	
	private boolean tieneRaiz() {
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
			obtenerRaiz();
		} else if (tieneRaices()) {
			obtenerRaices();
		} else {
			System.out.println("\nNo existe solucion");
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
