import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("auto 1");
        chevrolet();
        System.out.println("\nauto 2");
        Kia();
    }
    public static void  chevrolet(){
        Autos chevroletX = new Autos();
        chevroletX.setColor("rojo");
        chevroletX.setKilometraje(1200);
        chevroletX.setModelo("2012");
        chevroletX.setMarca("chevrolet");
        chevroletX.setPlaca("FGH523");

        System.out.println("marca :"+chevroletX.getMarca());
        System.out.println("color : "+chevroletX.getColor());
        System.out.println("Kilometraje :"+chevroletX.getKilometraje());
        System.out.println("modelo :"+chevroletX.getModelo());
        System.out.println("placa :"+chevroletX.getPlaca());
    }

    public static void  Kia(){
        Autos kiaX = new Autos();
        kiaX.setColor("Blanco");
        kiaX.setKilometraje(1350.5);
        kiaX.setModelo("2013");
        kiaX.setMarca("Renault");
        kiaX.setMarca("GDF784");

        System.out.println("marca :"+kiaX.getMarca());
        System.out.println("color : "+kiaX.getColor());
        System.out.println("Kilometraje :"+kiaX.getKilometraje());
        System.out.println("modelo :"+kiaX.getModelo());
        System.out.println("placa :"+kiaX.getPlaca());
    }
}


