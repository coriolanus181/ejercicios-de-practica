
enum razas{
    chihuahua,labrador,Bulldog,pitbull
}
public class Perro extends Animal {

    private String sexo;
    private razas raza;
    //private String raza;
    public Perro(double peso,String locomocion,int edad,String sexo,razas raza){
        super( peso,locomocion,edad);
        this.raza=raza;
        this.sexo=sexo;
    }

    @Override
    public String toString() {
        return "Perro{" +
                "raza=" + raza +
                ", sexo='" + sexo + '\'' +
                ", edad=" + edad +
                ", locomocion='" + locomocion + '\'' +
                ", peso=" + peso +
                '}';
    }
}