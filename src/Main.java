import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        boolean reini = true;

        do {
            int llamadaL = 50;
            int llamadaLD = 350;
            int llamadaC = 150;

            int opc;
            int repetir;
            boolean estado = true;

            int totalbase = 0;
            int totalLc = 0;
            int totalLD = 0;
            int totalC = 0;

            int tLlamadaL = 0;
            int tllamadaLC = 0;
            int tllamadaC = 0;
            int contLC = 0, contLD = 0, contC = 0;

            do {

                System.out.println("Elija el tipo de llamada que desea hacer:");
                System.out.println("1. Local 50$");
                System.out.println("2. Larga distancia 350$");
                System.out.println("3. Celular 150$");
                opc = teclado.nextInt();


                switch (opc) {
                    case 1:
                        totalbase += llamadaL;
                        totalLc += llamadaL;
                        contLC++;
                        System.out.println("¿Cuál fue el tiempo de la llamada?");
                        tLlamadaL += teclado.nextInt();
                        break;
                    case 2:
                        totalbase += llamadaLD;
                        totalLD += llamadaLD;
                        contLD++;
                        System.out.println("¿Cuál fue el tiempo de la llamada?");
                        tllamadaLC += teclado.nextInt();
                        break;
                    case 3:
                        totalbase += llamadaC;
                        totalC += llamadaC;
                        contC++;
                        System.out.println("¿Cuál fue el tiempo de la llamada?");
                        tllamadaC += teclado.nextInt();
                        break;
                    default:
                        System.out.println("Elija una opción válida");
                        continue;
                }


                System.out.println("¿Desea realizar otra llamada? 1. Sí  2. No");
                repetir = teclado.nextInt();

                if (repetir == 1) {
                    continue;
                } else {
                    estado = false;
                    System.out.println("--------------Factura electrónica-----------------");
                    System.out.println("Llamada\t\tCantidad\tValor Total\tDuración");


                    System.out.println("Llamada Local\t" + contLC + "\t\t" + totalLc + "\t\t" + tLlamadaL+"\tminutos");
                    System.out.println("Llamada Larga Distancia\t" + contLD + "\t\t" + totalLD + "\t\t" + tllamadaLC+"\tminutos");
                    System.out.println("Llamada Celular\t\t" + contC + "\t\t" + totalC + "\t\t" + tllamadaC+"\tminutos");

                    System.out.println("El valor total es: " + totalbase);
                }


                System.out.println("¿Desea reiniciar la app? 1. Sí  2. No");
                int opcR = teclado.nextInt();

                if (opcR == 2) {
                    reini = false;
                } else {

                    totalbase = 0;
                    totalLc = 0;
                    totalLD = 0;
                    totalC = 0;
                    tLlamadaL = 0;
                    tllamadaLC = 0;
                    tllamadaC = 0;
                    contLC = 0;
                    contLD = 0;
                    contC = 0;
                    estado = true;
                }

            } while (estado);

        } while (reini);
        System.out.println("adios ,vuelva pronto");


    }

}


