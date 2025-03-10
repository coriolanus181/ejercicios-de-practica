import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int opc;
        double gra;
        double resultado;
        boolean estado = true;
        int repetir;


        do {
            System.out.println("Menu de opciones");
            System.out.println("1. Celsius a Fahrenheit");

            System.out.println("2. Celsius a Kelvin");
            System.out.println("3. Celsius a Rankine");
            System.out.println("4. Celsius a Réaumur");
            System.out.println("5. fahrenheit a Celsius");
            System.out.println("6. Fahrenheit a Kelvin");
            System.out.println("7.Fahrenheit a Rankine");
            System.out.println("8.Fahrenheit a Réaumur");
            System.out.println("9.Kelvin a Celsius");
            System.out.println("10.Kelvin a Fahrenheit");
            System.out.println("11.Kelvin a Rankine");
            System.out.println("12.Kelvin a Réaumur");
            System.out.println("13.Rankine a Celsius");
            System.out.println("14.Rankine a Fahrenheit");
            System.out.println("15. Rankine a Kelvin");
            System.out.println("16.salir\n");

            System.out.println("Ingrese un valor positivo");
            opc = teclado.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("1. Celsius a Fahrenheit");

                    gra = teclado.nextInt();
                    if(gra>0){
                        resultado = (gra * 9 / 5) + 32;

                        System.out.println("su resultado es" + resultado + "°F");
                    }else{
                        System.out.println("elija una opcion valida");
                    }

                    break;
                case 2:

                    System.out.println("2. Celsius a Kelvin");
                    System.out.println("Ingrese un valor valido");
                    gra = teclado.nextInt();
                    if(gra>0){
                        resultado = gra + 273.15;
                        System.out.println("su resultado es" + resultado + "°K");
                    }else{
                        System.out.println("elija una opcion valida");
                    }
                    break;
                case 3:
                    System.out.println("3. Celsius a Rankine");
                    System.out.println("Ingrese un valor valido");
                    gra = teclado.nextInt();
                    if(gra>0){
                        resultado = (gra + 273.15) * 9 / 5;
                        System.out.println("su resultado es" + resultado + "°R");
                    }else{
                        System.out.println("elija una opcion valida");
                    }
                    break;

                case 4:
                    System.out.println("4. Celsius a Réaumur");
                    System.out.println("Ingrese un valor valido");
                    gra = teclado.nextInt();
                    if(gra>0){
                        resultado = gra * 4 / 5;
                        System.out.println("su resultado es" + resultado + "°Re");
                    }else{
                        System.out.println("elija una opcion valida");
                    }
                case 5:
                    System.out.println("5. fahrenheit a Celsius");

                    gra = teclado.nextInt();
                    if(gra>0){
                        resultado = (gra - 32) * 5 / 9;
                        System.out.println("su resultado es" + resultado + "°C");
                    }else{
                        System.out.println("elija una opcion valida");
                    }
                    break;
                case 6:
                    System.out.println("6. Fahrenheit a Kelvin");
                    System.out.println("Ingrese un valor valido");
                    gra = teclado.nextInt();
                    if(gra>0){
                        resultado = (gra - 32) * 5 / 9 + 273.15;
                        System.out.println("su resultado es" + resultado + "K");
                    }else{
                        System.out.println("elija una opcion valida");
                    }
                    break;
                case 7:
                    System.out.println("7.Fahrenheit a Rankine");
                    System.out.println("Ingrese un valor valido");
                    gra = teclado.nextInt();
                    if(gra>0){
                        resultado = gra + 459.67;
                        System.out.println("su resultado es" + resultado + "°R");
                    }else{
                        System.out.println("elija una opcion valida");
                    }
                    break;

                case 8:
                    System.out.println("8.Fahrenheit a Réaumur");
                    System.out.println("Ingrese un valor valido");
                    gra = teclado.nextInt();
                    if(gra>0){
                        resultado = (gra - 32) * 4 / 9;
                        System.out.println("su resultado es" + resultado + "°Re");
                    }else{
                        System.out.println("elija una opcion valida");
                    }
                    break;
                case 9:
                    System.out.println("9.Kelvin a Celsius");

                    gra = teclado.nextInt();
                    if(gra>0){
                        resultado = gra - 273.15;
                        System.out.println("su resultado es" + resultado + "°C");
                    }else{
                        System.out.println("elija una opcion valida");
                    }
                    break;
                case 10:
                    System.out.println("10.Kelvin a Fahrenheit");
                    System.out.println("Ingrese un valor valido");
                    gra = teclado.nextInt();
                    if(gra>0){
                        resultado = (gra - 273.15) * 9 / 5 + 32;
                        System.out.println("su resultado es" + resultado + "K");
                    }else{
                        System.out.println("elija una opcion valida");
                    }
                    break;
                case 11:
                    System.out.println("11.Kelvin a Rankine");
                    System.out.println("Ingrese un valor valido");
                    gra = teclado.nextInt();
                    if(gra>0){
                        resultado = gra * 9 / 5;
                        System.out.println("su resultado es" + resultado + "°R");
                    }else{
                        System.out.println("elija una opcion valida");
                    }
                    break;

                case 12:
                    System.out.println("12.Kelvin a Réaumur");
                    System.out.println("Ingrese un valor valido");
                    gra = teclado.nextInt();
                    if(gra>0){
                        resultado = (gra - 273.15) * 4 / 5;
                        System.out.println("su resultado es" + resultado + "°Re");
                    }else{
                        System.out.println("elija una opcion valida");
                    }
                    break;
                case 13:
                    System.out.println("13.Rankine a Celsius");

                    gra = teclado.nextInt();
                    if(gra>0){
                        resultado = (gra - 491.67) * 5 / 9;
                        System.out.println("su resultado es" + resultado + "°C");
                    }else{
                        System.out.println("elija una opcion valida");
                    }
                    break;
                case 14:
                    System.out.println("14.Rankine a Fahrenheit");
                    System.out.println("Ingrese un valor valido");
                    gra = teclado.nextInt();
                    if(gra>0){
                        resultado = gra - 459.67;
                        System.out.println("su resultado es" + resultado + "°F");
                    }else{
                        System.out.println("elija una opcion valida");
                    }
                    break;
                case 15:
                    System.out.println("15. Rankine a Kelvin");
                    System.out.println("Ingrese un valor valido");
                    gra = teclado.nextInt();
                    if(gra>0){
                        resultado = gra * 5 / 9;
                        System.out.println("su resultado es" + resultado + "°R");
                    }else{
                        System.out.println("elija una opcion valida");
                    }
                    break;

                case 16:
                    estado=false;
                default:
                    System.out.println("elija una opción valida");
                    continue;
            }

            System.out.println("1.¿ desea volver al menu? 1. Si  2. No ");
            repetir = teclado.nextInt();

            if (repetir == 1) {
                continue;
            } else {
                estado=false;
            }
        } while (estado) ;
    }
}


