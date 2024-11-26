package IncrementoNumeros;
import java.util.Scanner;

public class IncrementoNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variables para los números que introduce el usuario
        int num1, num2, num3;

        // Solicitar los números y validarlos
        System.out.println("Introduce dos números distintos:");
        System.out.print("Número 1: ");
        num1 = scanner.nextInt();

        System.out.print("Número 2: ");
        num2 = scanner.nextInt();

        while (num1 == num2) {
            System.out.println("Los números deben ser distintos. Inténtalo de nuevo:");
            System.out.print("Número 1: ");
            num1 = scanner.nextInt();
            System.out.print("Número 2: ");
            num2 = scanner.nextInt();
        }

        // Solicitar el tercer número
        System.out.print("Introduce un tercer número: ");
        num3 = scanner.nextInt();

        // Determinar el menor y el mayor de los números
        int menor = Math.min(num1, num2);
        int mayor = Math.max(num1, num2);

        // Mostrar los números incrementando de 7 en 7
        System.out.println("Números comprendidos entre " + menor + " y " + mayor + ", incrementando de 7 en 7:");
        for (int i = menor; i <= mayor; i += 7) {
            System.out.println(i);

            // Comprobar si el tercer número coincide con algún valor del rango
            if (i < mayor && num3 > i && num3 <= i + 7 && num3 >= menor) {
                System.out.println(num3); // Mostrar el tercer número si está en el rango
            }
        }

        scanner.close();
    }
}
