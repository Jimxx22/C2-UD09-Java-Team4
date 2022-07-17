
public class Serie implements Entregable{
	// Clase serie que implementa la interfaz entregable
	
	// Variable
	protected String titulo;
	protected int season;
	protected boolean entregado;
	protected String genero;
	protected String creador;
	
	// Constructor por defecto
	public Serie() {
		this.titulo = "";
		this.season = 3;
		this.entregado = false;
		this.genero = "";
		this.creador = "";
	}

	// Constructor que pide el tíulo y el creador de la serie
	public Serie(String titulo, String creador) {
		super();
		this.titulo = titulo;
		this.season = 3;
		this.entregado = false;
		this.genero = "";
		this.creador = creador;
	}

	// Constructor con todos los parámetros
	public Serie(String titulo, int season, boolean entregado, String genero, String creador) {
		super();
		this.titulo = titulo;
		this.season = season;
		this.entregado = entregado;
		this.genero = genero;
		this.creador = creador;
	}

	// Geters y seters
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getSeason() {
		return season;
	}

	public void setSeason(int season) {
		this.season = season;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	// Método toStrign
	@Override
	public String toString() {
		return "Serie [titulo=" + titulo + ", season=" + season + ", entregado=" + entregado + ", genero=" + genero
				+ ", creador=" + creador + "]";
	}

	// Método implementado mediante la interfaz que cambia el estado de entregado a true
	@Override
	public void entregar() {
		entregado = true;	
	}

	// Método implementado mediante la interfaz que cambia el estado de entregado a false
	@Override
	public void devolver() {
		entregado = false;	
	}

	// Método implementado mediante la interfaz para comprobar el estado de entregado
	@Override
	public boolean isEntregado() {
		return entregado;
	}

	// Método implementado mediante la interfaz que compara el número de temporadas de 2 series
	@Override
	public int compareTo(Object a) {
		// TODO Auto-generated method stub
		Serie s1 = (Serie) a;
		if (s1.getSeason() == season) {
			return 0;
		}else if (s1.getSeason() < season){
			return 1;
		} else {
			return -1;
		}
		
	}
	
	
	
	
	
}
