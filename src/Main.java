import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        String Electrodomestico = "Lavadora";

        switch (Electrodomestico.toLowerCase()) {
            case "Nevera":
                Electrodomestico = "Nevera";
                break;
            case "Televisor":
                Electrodomestico = "Televisor";
                break;
            case "lavadora":
                Electrodomestico = "Lavadora";
                break;

            default:
                Electrodomestico = "No es tu electrodomestico";
        }
        System.out.println("Tu electrodomestico es\t" + Electrodomestico);

    }
}






