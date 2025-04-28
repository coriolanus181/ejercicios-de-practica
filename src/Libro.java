public class Libro {
    private String nombre;
    private String autor;

    public Libro(String autor, String nombre) {
        this.autor = autor;
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "autor='" + autor + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
