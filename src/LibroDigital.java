public class LibroDigital extends Libro {
    private double tamano;

    public LibroDigital() {

    }

   /* public LibroDigital(String titulo, String autor, double precio, double tamano) {
        super(titulo, autor, precio);
        this.tamano=tamano;
    }*/

    public double getTamano() {
        return tamano;
    }

    public void setTamano(double tamano) {
        this.tamano = tamano;
    }

    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("tamaño :"+tamano);
    }
}