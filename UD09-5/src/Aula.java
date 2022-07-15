import java.util.Arrays;

public class Aula {
	
	private int id;
	private Profesor profesor;
	private int maxEstudinates;
	private Estudiante[] estudiantes=new Estudiante[maxEstudinates]; 
	private String materia;
	
	public Aula() {
		this(0,null,1,null,"");
	}
	
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

	@Override
	public String toString() {
		return "Aula [id="+id+" profesor=" + profesor + ", maxEstudinates=" + maxEstudinates + ", estudiantes="
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
