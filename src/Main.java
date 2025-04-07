import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//EmpleadoPlata carlos = new EmpleadoPlanta(55,"carlos",210000);
        Scanner teclado = new Scanner(System.in);
        String nombreE;
        int edadE, horasE, opc , repetir;
        boolean estado =true;


        List<EmpleadoHoras> contratista = new ArrayList<>();
        List<EmpleadoPlanta> fijo= new ArrayList<>();
        do {


            System.out.println("Bienvenido al registro de empleados");
            System.out.println("Ingrese el tipo de usuario a registrar : ");
            System.out.println("1.Empleado Planta 2. Empleado por Horas");

            opc = teclado.nextInt();

            switch (opc) {
                case 1 -> {
                    teclado.nextLine();
                    System.out.print("Escriba el nombre del empleado");
                    nombreE = teclado.nextLine();
                    System.out.print("Digite la edad del empleado");
                    edadE = teclado.nextInt();



                    fijo.add(new EmpleadoPlanta(edadE, nombreE));

                    System.out.println("desea ingresar otro empleado 1.si 2.no");
                    repetir = teclado.nextInt();
                    if (repetir == 1) {

                        continue;
                    } else {
                        estado = false;
                    }
                }
                case 2 -> {
                    teclado.nextLine();
                    System.out.print("Escriba el nombre del empleado");
                    nombreE = teclado.nextLine();
                    System.out.print("Digite la edad del empleado");
                    edadE = teclado.nextInt();
                    System.out.println("Ingrese el numero de horas trabajadas");
                    horasE= teclado.nextInt();


                    contratista.add(new EmpleadoHoras(edadE,nombreE,horasE));
                    System.out.println("desea ingresar otro empleado 1.si 2.no");
                    repetir = teclado.nextInt();
                    if (repetir == 1) {

                        continue;
                    } else {
                        estado = false;
                    }
                }
                default -> System.out.println("elija una opción válida");

            };
            System.out.println("Empleados registrados");
            for (EmpleadoPlanta p: fijo){
                p.mostrarInformacion();
            }

            for(EmpleadoHoras h: contratista){
                h.mostrarInformacion();
            }
        }while(estado);

    }
}




