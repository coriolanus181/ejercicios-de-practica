import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

         Scanner teclado = new Scanner(System.in);

      /*  int n1,n2;
        double raiz1,raiz2;

        do {
            System.out.println("ingrese un valor de n1");
            n1 = teclado.nextInt();
        } while (n1<=0);

        do{
            System.out.println("ingrese un valor de n2");
            n2 = teclado.nextInt();
        } while (n2<=0);

        raiz1 = Math.sqrt(n1);
        raiz2 = Math.sqrt(n2);

        System.out.println("la raiz de na es"+ raiz1);
        System.out.println("la raiz de na es"+ raiz2);*/
      /*  double peso,altura,imc;


        System.out.println("ingrese su peso");
        peso =teclado.nextDouble();

        System.out.println("ingrese su altura");
        altura =teclado.nextDouble();

        imc=peso/(altura*altura);


           if (imc <= 18.49){
                System.out.println("Imc \t"+ imc+"peso bajo");

            }else if (imc <= 24.99){
                System.out.println("Imc \t"+ imc+"peso normal");
            }else if (imc <= 29.99){
                System.out.println("Imc\t"+ imc+"sobrepeso");
            }else if (imc <= 34.99){
                System.out.println("Imc \t"+ imc+"obesidad leve");
            }else if (imc <= 39.99){
                System.out.println("Imc \t"+ imc+"obesidad media");
            } else {
               System.out.println("Imc \t" + imc + "Obesisdad morbida");
           }
*/

           // numeros aleatorios
                int min = 1;
                int max = 6;
                int minL =2;
                int maxL =100;
        Random ale = new Random();
        int dado1 = ale.nextInt(max-min+1)+min;
        int dado2 = ale.nextInt(max-min+1)+min;
        int lanzadas = ale.nextInt(maxL-minL+1)+minL;
        System.out.println("El aleatorio es : "+ dado1);
        System.out.println("El aleatorio es : "+ dado2);
        System.out.println("El aleatorio es : "+ lanzadas);


        for (int i=0;i<lanzadas;i++){

        }
            }




    }




