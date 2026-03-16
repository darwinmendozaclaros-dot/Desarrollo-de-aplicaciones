package elseif;
import java.util.Scanner;

public class ElseIf {

    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
        // Ejercicio 1
        System.out.println("==== Ejercicio 1 ====");
        
        System.out.print("Pon el primer numero: ");
        int num1 = teclado.nextInt();
        System.out.print("Pon ahora el segundo numero: ");
        int num2 = teclado.nextInt();
        if (num1 == num2){
        System.out.println("Los dos numeros son iguales");
                } else {
            System.out.println("Los dos numeros no son iguales");
        }

        // Ejercicio 2
        System.out.println("==== Ejercicio 2 ====");
        System.out.print("Ingresa el primer numero: ");
        int num3 = teclado.nextInt();
        System.out.print("Ingresa el segundo numero: ");
        int num4 = teclado.nextInt();
        if (num3 > num4) {
            System.out.println("El numero mayor es: " + num3);
        } else if (num4 > num3) {
            System.out.println("El numero mayor es: " + num4);
        } else {
            System.out.println("Los dos numeros son iguales.");
        }
        // Ejercicio 3
        System.out.println("==== Ejercicio 3 ====");
        System.out.print("Ingresa un numero: ");
        int num5 = teclado.nextInt();
        System.out.print("Ingresa Otro numero: ");
        int num6 = teclado.nextInt();
        int ultima1 = num5 % 10;
        int ultima2 = num6 % 10;
        if (ultima1 == ultima2) {
            System.out.println("Los dos numeros terminan con la misma cifra");
        } else {
            System.out.println("Los dos numeros no terminan con la misma cifra");
        }
        // Ejercicio 4
        System.out.println("==== Ejercicio 4 ====");
        System.out.print("Pon un numero: ");
        int num7 = teclado.nextInt();
        if (num7 % 3 == 0 && num7 % 5 == 0) {
            System.out.println("El numero es multiplo de 3 y de 5");
        } else {
            System.out.println("El numero no es multiplo de 3 y de 5");
        }
        // Ejercicio 5
        System.out.println("==== Ejercicio 5 ====");
        System.out.println("Pon un anio: ");
        int anio = teclado.nextInt();
        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 ==0)){
            System.out.println("El anio es bisiesto");
        } else {
            System.out.println("El anio no es bisiesto");
        }
        // Ejercicio 6
        System.out.println("==== Ejercicio 6 ====");
        System.out.print("Ingresa el 1er numero: ");
        int num8 = teclado.nextInt();
        System.out.print("Ingresa el 2do numero: ");
        int num9 = teclado.nextInt();
        System.out.println("Pon el 3er numero: ");
        int num10 = teclado.nextInt();
        int mayor = num8;
        if (num9 > mayor){
            mayor = num9;
        }
        if (num10 > mayor) {
            mayor = num10;
        }
        
        System.out.println("El numero mayor es: " + mayor);
        
        // Ejercicio 7
        System.out.println("=== Ejercicio 7 ===");
        System.out.print("Escribe una nota entre el 0 y 10: ");
        double nota = teclado.nextDouble();
        
        if (nota < 0) {
            System.out.println("Pon una nota de 0 a 10¡");
        } if (nota > 10) {
            System.out.println("Pon una nota de 0 a 10!");
        } else if (nota < 5) {
            System.out.println("Insuficiente, reprobado");
        } else if (nota < 6) {
            System.out.println("Suficiente, Aprobado");
        } else if (nota < 7) {
            System.out.println("Bien, aprobado");
        } else if (nota < 9) {
            System.out.println("Notable, aprobado");
        } else {
            System.out.println("Sobresaliente, super aprobado");
        }
        
    }
    
}
