
public class MainApp {
	
	// Variables
	static Serie[] series;
	static Videojuego[] videojuegos;
	static Serie maxTemporadas;
	static Videojuego maxHoras;
	
	// Método main
	public static void main(String[] args) {
		
		// Declaramos 2 arrays de series y videojuegos de 5 posiciones cada una
		series = new Serie[5];
		videojuegos = new Videojuego[5];
		
		// Llamamos la función que rellena las dos arrays anteriores
		bd();
		
		// Cambiamos el estado de 2 series y 2 videojuegos
		series[1].entregar();
		series[3].entregar();
		videojuegos[0].entregar();
		videojuegos[2].entregar();
		
		// Mostramos el número de series y videojuegos entregados
		System.out.println("Numero de series entregados "+maxSeries()+" numero de videojuegos entregados "+maxVideojuego());
		
		// El método que retorna el número de series entregadas también guarda la serie con más temporadas
		// Mostramos la serie con més temporadas
		System.out.println(maxTemporadas);
		
		// El método que retorna el número de videojuegos entregados también guarda el videojuego con más horas
		// Mostramos el videojuego con más horas jugables
		System.out.println(maxHoras);
	}
	
	// Función que rellena las arrays
	public static void bd() {
		series[0] = new Serie("Serie1",10,false,"genero1","creador1");
		series[1] = new Serie("Serie2",7,false,"genero2","creador2");
		series[2] = new Serie("Serie3","creador3");
		series[3] = new Serie("Serie4","creador2");
		series[4] = new Serie();
		
		videojuegos[0] = new Videojuego("videojuego1",100, false,"genero3","compania1");
		videojuegos[1] = new Videojuego("videojuego2",80, false,"genero2","compania2");
		videojuegos[2] = new Videojuego("videojuego3",80);
		videojuegos[3] = new Videojuego("videojuego4",200);
		videojuegos[4] = new Videojuego();
	}
	
	// Función que cuenta las series entregadas y guarda la serie con más temporadas
	public static int maxSeries() {
		
		int numSeries = 0;
		maxTemporadas = series[0];
		for(int i = 0; i < series.length; i++) {
			if( maxTemporadas.compareTo(series[i]) == -1)
				maxTemporadas = series[i];
			if(series[i].isEntregado())
				numSeries++;
		}
		
		return numSeries;
	}
	
	// Función que cuenta los videojuegos entregados y guarda el videojuego con más horas
	public static int maxVideojuego() {
		int numVideojuegos = 0;
		maxHoras = videojuegos[0];
		
		for(int i = 0; i < videojuegos.length; i++) {
			if(maxHoras.compareTo(videojuegos[i]) == -1)
				maxHoras = videojuegos[i];
			if(videojuegos[i].isEntregado())
				numVideojuegos++;
		}
		
		return numVideojuegos;
	}
	
}
