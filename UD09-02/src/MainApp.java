
public class MainApp {
	
	public static void main(String[] args) {
		
		Serie[] series = new Serie[5];
		Videojuego[] videojuegos = new Videojuego[5];
		
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
		
		series[1].entregar();
		series[3].entregar();
		videojuegos[0].entregar();
		videojuegos[2].entregar();
		
		int numSeries = 0, numVideojuegos = 0;
		Serie maxTemporadas = series[0];
		Videojuego maxHoras = videojuegos[0];
		for(int i = 0; i < series.length; i++) {
			if( maxTemporadas.compareTo(series[i]) == -1)
				maxTemporadas = series[i];
			if(series[i].isEntregado())
				numSeries++;
		}
		for(int i = 0; i < videojuegos.length; i++) {
			if(maxHoras.compareTo(videojuegos[i]) == -1)
				maxHoras = videojuegos[i];
			if(videojuegos[i].isEntregado())
				numVideojuegos++;
		}
		
		System.out.println("Numero de series "+numSeries+" numero de videojuegos "+numVideojuegos);
		System.out.println(maxTemporadas);
		System.out.println(maxHoras);
		
	}
	
}
