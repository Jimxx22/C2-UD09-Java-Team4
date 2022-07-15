
public class Asiento {

	// Variables
	private int numero;
	private char letra;
	private boolean ocupado;
	private Espectador espectador;
	
	// Constructor solo con el número y la letra del asiento
	public Asiento(int numero, char letra) {
		this(numero, letra, false, null);
	}
	
	// Constructor con todo
	public Asiento(int numero, char letra, boolean ocupado, Espectador espectador) {
		this.numero = numero;
		this.letra = letra;
		this.ocupado = ocupado;
		this.espectador = espectador;
	}

	// Geters y seters
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
	
	// Métodos vara cambiar el estado del asiento
	public void ocupado() {
		ocupado=true;
	}
	
	public void libre() {
		ocupado=false;
	}
	
	public String verInfoEspectador() {
		return espectador.toString();
	}

	// Método toString si el asiento contiene espectador se mostrará también la información de este, si no, no
	@Override
	public String toString() {
		if(espectador == null) {
			return "Asiento [fila=" + numero + ", letra=" + letra + ", ocupado=" + ocupado + ", espectador= null]";
		} else {
			return "Asiento [fila=" + numero + ", letra=" + letra + ", ocupado=" + ocupado + ", espectador="+ verInfoEspectador() +"]";
		}
	}
	
		
	
}
