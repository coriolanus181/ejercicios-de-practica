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
        Candidato candidado1 = new Candidato("Gustavo Petro");
        Candidato candidado2 = new Candidato("Alvaro Uribe");
        Candidato candidato3 = new Candidato("Joan Chindoy");
        int opc,voto,medio;
        double contador1 = 0,contador2=0,contador3=0,contadorT=0;

        int repetir;
        do {
            System.out.println("Bienvenidos a las elecciones Premier");
            System.out.println("menu");
            System.out.println("1. Votar por el candidato de su elección ");
            System.out.println("2. calcular costo de la campaña");
            System.out.println("3. vaciar todas las urnas de votación");
            System.out.println("4. conocer el número total de votos");
            System.out.println("5. Porcentaje de votos obtenidos por cada candidado");
            System.out.println("6. Costo promedio  de  campaña de las elecciones");
            System.out.println("7. salir");
            opc = teclado.nextInt();
            switch (opc) {
                case 1 -> {
                    System.out.println("Por qué candidato va votar");
                    System.out.println("1. Petro 2.Uribe 3.Chindoy");
                    voto = teclado.nextInt();
                    if (voto == 1) {
                        // System.out.println("Votaste por Petro");

                        System.out.println("¿cuál fue el medio que lo influencio? 1.internet 2. radio 3.televisión");
                        medio = teclado.nextInt();
                        candidado1.influencia(medio);
                        candidado1.valorPublicidad(medio);
                        System.out.println("su eleccion fue :");
                        System.out.println(candidado1);
                        /*System.out.println("volver al menu");
                        repetir= teclado.nextInt();
                        if (repetir==1){
                            continue;
                        }else {
                            estado= false;
                        }*/
                        contador1++;
                        contadorT++;

                    } else if (voto == 2) {
                        System.out.println("¿cuál fue el medio que lo influencio? 1.internet 2. radio 3.televisión");
                        medio = teclado.nextInt();
                        candidado2.influencia(medio);
                        candidado2.valorPublicidad(medio);
                        System.out.println("su eleccion fue :");
                        System.out.println(candidado2);
                        contador2++;
                        contadorT++;
                    } else if (voto == 3) {
                        System.out.println("¿cuál fue el medio que lo influencio? 1.internet 2. radio 3.televisión");
                        medio = teclado.nextInt();
                        candidato3.influencia(medio);
                        candidato3.valorPublicidad(medio);
                        System.out.println("su eleccion fue :");
                        System.out.println(candidato3);
                        contador3++;
                        contadorT++;
                    }
                }
                case 2 -> {
                    System.out.println("el costo de la campaña fue de");

                    candidado1.mostrarValorCampana();
                    candidado2.mostrarValorCampana();
                    candidato3.mostrarValorCampana();
                }
                case 3 ->{
                    contador1 =0;
                    contador2 =0;
                    contador3 =0;
                    contadorT =0;
                    candidado1.getVaciarUrna();
                    candidado2.getVaciarUrna();
                    candidato3.getVaciarUrna();
                }
                case 4 ->{
                    System.out.println("el numero de votos fue");
                    System.out.println("candidato 1 :"+contador1);
                    System.out.println("candidato 2 :"+contador2);
                    System.out.println("candidato 3 :"+contador3);
                    System.out.println("Total votos :"+contadorT);
                }

                case 5 ->{

                    System.out.println("candidato 1 :"+((contador1/contadorT)*100)+"%"+"\ncandidato 2 :"+((contador2/contadorT)*100)+"%"+"\ncandidato 3 :"+((contador3/contadorT)*100)+"%");
                }
                case 6 -> {

                    candidado1.mostrarPromedio();
                    candidado2.mostrarPromedio();
                    candidato3.mostrarPromedio();
                }

                case 7  -> estado = false;

                default -> System.out.println("Elija una opción valida");


            }
            ;
        }while(estado);
    }
}