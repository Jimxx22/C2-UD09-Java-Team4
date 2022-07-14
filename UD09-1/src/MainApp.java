
public class MainApp {

	public static void main(String[] args) {
		
		
		Double pElectrodomesticos=0.0, pTelevisiones=0.0, pLavadoras=0.0;
		
		Electrodomestico[] electrodomesticos = new Electrodomestico[10];
		
		electrodomesticos[0]=new Television(150, "rojo", 'B', 35, 45, true);
		electrodomesticos[1]=new Television(100, "negro", 'A', 25, 35, false);
		electrodomesticos[2]=new Television(250, "blanco", 'C', 30, 40, true);
		electrodomesticos[3]=new Television(350, "azul", 'D', 42, 55, false);
		
		electrodomesticos[4]=new Electrodomestico(300, "gris", 'F', 37);
		electrodomesticos[5]=new Electrodomestico(350, "negro", 'E', 60);
		
		electrodomesticos[6]=new Lavadora(250, "blanco", 'E', 55, 35);
		electrodomesticos[7]=new Lavadora(450, "gris", 'F', 95, 30);
		electrodomesticos[8]=new Lavadora(200, "blanco", 'C', 45, 50);
		electrodomesticos[9]=new Lavadora(299, "blanco", 'B', 70, 40);
		
		for (int i = 0; i < electrodomesticos.length; i++) {
			
			if(electrodomesticos[i] instanceof Television) {
				pTelevisiones+=electrodomesticos[i].precioFinal();
			}else if(electrodomesticos[i] instanceof Lavadora){
				pLavadoras+=electrodomesticos[i].precioFinal();
			}else {
				pElectrodomesticos+=electrodomesticos[i].precioFinal();
			}
			
		}
		
		pElectrodomesticos+=pLavadoras+pTelevisiones;
		
		System.out.println("Precio final de todos los electrodomesticos: "+pElectrodomesticos);
		System.out.println("Precio final de todos los televisores: "+pTelevisiones);
		System.out.println("Precio final de todos las lavadoras: "+pLavadoras);

		
	}

}
