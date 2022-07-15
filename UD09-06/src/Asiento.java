
public class Asiento {

	int numero;
	char letra;
	boolean ocupado;
	Espectador espectador;
	
	public Asiento(int numero, char letra) {
		this(numero, letra, false, null);
	}
	
	public Asiento(int numero, char letra, boolean ocupado, Espectador espectador) {
		this.numero = numero;
		this.letra = letra;
		this.ocupado = ocupado;
		this.espectador = espectador;
	}

	public int getNumero() {
		return numero;
	}

	public char getLetra() {
		return letra;
	}

	public boolean isOcupado() {
		return ocupado;
	}

	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}

	public Espectador getEspectador() {
		return espectador;
	}

	public void setEspectador(Espectador espectador) {
		this.espectador = espectador;
	}
	
	public void ocupado() {
		ocupado=true;
	}
	
	public void libre() {
		ocupado=false;
	}
	
	public String verInfoEspectador() {
		return espectador.toString();
	}

	@Override
	public String toString() {
		return "Asiento [numero=" + numero + ", letra=" + letra + ", ocupado=" + ocupado + "]";
	}
	
		
	
}
