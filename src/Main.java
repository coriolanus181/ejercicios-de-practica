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


     /*   for (int i=1;i<=4;i++){
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
        Scanner teclado =new Scanner(System.in);
        int min=1;
        int max=100;
        int  opc = 0;
        int sum,res,mul,mod,pot;
        double div;
        int volver;
        boolean continuar=true;
        Random ale =new Random();
        int numAle1 = ale.nextInt(max - min + 1) + min;
        int numAle2 = ale.nextInt(max - min + 1) + min;
        System.out.println("primer número "+numAle1);
        System.out.println("segundo número "+numAle2);
do {
        System.out.println("Elija la operación que desea hacer");
        System.out.println("1.+ 2.- 3.x 4./ 5.^ 6.% ");
        opc = teclado.nextInt();
     switch (opc){
         case 1 :
                sum=numAle1+numAle2;
                System.out.println("el resultado de la opración \t"+sum);
            break;
         case 2 : res=numAle1-numAle2;
             System.out.println("el resultado de la opración \t"+res);
            break;
         case 3 :mul=numAle1*numAle2;
             System.out.println("el resultado de la opración \t"+mul);
            break;
         case 4:
            div=(double)numAle1/numAle2;
             System.out.println("el resultado de la opración \t"+div);
             break;
         case 5:
             pot= (int) Math.pow(numAle1,numAle2);
             System.out.println("el resultado de la opración \t"+pot);
             break;
         case 6:
            mod= numAle1&numAle2;
             System.out.println("el resultado de la opración \t"+mod);
             break;
         default :
             System.out.println("elija una opcion válida");
             continue;
        }
    System.out.println("Deseas hacer otra operación 1.Si 2.No");
     volver= teclado.nextInt();
     if(volver==1){
         continue;
     }else{
         System.out.println("adios");
         continuar=false;
     }
        /*if(volver==1){
            continue;
        }else {
            break;
        }*/
   } while(continuar);
    }
}


