package calculadora;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        boolean continuar = true;

        System.out.println("=== CALCULADORA ===");

        while (continuar) {
            
            System.out.println("Que operacion queres hacer?");
            System.out.println("1 = Sumar");
            System.out.println("2 = Restar");
            System.out.println("3 = Multiplicar");
            System.out.println("4 = Dividir");
            System.out.println("5 = Salir de la calculadora");
            System.out.print("Elegi una opcion (1-5): ");
            int opcion = teclado.nextInt();

            if (opcion == 5) {
                continuar = false;
                System.out.println("Gracias por usar la calculadora.");
                break;
            }

            if (opcion < 1 || opcion > 5) {
                System.out.println("Opción incorrecta. Intentá de nuevo.");
                continue;
            }

            System.out.print("Ingresa el primer numero: ");
            double num1 = teclado.nextDouble();

            System.out.print("Ingresa el segundo numero: ");
            double num2 = teclado.nextDouble();

            if (opcion == 1) {
                double suma = num1 + num2;
                System.out.println("El resultado es: " + suma);
            } 
            else if (opcion == 2) {
                double resta = num1 - num2;
                System.out.println("El resultado es: " + resta);
            } 
            else if (opcion == 3) {
                double multiplicacion = num1 * num2;
                System.out.println("El resultado es: " + multiplicacion);
            } 
            else if (opcion == 4) {
                if (num2 == 0) {
                    System.out.println("Error: No se puede dividir por cero.");
                } else {
                    double division = num1 / num2;
                    System.out.println("El resultado es: " + division);
                }
            }
            System.out.println("-----------------------------------");
        }
        teclado.close();
    }
}
