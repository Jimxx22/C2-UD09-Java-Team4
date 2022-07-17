
public class MainApp {

	public static void main(String[] args) {
		
		// Declaración de las raíces
		// La primera tiene solo 1 solución
		// La segunda tiene 2 soluciones
		// La tercera no tiene solución
		Raices raices1 =new Raices(4, 8, 4);
		Raices raices2 =new Raices(4, 8, 3);
		Raices raices3 =new Raices(8, 3, 4);
		
		// Mostrar los resultados de las tres raíces
		raices1.calcular();
		raices2.calcular();
		raices3.calcular();
	}

}
