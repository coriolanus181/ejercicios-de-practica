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
        List<Usuario> usuarios= new ArrayList<>() ;
        List<Libro> libros = new ArrayList<>();
        String documento,nombre,autor,nombreL;
        do {


            System.out.println("Bienvenidos a la biblicoteca");
            System.out.println("1.registrar usuario");
            System.out.println("2. registrar libros");
            System.out.println("3. alquilar libros");
            System.out.println("4. devolver libros");
            System.out.println("5. mostrar listado de libros y usuarios");
            System.out.println("6. salir");
            System.out.println("ingrese una opcion");
            opc = teclado.nextInt();

            switch (opc) {
                case 1 -> {
                    teclado.nextLine();
                    System.out.print("Ingrese un nombre");
                    nombre = teclado.nextLine();
                    System.out.println("Ingrese un Documento");
                    documento = teclado.nextLine();

                    usuarios.add(new Usuario(documento, nombre));
                    for (Usuario o : usuarios) {
                        System.out.println(o);
                    }
                }
                case 2 ->{
                    teclado.nextLine();
                    System.out.print("Ingrese el nombre del libro");
                    nombreL= teclado.nextLine();
                    System.out.println("Ingresa el autor");
                    autor= teclado.nextLine();


                    libros.add(new Libro(autor,nombreL));
                    for(Libro l: libros){
                        System.out.println(l);
                    }
                }

                case 3 ->{
                    teclado.nextLine();
                    System.out.print("¿qué libro desea alquilar? ingrese el nombre");
                    String libroA= teclado.nextLine();
                    System.out.println("ingrese el documento de la persona que desea alguilar");
                    String documentoA = teclado.nextLine();

                    boolean estadoal = true;

                    for(Libro l: libros) {
                        if (l.getNombre().equals(libroA)) {

                            for (Usuario u : usuarios) {
                                if (u.getDocumento().equals(documentoA)) {
                                    u.alquilarLibro(l);
                                    libros.remove(l);
                                    break;


                                } else {
                                    System.out.println("usuario no registrado");
                                }

                            }


                        } else {
                            System.out.println("libro no encontrado");
                        }

                    }
                }

                case 4 ->{
                    teclado.nextLine();
                    System.out.print("¿Qué libro desea devolver? Ingrese el nombre: ");
                    String libroD = teclado.nextLine();
                    System.out.println("Ingrese el documento de la persona:");
                    String documentoA = teclado.nextLine();

                    boolean encontrado = false;

                    for (Usuario u : usuarios) {
                        if (u.getDocumento().equals(documentoA)) {
                            for (Libro libro : u.getLibros()) {
                                if (libro.getNombre().equals(libroD)) {
                                    u.devolverLibro(libro);
                                    libros.add(libro); // regresa a la lista de disponibles
                                    System.out.println("Libro devuelto correctamente.");
                                    encontrado = true;
                                    break;
                                }
                            }
                            if (!encontrado) {
                                System.out.println("El usuario no tiene ese libro alquilado.");
                            }
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Usuario no encontrado o libro no alquilado.");
                    }
                }

                case 5 ->{
                    System.out.println("********Libros Disponibles************");
                    for(Libro l:libros){
                        System.out.println(l);
                    }

                    System.out.println("**************Usuarios*************");
                    for(Usuario u:usuarios){
                        System.out.println(u);
                    }
                }

                case 6  -> estado=false;


                default -> System.out.println("Elija una opcion valida");

            }
        }while(estado);
    }
}