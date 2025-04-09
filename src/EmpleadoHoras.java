public class EmpleadoHoras extends Empleado {
    private double pagoHora = 98000 ;
   // private double salario;
    private int horasTrabajadas;

    public EmpleadoHoras(int edad, String nombre, int horasTrabajadas) {
        super(nombre, edad);
        this.horasTrabajadas = horasTrabajadas;
        //this.salario =horasTrabajadas*pagoHora;

    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }


    public double getPagoHora() {
        return  pagoHora *= horasTrabajadas;
    }


    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Horas trabajadas: "+horasTrabajadas+"\nsalario : "+getPagoHora());
    }
}
