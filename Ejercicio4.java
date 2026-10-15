import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.println("Introduca su número de radio: ");
//Introducir cualquier número
        int radio = input.nextInt();
//Fórmula de cálculo
        double longitud = 2 * Math.PI * radio;
        double área = radio * radio * Math.PI;
        double volumen = radio * radio * radio * (4.0/3.0) * Math.PI ;

        System.out.println("El longitud de  la circunferencia es:" + longitud );
        System.out.println("La área del círculo es:" + área);
        System.out.println("El volumen de la esfera es:" + volumen);

        input.close();

    }
    
}
