import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Scanner que lee la entrada del usuario

        System.out.println("Introduca su número de años: ");

        int años = input.nextInt();

        //Calcular 365 * 24 = 8760 horas
        int horasPorAño = 365 * 24;
        int totalHoras = años * horasPorAño;

        System.out.println("Hay:" + totalHoras + "horas");

        input.close();

    }
}