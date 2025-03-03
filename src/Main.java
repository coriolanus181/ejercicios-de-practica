import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Scanner teclado =new Scanner(System.in);
        int num;
        int min= 1;
        int max =100;
        Random ale = new Random();
        int numAle = ale.nextInt(max - min + 1) + min;
        System.out.println(numAle);
            System.out.println("ingrese un número entre el uno y el 100");
            num = teclado.nextInt();
        do {

                //System.out.println("--------Winner----------");
 if (numAle > num) {
                System.out.println("El número es mayor que el ingresado ");
                System.out.println("por favor ingrese nuevamente un numero");
                num = teclado.nextInt();

            } else if (num > numAle) {
                System.out.println("El numero es menor que el ingresado");
                System.out.println("por favor ingrese nuevamente un numero");
                num = teclado.nextInt();
            }
        }while(num != numAle);
        System.out.println("--------Winner----------");


    }

}


