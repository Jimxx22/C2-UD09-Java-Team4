
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
			System.out.println(raiz);
		}
		
	}
		
	public void obtenerRaiz() {
		double raiz = 0;
		if (tieneRaiz()) {
			raiz = Math.sqrt(getDiscriminante());
			System.out.println(raiz);
		}else {
			System.out.println("No tiene raiz");
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
		double resultado1, resultado2;
		
		if(tieneRaiz()) {
			obtenerRaiz();
			/*resultado1 = -b;
			System.out.println("Solucion: "+resultado1);*/
		} else if (tieneRaices()) {
			obtenerRaices();
			/*resultado1 = -b+Math.sqrt(getDiscriminante()/(2*a));
			resultado2 = -b-Math.sqrt(getDiscriminante()/(2*a));
			System.out.println("Solucion 1: "+resultado1);
			System.out.println("\nSolucion 2: "+resultado2);*/
		} else {
			System.out.println("No existe solucion");
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
