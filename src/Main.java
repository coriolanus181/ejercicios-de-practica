import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int opc;
        int publicidad;
        int repetir;
        boolean estado =true;
        Candidato marco = new Candidato("Marco Tulio", 0);
        Candidato wilson = new Candidato("Wilson", 0);
        Candidato fabian = new Candidato("Fabian", 0);

        List<Candidato> candidatos = new ArrayList<>();
        candidatos.add(marco);
        candidatos.add(wilson);
        candidatos.add(fabian);
do {


    System.out.println("Bienvenidos a las votaciones");
    System.out.println("votar por candidato");
    System.out.println("calcular costo de campaña");
    System.out.println();
    System.out.println("Elija cuál es el candidato a votar:");
    System.out.println("1. Marco Tulio Sanchez");
    System.out.println("2. Wilson García");
    System.out.println("3. Fabian Rojas");

    opc = teclado.nextInt();

    switch (opc) {
        case 1 -> {
            marco.setVoto(marco.getVoto() + 1);
            System.out.println("Votaste por: " + marco.getNombre());
            System.out.println("¿Cuál fue el medio que lo influenció?");
            System.out.println("1. Internet  2. Radio  3. Televisión");
            publicidad = teclado.nextInt();
            marco.agregarPublicidad(publicidad);
            System.out.println(marco);
            System.out.println("Desea realizar otro voto : 1. si 2.no");
            repetir = teclado.nextInt();
            if (repetir == 1) {
                continue;
            }else{
                estado=false;
            }
        }
        case 2 -> {
            wilson.setVoto(wilson.getVoto() + 1);
            System.out.println("Votaste por: " + wilson.getNombre());
            System.out.println("¿Cuál fue el medio que lo influenció?");
            System.out.println("1. Internet  2. Radio  3. Televisión");
            publicidad = teclado.nextInt();
            wilson.agregarPublicidad(publicidad);
            System.out.println(wilson);
            System.out.println("Desea realizar otro voto : 1. si 2.no");
            repetir = teclado.nextInt();
            if (repetir == 1) {
                continue;
            }else{
                estado=false;
            }
        }
        case 3 -> {
            fabian.setVoto(fabian.getVoto() + 1);
            System.out.println("Votaste por: " + fabian.getNombre());
            System.out.println("¿Cuál fue el medio que lo influenció?");
            System.out.println("1. Internet  2. Radio  3. Televisión");
            publicidad = teclado.nextInt();
            fabian.agregarPublicidad(publicidad);
            System.out.println(fabian);
        }
        default -> System.out.println("Elija un candidato válido");
    }
}while(estado);


       /* String nombreE;
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
        }while(estado);*/

    }
}




