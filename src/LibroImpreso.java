public class LibroImpreso extends Libro{
    private int peso;

    public LibroImpreso() {
    }


    public LibroImpreso(String titulo, String autor, double precio, int peso){
        super(titulo,autor,precio);
        this.peso= peso;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.print("\tpeso: "+peso+"\n");
    }
}

