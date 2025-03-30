public class Gato extends Animal {
    private String pelaje ;

    public Gato(double peso, String locomocion,int edad, String pelaje){
        super(peso,locomocion,edad);
        this.pelaje=pelaje;
    }

    @Override
    public String toString() {
        return "gato{" +
                "pelaje='" + pelaje + '\'' +
                ", edad=" + edad +
                ", locomocion='" + locomocion + '\'' +
                ", peso=" + peso +
                '}';
    }
}