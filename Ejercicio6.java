import java.util.Scanner;

    public class Ejercicio6 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            //Pedir número de grado Celsius
            System.out.println("Introducir la temperatura en  grado Celsius");
            //Introducir cualquier número
            double celsius = input.nextInt();
            //Calcular el grado fahrenheit
            double fahrenheit = (celsius * 1.8)+ 32; 

            System.out.println("La temperetura en grado fahrenheit:" + fahrenheit);

            input.close();

        }
    
}
