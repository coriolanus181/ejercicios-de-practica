import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double peso, altura, imc;


        System.out.println("ingrese su peso");
        peso = teclado.nextDouble();

        System.out.println("ingrese su altura");
        altura = teclado.nextDouble();

        imc = peso / (altura * altura);


        if (imc <= 18.49) {
            System.out.println("Imc \t" + imc + "peso bajo");

        } else if (imc <= 24.99) {
            System.out.println("Imc \t" + imc + "peso normal");
        } else if (imc <= 29.99) {
            System.out.println("Imc\t" + imc + "sobrepeso");
        } else if (imc <= 34.99) {
            System.out.println("Imc \t" + imc + "obesidad leve");
        } else if (imc <= 39.99) {
            System.out.println("Imc \t" + imc + "obesidad media");
        } else {
            System.out.println("Imc \t" + imc + "Obesisdad morbida");
        }

    }





    }




