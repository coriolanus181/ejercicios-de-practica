import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean estado = true;
        List<Animal> Domesticos = new ArrayList<>();
        Animal chihuahua = new Perro(10, "cuadrupedo", 2, "macho", razas.chihuahua);
        Animal gatoPersa = new Gato(8, "cuadrupedo", 2, "pelaje rizado");
        detallesA dibujos = new detallesA();
        Domesticos.add(chihuahua);
        Domesticos.add(gatoPersa);
        chihuahua.setEdad(chihuahua.edad + 10);

        do {
            System.out.println("Bienvenidos a PetShop");
            System.out.println("elija su animal");
            System.out.println("1. perro \n 2.gato \n3.salir");
            int ani = teclado.nextInt();

            switch (ani) {
                case 1 -> {
                    System.out.println(Domesticos.getFirst());
                    System.out.println(dibujos.dibujoAnimal(1));
                }
                case 2 -> {

                    System.out.println(Domesticos.getLast());
                    System.out.println(dibujos.dibujoAnimal(2));
                }
                case 3 -> estado = false;
                default -> System.out.println("Elija una opcion valida");
            }
            ;

        } while (estado);
    }
}





