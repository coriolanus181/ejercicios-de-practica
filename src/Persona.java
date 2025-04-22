import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class Persona   extends Perro{
    private String nombre;
    private String apellido;
    private int edad;
    private String documento;
    private List<Perro> perros =new ArrayList<>() ;



    public Persona(String nombre, String apellido, int edad, String documento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
    }


    public void adoptarPerro(Perro perro) {

          perros.add(perro);




    }

    public Perro perroMasGrande(){
        Perro perroMayor = null;
        int edadMax = 0;
        for (Perro c:perros){
            if(c.getEdad() >edadMax){
                edadMax = c.getEdad();
                perroMayor=c;
            }
        }
        return perroMayor;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int getEdad() {
        return edad;
    }

    @Override
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "apellido='" + apellido + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", documento='" + documento + '\'' +
                "\n perros=" + perros+
                '}';
    }
}
