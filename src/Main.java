import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        boolean estado = true;
        int opc;
        List<Persona> personas = new ArrayList<>();
        System.out.println("Bienvenido a la adopción del perro");
        System.out.println("1.Registrar personda");
        System.out.println("2.Registrar Perros");
        System.out.println("3.Ver personas registradas");
        System.out.println("4. Ver perros disponibles");
        System.out.println("5. Adoptar perro ");
        System.out.println("6. consultar el perro mas viejo adoptado por una persona");
        System.out.println("7. salir del programa");

        opc = teclado.nextInt();

        switch (opc){
            case 1 ->{

            }
        }
    }
}