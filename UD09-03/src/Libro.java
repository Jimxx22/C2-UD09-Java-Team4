
public class Libro {
	
	// Variables
    private String isbn;
    private String titulo;
    private String autor;
    private int paginas;

    // Constructor del Libro con sus parámetros
    public Libro(String isbn, String titulo, String autor, int paginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    // Geters y seters
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
    
    // Método que compara las páginas de dos libros
    public void masPaginas(Libro libro) {
    	if(getPaginas()>libro.getPaginas()) {
    		System.out.println("El libro con max paginas es "+getPaginas());
    		
    	}else if(getPaginas()<libro.getPaginas()) {
    		System.out.println("El libro con max paginas es "+libro.getPaginas());
    		
    	}else {
    		System.out.println("Los dos libros tienen las mismas paginas: "+ getPaginas());
    	}   	
    }

    // Método toString
    @Override
    public String toString() {
        return "El libro " + titulo + " con ISBN " + isbn + " creado por "+ autor + " tiene " + paginas + " paginas";
    }


}