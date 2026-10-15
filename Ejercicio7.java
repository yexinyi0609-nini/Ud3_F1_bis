import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        //Pedir peso y altura del usuario, para después calcular el BMI
        //Introducir tu peso
        System.out.println("Introducir tu peso:");
        double peso = input.nextDouble();

        //Introducir tu altura, usando coma
        System.out.println("Introducir tu altura en metro:");
        double altura = input.nextDouble();

        double BMI = peso/(altura * altura);

        System.out.printf("Tu BMI correspondiente es: %.2f%n" , BMI);

        input.close();
    }
    
}
