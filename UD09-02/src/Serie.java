
public class Serie implements Entregable{
	protected String titulo;
	protected int season;
	protected boolean entregado;
	protected String genero;
	protected String creador;
	
	public Serie() {
		this.titulo = "";
		this.season = 3;
		this.entregado = false;
		this.genero = "";
		this.creador = "";
	}

	public Serie(String titulo, String creador) {
		super();
		this.titulo = titulo;
		this.season = 3;
		this.entregado = false;
		this.genero = "";
		this.creador = creador;
	}

	public Serie(String titulo, int season, boolean entregado, String genero, String creador) {
		super();
		this.titulo = titulo;
		this.season = season;
		this.entregado = entregado;
		this.genero = genero;
		this.creador = creador;
	}

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

	@Override
	public String toString() {
		return "Serie [titulo=" + titulo + ", season=" + season + ", entregado=" + entregado + ", genero=" + genero
				+ ", creador=" + creador + "]";
	}

	@Override
	public void entregar() {
		entregado = true;
		
	}

	@Override
	public void devolver() {
		entregado = false;
		
	}

	@Override
	public boolean isEntregado() {
		//
		return entregado;
	}

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
