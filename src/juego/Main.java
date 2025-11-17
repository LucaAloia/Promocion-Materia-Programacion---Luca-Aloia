package juego;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 2) {
            System.out.println("===== MENÚ PRINCIPAL =====");
            System.out.println("1. Jugar");
            System.out.println("2. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:

                    System.out.print("Ingrese la cantidad de intentos: ");
                    int intentos = scanner.nextInt();

                    while (intentos <= 0) {
                        System.out.println("Los intentos deben ser mayores que cero.");
                        System.out.print("Ingrese la cantidad de intentos: ");
                        intentos = scanner.nextInt();
                    }

                    System.out.print("Ingrese el valor mínimo del rango: ");
                    int minimo = scanner.nextInt();

                    System.out.print("Ingrese el valor máximo del rango: ");
                    int maximo = scanner.nextInt();

                    while (maximo <= minimo) {
                        System.out.println("El máximo debe ser mayor que el mínimo.");
                        System.out.print("Ingrese el valor mínimo del rango: ");
                        minimo = scanner.nextInt();
                        System.out.print("Ingrese el valor máximo del rango: ");
                        maximo = scanner.nextInt();
                    }

                    JuegoAdivinar juego = new JuegoAdivinar(intentos, minimo, maximo);
                    juego.iniciarJuego();
                    break;

                case 2:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        }

        scanner.close();
    }
}
