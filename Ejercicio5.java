import java.util.Scanner;
 
public class Ejercicio5 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        //Pedir número de distancia de millas marinas
        System.out.println("Introducir número de millas marinas");

        int millas = input.nextInt();

        double metro = millas * 1.852;
        //Resultado de sitancia en metro
        System.out.println("La distancia en metro es:" + metro);

        input.close();
    }
    
}
