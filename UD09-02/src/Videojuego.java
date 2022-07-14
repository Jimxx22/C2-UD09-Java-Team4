
public class Videojuego implements Entregable{

	private String titulo;
	private int horasEstimadas;
	private boolean entregado;
	private String genero;
	private String compania;	
	
	public Videojuego() {
		this("",10,false,"","");
	}
	
	public Videojuego(String titulo, int horasEstimadas) {
		this(titulo,horasEstimadas,false,"","");
	}
	
	public Videojuego(String titulo, int horasEstimadas, boolean entregado, String genero, String compania) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.entregado = entregado;
		this.genero = genero;
		this.compania = compania;
	}

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

	@Override
	public String toString() {
		return "Videojuego [titulo=" + titulo + ", horasEstimadas=" + horasEstimadas + ", entregado=" + entregado
				+ ", genero=" + genero + ", compania=" + compania + "]";
	}

	@Override
	public void entregar() {
		this.entregado=true;
		
	}

	@Override
	public void devolver() {
		this.entregado=false;
		
	}

	@Override
	public boolean isEntregado() {
		
		return entregado;
	}

	@Override
	public boolean compareTo(Object a) {
		
		Videojuego videojuego = (Videojuego) a;
		
		if(videojuego.getHorasEstimadas()==horasEstimadas) {
			return true;
		}else {
			return false;
		}
	}
}
