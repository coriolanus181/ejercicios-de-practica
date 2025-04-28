import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nombre;
    private String documento;
    private List<Libro> libros= new ArrayList<>();

    public Usuario(String documento, String nombre) {
        this.documento = documento;
        this.nombre = nombre;
    }

    public void alquilarLibro( Libro libro){

                if(libros.size()<2){

                    libros.add(libro);
                    System.out.println("acción exitosa");
                }else{

                    System.out.println("has tomado mas de 5 libros");
                }

    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }

    public void devolverLibro (Libro libro){
        libros.remove(libro);
    }



    public String getDocumento() {
        return documento;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "documento='" + documento + '\'' +
                ", nombre='" + nombre + '\'' +
                ", libros alquilados=" + libros +
                '}';
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
