import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        List<LibroImpreso> impresos = new ArrayList<>();
        List<LibroDigital> digitales = new ArrayList<>();
        LibroImpreso libroI1= new LibroImpreso();
        LibroImpreso libroI2 = new LibroImpreso();
        LibroDigital libroD1 = new LibroDigital();
        LibroDigital libroD2 = new LibroDigital();
        impresos.add(libroI1);
        impresos.add(libroI2);
        digitales.add(libroD1);
        digitales.add(libroD2);
        String tituloL1,autorL1;
        double precioL1;
        int pesoL1 , repetir, nLibros ;
        boolean estado = true;
        System.out.println("Digite la cantidad de libros que desea ingresar");
         nLibros = teclado.nextInt();
     String[] titulosD = new String[nLibros];
        System.out.println("Bienvenido a la libreria ");
        System.out.println("¿Qué libro desea ingresar ?");
        System.out.println("1 Impreso 2. Digital");
        int opc = teclado.nextInt();

        switch (opc){
            case 1 -> {
                System.out.println("escriba el titulo");
                for(int i=1;i<impresos.size();i++){
                    System.out.println("digite el titulo del libro no"+i);
                   // titulosD = teclado.tokens().toArray();
                }
                tituloL1 =teclado.nextLine();
               System.out.println("escriba el autor");
                autorL1 = teclado.nextLine();
                System.out.println("escriba el precio");
                precioL1 = teclado.nextDouble();
                System.out.println("escriba el peso");
                pesoL1 = teclado.nextInt();

                libroI1.setTitulo(tituloL1);
                libroI1.setAutor(autorL1);
                libroI1.setPrecio(precioL1);
                libroI1.setPeso(pesoL1);
              //  libroI1.mostrarInfo();

                System.out.println("Libros impresos :");
                for(LibroImpreso D : impresos){
                  D.mostrarInfo();
                }
            }
            case 2 -> {
                System.out.println("escriba el titulo");
                tituloL1 =teclado.nextLine();
                System.out.println("escriba el autor");
                autorL1 = teclado.nextLine();
                System.out.println("escriba el precio");
                precioL1 = teclado.nextDouble();
                System.out.println("escriba el peso");
                pesoL1 = teclado.nextInt();
                libroI1.setTitulo(tituloL1);
                libroI1.setAutor(autorL1);
                libroI1.setPrecio(precioL1);
                libroI1.setPeso(pesoL1);
                libroI1.mostrarInfo();
            }
            default -> System.out.println("elija una opcion valida");
        };
        /*System.out.println("Desea ingresar  otro libro : 1. Si 2. No");
        repetir = teclado.nextInt();
        if (repetir==1) {
            continue;
        } else {

        }*/


    }

}


