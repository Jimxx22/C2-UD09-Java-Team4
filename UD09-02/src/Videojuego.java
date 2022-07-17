
public class Videojuego implements Entregable{
	// Clase videojuego que implementa la interfaz entregable
	
	// Variables
	private String titulo;
	private int horasEstimadas;
	private boolean entregado;
	private String genero;
	private String compania;	
	
	// Cosntructor por defecto
	public Videojuego() {
		this("",10,false,"","");
	}
	
	// Constructo que pide el título y las horas estimadas
	public Videojuego(String titulo, int horasEstimadas) {
		this(titulo,horasEstimadas,false,"","");
	}
	
	// Constructor que pide todos los parámetros
	public Videojuego(String titulo, int horasEstimadas, boolean entregado, String genero, String compania) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.entregado = entregado;
		this.genero = genero;
		this.compania = compania;
	}

	// Geters y seters
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getHorasEstimadas() {
		return horasEstimadas;
	}

	public void setHorasEstimadas(int horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCompania() {
		return compania;
	}

	public void setCompania(String compania) {
		this.compania = compania;
	}

	// Método toString
	@Override
	public String toString() {
		return "Videojuego [titulo=" + titulo + ", horasEstimadas=" + horasEstimadas + ", entregado=" + entregado
				+ ", genero=" + genero + ", compania=" + compania + "]";
	}

	// Método implementado mediante la interfaz que cambia el estado de entregado a true
	@Override
	public void entregar() {
		this.entregado=true;
		
	}

	// Método implementado mediante la interfaz que cambia el estado de entregado a false
	@Override
	public void devolver() {
		this.entregado=false;
		
	}

	// Método implementado mediante la interfaz para comprobar el estado de entregado
	@Override
	public boolean isEntregado() {
		
		return entregado;
	}

	// Método implementado mediante la interfaz que compara la cantidad de horas estimadas de 2 videojuegos
	@Override
	public int compareTo(Object a) {
		
		Videojuego videojuego = (Videojuego) a;
		
		if(videojuego.getHorasEstimadas()==horasEstimadas) {
			return 0;
		}else if(videojuego.getHorasEstimadas()<horasEstimadas){
			return 1;
		} else {
			return -1;
		}
	}
}
