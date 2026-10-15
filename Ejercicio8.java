import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.println("Introducir el nombre del alumno:"); 
        double nombre = input.nextInt();

        System.out.println("Introducir nota de 1evaluación:");
        double nota1Evaluación = input.nextInt();

        System.out.println("Introducir nota de 2evaluación");
        double nota2Evaluación = input.nextInt();

        System.out.println("Introducir notas de 3evaluación");
        double nota3Evaluación = input.nextInt();

    }

    
}
