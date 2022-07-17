import java.util.Arrays;

public class Aula {
	
	// Variables
	private int id;
	private Profesor profesor;
	private int maxEstudinates;
	private Estudiante[] estudiantes=new Estudiante[maxEstudinates]; 
	private String materia;
	
	// Constructor por defecto
	public Aula() {
		this(0,null,1,null,"");
	}
	
	// Constructor con todos los campos
	public Aula(int id, Profesor profesor, int maxEstudinates, Estudiante[] estudiantes, String materia) {
		super();
		this.id=id;
		this.profesor = profesor;
		this.maxEstudinates = maxEstudinates;
		this.estudiantes = estudiantes;
		if (validarMateria(materia)) {
			this.materia = materia;
		}else {
			this.materia = "";
		}
	}

	// Geters y seters
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
	
	// Método para comprobar si se puede dar clase
	// Comprobamos que hay más del 50% de estudiantes en clase, que el profesor está presente, y que el aula y el profesor son de la misma materia
	public boolean sePuedeDarClasse() {
		int j=0;
		for (int i = 0; i < estudiantes.length; i++) {
			Estudiante estudiante = estudiantes[i];
			if(estudiante.isAsistencia()) {
				j++;
			}
		}
		
		if (profesor.getMateria().equalsIgnoreCase(getMateria()) && profesor.isAsistencia() && j>(maxEstudinates/2)) {
			return true;
		}else {
			return false;
		}
	}
	
	// Contamos quantos estudiantes aprobados hay de cada sexo
	public String contarSexo() {
		
		int m=0,h=0;
		
		for (int i = 0; i < estudiantes.length; i++) {
			if(estudiantes[i].getSexo()=='H' && estudiantes[i].isAprovado()) {
				h++;
			}else if(estudiantes[i].getSexo()=='M' && estudiantes[i].isAprovado()){
				m++;
			}
		}
		
		return "Hombres aprovados: "+h+", mujeres aprovadas: "+m;
	}

	// Método toString
	@Override
	public String toString() {
		return "Aula [id="+id+" profesor=" + profesor + ", maxEstudinates=" + maxEstudinates + ", estudiantes="
				+ Arrays.toString(estudiantes) + ", materia=" + materia + "]";
	}
	
	// Método para validar que las materias son las que dice el enunciado
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
