
public class Raices {
	
	// Variables
	private double a, b, c;

	// Constructor con las 3 variables
	public Raices(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	 // Método para calcular y mostrar la raíz cuando tiene 2 resultados
	public void obtenerRaices() {
		double resultado1, resultado2;
		resultado1 = (-b+(Math.sqrt(getDiscriminante())))/(2*a);
		resultado2 = (-b-(Math.sqrt(getDiscriminante())))/(2*a);
		
		System.out.println("\nSolucion 1: "+resultado1);
		System.out.println("Solucion 2: "+resultado2);
		
	}
	
	// Método para calcular y mostrar la raíz cuando tiene 1 resultado
	public void obtenerRaiz() {
		double resultado1;
		resultado1 = (-b)/(2*a);
		System.out.println("\nSolucion: "+resultado1);
		
	}
	
	// Método para comprobar si la raíz tiene una solución
	private boolean tieneRaiz() {
		if(getDiscriminante() == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	// Método para calcular el discriminante de la raíz
	public double getDiscriminante() {
		Double res;
		
		res=(Math.pow(b, 2))-4*a*c;
		
		return res;
	}
	
	// Método para escoger que método usar para calcular la raíz
	public void calcular() {
		
		if(tieneRaiz()) {
			obtenerRaiz();
		} else if (tieneRaices()) {
			obtenerRaices();
		} else {
			System.out.println("\nNo existe solucion");
		}
	}

	// Método para comprobar si la raíz tiene dos soluciones
	private boolean tieneRaices() {
		
		if(getDiscriminante()>=0) {
			return true;
		}else {
			return false;
		}
	}
}
