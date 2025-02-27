import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {




           // numeros aleatorios
                int min = 1;
                int max = 6;
                int minL =2;
                int maxL =100;
                int a=0;
                int b=0;
        Random ale = new Random();
        int lanzadas = ale.nextInt(maxL-minL+1)+minL;
        System.out.println("-----------Lanzamientos------------");
                for(int i=1;i<=lanzadas;i++){
                    int dado1 = ale.nextInt(max-min+1)+min;
                    int dado2 = ale.nextInt(max-min+1)+min;


                            System.out.print("Lanzamiento # " + i + "\t");
                            System.out.print("\tdado uno =" + dado1 );
                            System.out.println("\t dado dos =" + dado2 + "\t");
                        a=a+dado1;
                        b=b+dado2;


                }
            System.out.println("-------------Resultados------------------------");
            System.out.println("total puntos dado 1 ="+ a);
            System.out.println("total puntos dado 2 ="+ b);
            if (a>b){
                System.out.println("-----------El ganador es el dado1--------------");
            }else if (a==b){
                System.out.println("-----------Empate------------");
            }else{
                System.out.println("-----------El ganador es el dado 2------------");
            }
    }
}

               /*
        Random ale = new Random();
        int dado1 = ale.nextInt(max-min+1)+min;
        int dado2 = ale.nextInt(max-min+1)+min;
        int lanzadas = ale.nextInt(maxL-minL+1)+minL;
        System.out.println("El aleatorio es : "+ dado1);
        System.out.println("El aleatorio es : "+ dado2);
        System.out.println("El aleatorio es : "+ lanzadas);

    if (dado1> dado2){
        System.out.println("el ganador es el dado 1");
    }else {
        System.out.println("el ganador es el dado 2");
    }*/




