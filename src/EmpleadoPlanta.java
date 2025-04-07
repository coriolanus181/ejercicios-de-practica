public class EmpleadoPlanta extends Empleado {
    private double salarioFijo =2100000;

    public EmpleadoPlanta(int edad, String nombre) {
        super(nombre, edad);

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
