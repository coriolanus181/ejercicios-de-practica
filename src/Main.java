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
        boolean estado = true;
        String nombreP, apellidoP, documentoP,nombrePe,raza,tamano,placa;

        int opc,edadP,edadPE;
        int numPerros = 0;
        String adopcion;
        List<Persona> personas = new ArrayList<>();
        List<Perro> perros = new ArrayList<>();
        do {
            System.out.println("Bienvenido a la adopción de perros");
            System.out.println("1.Registrar persona");
            System.out.println("2.Registrar Perros");
            System.out.println("3.Ver personas registradas");
            System.out.println("4. Ver perros disponibles");
            System.out.println("5. Adoptar perro ");
            System.out.println("6. consultar el perro mas viejo adoptado por una persona");
            System.out.println("7. salir del programa");

            opc = teclado.nextInt();

            switch (opc) {
                case 1 -> {
                    teclado.nextLine();
                    System.out.print("Escriba el nombre de la persona");
                    nombreP = teclado.nextLine();
                    System.out.print("Escriba el apellido de la persona");
                    apellidoP = teclado.nextLine();
                    System.out.println("Escriba la edad de la persona");
                    edadP = teclado.nextInt();
                    teclado.nextLine();
                    System.out.print("Escriba el documento de la persona");
                    documentoP = teclado.nextLine();

                    personas.add(new Persona(nombreP, apellidoP, edadP, documentoP));


                }
                case 2 -> {
                    teclado.nextLine();
                    System.out.print("Escriba  el nombre del perro");
                    nombrePe = teclado.nextLine();
                    System.out.print("¿cuál es la placa del perro?");
                    placa = teclado.nextLine();
                    System.out.println("¿cuál es la raza del perro?");
                    raza = teclado.nextLine();
                    System.out.println("¿cuál es la edad del perro?");
                    edadPE = teclado.nextInt();
                    teclado.nextLine();
                    System.out.print("¿cuál es el tamano del perro?");
                    tamano = teclado.nextLine();

                    perros.add(new Perro(placa, nombrePe, raza, edadPE, tamano));
                }

                case 3 -> {
                    teclado.nextLine();
                    System.out.print("Personas registradas ");
                    System.out.println("\nIngrese el documento de la persona");
                    String documento= teclado.nextLine();;
                    for (Persona p : personas) {
                        if (p.getDocumento().equals(documento)){
                            System.out.println(p);
                            break;
                        }else{
                            System.out.println("persona no encontrada");
                        }
                       // System.out.println(p);

                    }
                }

                case 4 -> {
                    System.out.println("Perros disponibles");

                    for (Perro c : perros) {
                        System.out.println(c);
                    }



                }

                case 5 -> {

                    teclado.nextLine();
                    System.out.print("¿Qué perro desea adoptar? escriba la placa del perro");
                    adopcion= teclado.nextLine();
                    System.out.println("Escriba el documento de la persona , que va adoptar el perro");
                    String documento  = teclado.nextLine();
                    for (Perro c : perros) {
                        // System.out.println(c);
                        if (c.getPlaca().equals(adopcion)){
                           // System.out.println(c.getNombre());
                          //  do {
                            for (Persona p : personas) {

                                   if (p.getDocumento().equals(documento)) {
                                       p.adoptarPerro(c);
                                     //  numPerros++;
                                       break;

                                   }

                            }
                            perros.remove(c);
                            break;
//}while(numPerros>3);
                          //  System.out.println();
                        }else{
                            System.out.println("el perro no se encuentra");
                        }

                    }



                }

                case 6 -> {
                        for(Persona p: personas){
                            System.out.println("el perro con mayor edad adoptado es "+p.perroMasGrande());
                        }
                }

                case 7 -> {
                    estado = false;
                }
            };
        }while(estado);
    }
}