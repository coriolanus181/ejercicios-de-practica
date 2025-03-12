import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


      /*  Scanner teclado =new Scanner(System.in);
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
        System.out.println("--------Winner----------");*/

// numeros pares
        /*
        for(int i=1;i<101;i++){
            if(i%2==0){
                System.out.println(i+"\t El número es par ");
            }else{
                System.out.println(i+"\t El número es impar ");
            }

        }*/


        // número primo


   /*     for (int i=1;i<=4;i++){
            int cont=0;
        for (int j = 1; j <= i; j++) {
            if (i % j == 0) {
                cont++;
            }


        }
            if (cont > 2) {
                System.out.println(i+"el numero no es primo");
            } else {
                System.out.println(i+"el número es primo");
            }


        }*/
        //practica
       /* Scanner teclado=new Scanner(System.in);
        boolean estado=true;
        do {
            int cont = 0;
            System.out.println("ingrese un número para validar si es primo");
            int numero = teclado.nextInt();

            for (int i = 1; i < numero; i++) {
                if (numero % i == 0) {
                    cont++;
                }
            }

            if (cont > 2) {
                System.out.println("no es número primo");
            } else {
                System.out.println("es numero primo");
            }
        }while (estado);*/
/*int min=1;
int max=6;
int minL=1;
int maxL=10;
int a=0;
int b=0;
Random ale= new Random();
int lanzadas =ale.nextInt(maxL-minL+1)+minL;
for(int i=1;i<lanzadas;i++){
        int dado1 =ale.nextInt(max-min+1)+min;
         int dado2 =ale.nextInt(max-min+1)+min;
    System.out.println("lanzamiento\t"+i+"\tdado1 "+dado1+"\tdado2 "+dado2);
    a+=dado1;
    b+=dado2;
        }
        System.out.println("resultados\tdado1 "+a+"\tdado2 "+b);
if(a>b){
    System.out.println("el ganador es el dado 1");
}else{
    System.out.println("el ganador es el dado 2");
}*/

        Scanner teclado = new Scanner(System.in);

        System.out.println("operaciones");
        System.out.println("a.suma ");
        System.out.println("b. resta");
        System.out.println("c. multiplicacion");
        System.out.println("d. division ");
        String opc = teclado.nextLine();

        double resultado = switch (opc) {
            case "a" -> 1 + 1;
            case "b" -> 2 - 1;
            case "c" -> 2 * 2;
            case "d" -> 2 / 2;
            default -> 2*8;
        };
        System.out.println("el resultado es"+resultado);
    }
}


