import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner teclado =new Scanner(System.in);
        int mouse= 850000;
        int tecl=230000;
        int monitor=940000;
        int disc=220000;
        int usb=60000;
        int opc;
        int repetir;
        boolean estado=true;
        int totalcompra=0;
        int totalbase=0;
        int totalmouse=0;
        int totalteclado=0;
        int totalmonitor=0;
        int totaldiscos=0;
        int totalusb=0;
        int imp;
        int contM=0,contT=0,contMo=0,contD=0,contU=0;
        String  nom,tel;
        System.out.println("Bienvenidos a la tienda de tecnologia");
        System.out.println("escriba su nombre");
        nom= teclado.nextLine();
        System.out.println("escriba su telefono");
        tel= teclado.nextLine();
        do {


            System.out.println("Qué desea comprar , elija sus productos : \n1.Mouse \n2.Teclado \n3.Monitor \n4.Disco Duro \n5.Usb");
            opc = teclado.nextInt();

            switch (opc) {
                case 1:
                    totalbase+=mouse;
                    totalmouse+=mouse;
                    contM++;
                    break;
                case 2:
                    totalbase+=tecl;
                    totalteclado+=tecl;
                    contT++;
                    break;
                case 3:
                    totalbase+=monitor;
                    totalmonitor+=monitor;
                    contMo++;
                    break;
                case 4:
                    totalbase+=disc;
                    totaldiscos+=disc;
                    contD++;
                    break;

                case 5:
                    totalbase+=usb;
                    totalusb+=usb;
                    contU++;
                    break;

                default:
                    System.out.println("Elija una opción valida");
                    continue;
            }

            System.out.println("1.¿ deseas seguir comprando? 1. Si  2. No ");
            repetir = teclado.nextInt();

            if (repetir == 1) {
                continue;
            } else {
                estado=false;
                System.out.println("--------------Factura electronica-----------------");
                System.out.println("\tnombre cliente" + nom + "\ttelefono" + tel);
                System.out.println("Producto \tCantidad\tvalor unitario\tvalor total");
                System.out.println("Mouse\t\t " + contM + "\t\t\t" + mouse + "\t\t\t" + totalmouse);
                System.out.println("Monitor\t\t " + contMo + "\t\t\t" + monitor + "\t\t\t" + totalmonitor);
                System.out.println("Teclado\t\t " + contT + "\t\t\t" + tecl + "\t\t\t" + totalteclado);
                System.out.println("Disco duro\t " + contD + "\t\t\t" + disc + "\t\t\t" + totaldiscos);
                System.out.println("usb\t\t\t q" + contU + "\t\t\t" + usb + "\t\t\t" + totalusb);
                        //System.out.println("el total de sus productos fueron"+cont);
                System.out.println("el valor base de su compra es "+totalbase);
                imp=totalbase*16/100;
                System.out.println("el impuesto de la compra es "+imp);
                totalcompra=totalbase+imp;
                System.out.println("el total de su compra "+totalcompra);

            }
        }while(estado);
    }
}


