
public class Profesor extends Persona{
	// La clase Profesor hereda de la clase Persona
	
	// Variables
	private String materia;
	
	// Constructor por defecto
	public Profesor() {
		super();
		this.materia = "";
	}

	// Constructor con todos los parámetros, propios y heredados
	public Profesor(String nombre, int edad, char sexo, String materia) {
		super(nombre, edad, sexo, true);
		if (validarMateria(materia)) {
			this.materia = materia;
		}else {
			this.materia = "";
		}
		novillos();
	}
	
	// Método para validar que la materia está dentro de los parámetros
	private boolean validarMateria (String materia) {
		String [] materias = {"matematicas","filosofia","fisica"};
		int i = 0;
		boolean valido = false;
		while (i < materias.length && !valido) {
			if (materias[i].equals(materia.toLowerCase())) {
				valido =true;
			}
			i++;
		}
		return valido;
	}

	// Getres y seters
	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	// Método toString
	@Override
	public String toString() {
		return "Profesor ["+super.toString()+"materia=" + materia + "]";
	}

	// Método heredado de la clase Persona para calcular si el profesor hará novillos
	@Override
	public void novillos() {
		// TODO Auto-generated method stub
		int probabilidad = (int)(Math.random()*5+1);
		if (probabilidad == 1) {
			asistencia = false;
		}
	}
}
