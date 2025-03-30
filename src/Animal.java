public abstract class Animal {

    protected double peso;
    protected String locomocion;
    protected int edad;


    public Animal(double peso, String locomocion,int edad){
        this.peso= peso;
        this.locomocion= locomocion;
        this.edad= edad;

    }



    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getLocomocion() {
        return locomocion;
    }

    public void setLocomocion(String locomocion) {
        this.locomocion = locomocion;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "edad=" + edad +
                ", peso=" + peso +
                ", locomocion='" + locomocion + '\'' +
                '}';
    }


}