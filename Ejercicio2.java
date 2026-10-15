import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        //Scanner que lee la entrada del usuario    
        System.out.println("Introduca su número de lado: ");
//Introducir el valor de lado
        int lado = input.nextInt();

        //Calcula el área del cuadrado, lado * lado
        int ladoPorLado = lado * lado;
        
        System.out.println("El área del cuadrado es:" + ladoPorLado );

        input.close();

    }
}

