public class EmpleadoPlanta extends Empleado {
    private double salarioFijo;

    public EmpleadoPlanta(int edad, String nombre, double salarioFijo) {
        super(edad, nombre);
        this.salarioFijo = salarioFijo;
    }

    public double getSalarioFijo() {
        return salarioFijo;
    }

    public void setSalarioFijo(double salarioFijo) {
        this.salarioFijo = salarioFijo;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Salario Fijo :"+salarioFijo);
    }
}
