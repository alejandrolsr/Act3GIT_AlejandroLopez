package IncrementoNumeros;

import java.util.Scanner;

public class IncrementoNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variables para los números introducidos
        int num1, num2;

        // Solicitar los números y validarlos como distintos
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

        // Determinar el menor y el mayor de los números
        int menor = Math.min(num1, num2);
        int mayor = Math.max(num1, num2);

        // Mostrar los números incrementando de 7 en 7
        System.out.println("Números comprendidos entre " + menor + " y " + mayor + ", incrementando de 7 en 7:");
        for (int i = menor; i <= mayor; i += 7) {
            System.out.println(i);
        }

        scanner.close();
    }
}
