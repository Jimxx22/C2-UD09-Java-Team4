import java.util.Arrays;

public class Aula {
	
	Profesor profesor;
	int maxEstudinates;
	Estudiante[] estudiantes=new Estudiante[maxEstudinates]; 
	String materia;
	
	public Aula() {
		this(null,1,null,"");
	}
	
	public Aula(Profesor profesor, int maxEstudinates, Estudiante[] estudiantes, String materia) {
		super();
		this.profesor = profesor;
		this.maxEstudinates = maxEstudinates;
		this.estudiantes = estudiantes;
		if (validarMateria(materia)) {
			this.materia = materia;
		}else {
			this.materia = "";
		}
	}

	public Profesor getProfesor() {
		return profesor;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}

	public int getMaxEstudinates() {
		return maxEstudinates;
	}

	public void setMaxEstudinates(int maxEstudinates) {
		this.maxEstudinates = maxEstudinates;
	}

	public Estudiante[] getEstudiantes() {
		return estudiantes;
	}

	public void setEstudiantes(Estudiante[] estudiantes) {
		this.estudiantes = estudiantes;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	@Override
	public String toString() {
		return "Aula [profesor=" + profesor + ", maxEstudinates=" + maxEstudinates + ", estudiantes="
				+ Arrays.toString(estudiantes) + ", materia=" + materia + "]";
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
	
}
