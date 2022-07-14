
public class MainApp {

	public static void main(String[] args) {

		Lavadora lavadora = new Lavadora(100.0, "blanco", 'F', 55, 35);
		
		System.out.println(lavadora.precioFinal());
		
	}

}
