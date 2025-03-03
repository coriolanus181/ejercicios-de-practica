import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int max = 3;
        int min = 1;
        int dinero;
        int numAle;
        int opc;
        boolean estado=true;

        System.out.println("Ingrese su  Dinero");
        dinero = teclado.nextInt();
        do {
            Random ale = new Random();
            numAle = ale.nextInt(max - min + 1) + min;
            System.out.println(numAle);

            if (numAle == 1) {
                System.out.println("Has ganado x2");
                dinero *= 2;
                System.out.println("tu dinero es\t"+dinero );
                System.out.println("Deseas seguir jugando : 1.Si 2.No");
                opc= teclado.nextInt();
                if (opc==1){
                    numAle = ale.nextInt(max - min + 1) + min;
                    System.out.println(numAle);
                    continue;

                    //System.out.println("1. SI");
                }else if(opc==2){
                    estado=false;
                    //System.out.println("2. NO");
                    System.out.println("tu dinero es"+dinero);
                }
            } else if (numAle == 2) {
                System.out.println("pierdes la mitad");
                dinero /= 2;
                System.out.println("tu dinero es \t"+dinero );
                System.out.println("Deseas seguir jugando : 1.Si 2.No");

                opc= teclado.nextInt();
                if (opc==1){
                    numAle = ale.nextInt(max - min + 1) + min;
                    System.out.println(numAle);
                    continue;

                    //System.out.println("1. SI");
                }else if(opc==2){
                    estado=false;
                    //System.out.println("2. NO");
                    System.out.println("tu dinero es\t"+dinero);
                }
            } else if (numAle == 3) {
                System.out.println("pierdes todo");
                dinero -= dinero;
                estado= false;
            }

        } while (estado);



    }

}


