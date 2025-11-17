package juego;

import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinar {

    private int numeroSecreto;
    private int intentosMaximos;
    private int minimo;
    private int maximo;

    public JuegoAdivinar(int intentosMaximos, int minimo, int maximo) {
        this.intentosMaximos = intentosMaximos;
        this.minimo = minimo;
        this.maximo = maximo;
    }

    public void iniciarJuego() {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        numeroSecreto = random.nextInt(maximo - minimo + 1) + minimo;

        System.out.println("=== JUEGO: ADIVINA EL NÚMERO ===");
        System.out.println("El número está entre " + minimo + " y " + maximo + ".");
        System.out.println("Tienes " + intentosMaximos + " intentos.");
        System.out.println("--------------------------------");

        boolean adivino = false;

        for (int i = 1; i <= intentosMaximos; i++) {

            System.out.print("Intento " + i + ": Ingresa un número: ");
            int intento = scanner.nextInt();

            if (intento < minimo || intento > maximo) {
                System.out.println("El número debe estar dentro del rango.");
                i--;
                continue;
            }

            if (intento == numeroSecreto) {
                System.out.println("¡Correcto! Adivinaste el número.");
                adivino = true;
                break;
            } else if (intento > numeroSecreto) {
                System.out.println("El número secreto es más bajo.");
            } else {
                System.out.println("El número secreto es más alto.");
            }
        }

        if (adivino) {
            System.out.println("¡Felicidades, ganaste!");
        } else {
            System.out.println("Perdiste. El número era: " + numeroSecreto);
        }

        System.out.println("--------------------------------");
    }
}
