public class Candidato {
    private String nombre;
    private int voto;
    private int influencia;

    public Candidato(String nombre, int voto) {
        this.nombre = nombre;
        this.voto = voto;
    }

    public void agregarPublicidad(int publicidad) {
        if (publicidad == 1) {
            this.influencia = publicidad * 700000;
        } else if (publicidad == 2) {
            this.influencia = publicidad * 200000;
        } else if (publicidad == 3) {
            this.influencia = publicidad * 600000;
        }
    }

    public int getPublicidad() {
        return influencia;
    }

    public int getVoto() {
        return voto;
    }

    public void setVoto(int voto) {
        this.voto = voto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Candidato{" +
                "nombre='" + nombre + '\'' +
                ", voto=" + voto +
                ", publicidad=" + influencia +
                '}';
    }
}