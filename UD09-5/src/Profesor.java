
public class Profesor extends Persona{
	private String materia;
	
	
	public Profesor() {
		super();
		this.materia = "";
	}

	public Profesor(String nombre, int edad, char sexo, String materia) {
		super(nombre, edad, sexo, true);
		if (validarMateria(materia)) {
			this.materia = materia;
		}else {
			this.materia = "";
		}
		novillos();
	}



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

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	@Override
	public String toString() {
		return "Profesor ["+super.toString()+"materia=" + materia + "]";
	}

	@Override
	public void novillos() {
		// TODO Auto-generated method stub
		int probabilidad = (int)(Math.random()*5+1);
		if (probabilidad == 1) {
			asistencia = false;
		}
	}
}
