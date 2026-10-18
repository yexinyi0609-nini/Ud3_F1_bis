import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Introducir un número: ");
          int numero1 = input.nextInt();
        System.out.println("Introducir un número: ");
          int numero2 = input.nextInt();
//FÓrmula de cálculo
          int suma = numero1 + numero2 ;
          int resta = numero1 - numero2;
          int producto = numero1 * numero2;

          System.out.println("Resultados:" );
          System.out.println("Suma:" + suma );
          System.out.println("Resta:" + resta);
          System.out.println("Producto:" + producto);
          
        input.close();

    }
  
}
