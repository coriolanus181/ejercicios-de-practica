public class EmpleadoHoras extends Empleado {
    private double pagoHoras;
    private int horasTrabajadas;

    public EmpleadoHoras(int edad, String nombre, int horasTrabajadas, double pagoHoras) {
        super(edad, nombre);
        this.horasTrabajadas = horasTrabajadas;
        this.pagoHoras = pagoHoras;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getPagoHoras() {
        return pagoHoras;
    }

    public void setPagoHoras(double pagoHoras) {
        this.pagoHoras = pagoHoras;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Pago Horas : "+pagoHoras+"Horas trabajadas: "+horasTrabajadas);
    }
}
