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
      /*  LibroImpreso libroI1= new LibroImpreso();
        LibroImpreso libroI2 = new LibroImpreso();
        LibroDigital libroD1 = new LibroDigital();
        LibroDigital libroD2 = new LibroDigital();
       impresos.add(libroI1);
        impresos.add(libroI2);
        digitales.add(libroD1);
        digitales.add(libroD2);*/
        String tituloL1,autorL1, tituloL2, autorL2;
        double precioL1,precioL2;
        int pesoL1 , repetir, nLibros, tamano ;

        boolean estado = true;
        /*System.out.println("Digite la cantidad de libros que desea ingresar");
         nLibros = teclado.nextInt();
     String[] titulosD = new String[nLibros];*/
        do {
            System.out.println("Bienvenido a la libreria ");
            System.out.println("¿Qué libro desea ingresar ?");
            System.out.println("1 Impreso 2. Digital 3. Salir");
            int opc = teclado.nextInt();

            switch (opc) {
                case 1 -> {
                    teclado.nextLine();
                    System.out.print("escriba el titulo :");
                /*for(int i=1;i<impresos.size();i++){
                    System.out.println("digite el titulo del libro no"+i);
                   // titulosD = teclado.tokens().toArray();
                }*/
                    tituloL1 = teclado.nextLine();
                    System.out.print("escriba el autor");
                    autorL1 = teclado.nextLine();
                    System.out.println("escriba el precio");
                    precioL1 = teclado.nextDouble();
                    System.out.println("escriba el peso");
                    pesoL1 = teclado.nextInt();

                    impresos.add(new LibroImpreso(tituloL1, autorL1, precioL1, pesoL1));
                    System.out.println("desea ingresar mas libros: 1. si 2.no");
                    repetir = teclado.nextInt();
                    if(repetir==1){
                        continue;
                    }else{
                        estado=false;
                    }


               /*System.out.println("Desea ingresar mas libros : 1. Si 2. No");
                repetir= teclado.nextInt();;
                if(repetir ==1){
                   impresos.add(new LibroImpreso());
                   continue;
                }*/

                }
                case 2 -> {
                    teclado.nextLine();
                    System.out.print("escriba el titulo");
                    tituloL2 = teclado.nextLine();
                    System.out.print("escriba el autor");
                    autorL2 = teclado.nextLine();
                    System.out.println("escriba el precio");
                    precioL2 = teclado.nextDouble();
                    System.out.println("escriba el tamaño ");
                    tamano = teclado.nextInt();

                    digitales.add(new LibroDigital(tituloL2,autorL2,precioL2,tamano));
                /*libroI1.setTitulo(tituloL1);
                libroI1.setAutor(autorL1);
                libroI1.setPrecio(precioL1);
                libroI1.setPeso(pesoL1);
                libroI1.mostrarInfo();*/
                    System.out.println("desea ingresar mas libros: 1. si 2.no");
                    repetir = teclado.nextInt();
                    if(repetir==1){
                        continue;
                    }else{
                        estado=false;
                    }

                }
                case 3 ->{
                    System.out.println("salir");
                    estado=false;
                }

                default -> System.out.println("elija una opcion valida");
            };
            System.out.println("\nLibros impresos :");
            for (LibroImpreso D : impresos) {
                D.mostrarInfo();
            }

            for (LibroDigital S : digitales) {
                S.mostrarInfo();
            }

        }while(estado);
    }

}


