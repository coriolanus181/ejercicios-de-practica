import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int OpBicicleta = 3;


        String marcaBici =switch (OpBicicleta){
            case 1 -> "Scott";
            case 2 ->"Cannondate";
            case 3 ->"Specialized";
            default -> "No es tu bicicleta" ;

        };
        System.out.println("tu bicicleta es \t"+marcaBici);


    }
}






