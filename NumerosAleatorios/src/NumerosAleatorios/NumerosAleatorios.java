package NumerosAleatorios;
import java.util.Random;

public class NumerosAleatorios {

    public static void main(String[] args) {
        mostrarNumerosAleatorios();
    }

    public static void mostrarNumerosAleatorios() {
        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            int numeroAleatorio = random.nextInt(10) + 1; // Genera un número entre 1 y 10
            System.out.println("Número aleatorio " + (i + 1) + ": " + numeroAleatorio);
        }
    }
}
