import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.println("Introducir el nombre del alumno:"); 
        String nombre = input.nextLine();

        System.out.println("Introducir nota de 1Evaluación:");
        double nota1Evaluación = input.nextDouble();

        System.out.println("Introducir nota de 2Evaluación");
        double nota2Evaluación = input.nextDouble();

        System.out.println("Introducir notas de 3Evaluación");
        double nota3Evaluación = input.nextDouble();

        System.out.println("Alumno:" + nombre);
        double notaTotal = (nota1Evaluación + nota2Evaluación + nota3Evaluación)/3.0;

        System.out.printf("Su nota media correspondiente es: %.2f%n" , notaTotal);

        input.close();

    }

    
}
