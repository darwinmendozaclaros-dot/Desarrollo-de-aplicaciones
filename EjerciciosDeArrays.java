package ejerciciosdearrays;
import java.util.Random;
import java.util.Scanner;
public class EjerciciosDeArrays {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //Ejercicio 1
        System.out.println("=== Ejercicio 1 ===");
        int[] vector = new int[10];
        int sumaPositivos = 0, sumaNegativos = 0;
        int contPositivos = 0, contNegativos = 0;
        for (int num1 = 0; num1 < 10; num1++) {
            System.out.print("ingrese un numero: ");
            vector[num1] = teclado.nextInt();
            if (vector[num1] > 0) {
                sumaPositivos += vector[num1];
                contPositivos++;
            } else if (vector[num1] < 0) {
                sumaNegativos += vector[num1];
                contNegativos++;
            }
        }
        if (contPositivos > 0) {
            double mediaPositivos = (double) sumaPositivos / contPositivos;
            System.out.println("la media de positivos: " + mediaPositivos);
        } else {
            System.out.println("no hay numeros positivos");
        }

        if (contNegativos > 0) {
            double mediaNegativos = (double) sumaNegativos / contNegativos;
            System.out.println("media de negativos: " + mediaNegativos);
        } else {
            System.out.println("no hay numeros negativos");
        }
        //Ejercicio 2
        System.out.println("=== Ejercicio 2 ===");
        int[] vector2 = new int[10];

        int suma = 0;
        int contador = 0;
        for (int num2 = 0; num2 < 10; num2++) {
            System.out.print("Ingrese un numero: ");
            vector2[num2] = teclado.nextInt();
        }
        for (int num2 = 0; num2 < 10; num2++) {
            if (num2 % 2 == 0) {
                suma += vector2[num2];
                contador++;
            }
        }
        double media = (double) suma / contador;
        System.out.println("Media de posiciones pares: " + media);
        
        //Ejercicio 3
        System.out.println("=== Ejercicio 3 ===");
        int ejer3 = 0;
        System.out.print("Pon cuantos alumnos hay: ");
        ejer3 = teclado.nextInt();
        double[] vector3 = new double[ejer3];
        double ejer31 = 0;
        double ejer32;
        for (int num1 = 0; num1 < ejer3; num1++) {
            System.out.print("Ingrese la nota del alumno " + (num1 + 1) + ": ");
            vector3[num1] = teclado.nextDouble();
        }
        for (int num1 = 0; num1 < ejer3; num1++) {
            ejer31 += vector[num1];
        }
        ejer32 = ejer31 / ejer3;
        System.out.println("Nota media: " + ejer32);
         System.out.println("Alumnos con nota superior a la media:");
        for (int num1 = 0; num1 < ejer3; num1++) {
            if (vector3[num1] > ejer32) {
                System.out.println("Alumno " + (num1 + 1) + " con nota: " + vector3[num1]);
            }
        }
        //Ejercicio 4
        System.out.println("=== Ejercicio 4 ===");
        int[] Pares = new int[20];

        for (int num1 = 0; num1 < 20; num1++) {
            Pares[num1] = num1 * 2;
        }
        System.out.println("Array de numeros pares:");
        for (int num1 = 0; num1 < 20; num1++) {
            System.out.println(Pares[num1]);
        }
        //Ejercicio 5
        System.out.println("=== Ejercicio 5 ===");
        int[] vector5 = new int[10];
        int positivos = 0, negativos = 0, ceros = 0;
        for (int num1 = 0; num1 < 10; num1++) {
            System.out.print("Ingrese un numero: ");
            vector5[num1] = teclado.nextInt();
            if (vector5[num1] > 0) {
                positivos++;
            } else if (vector[num1] < 0) {
                negativos++;
            } else {
                ceros++;
            }
        }
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Ceros: " + ceros);
        
        //Ejercicio 6 y 7
        System.out.println("=== Ejercicio 6 y 7 ===");
        int sumaPos = 0, sumaNeg = 0;
        int contPos = 0, contNeg = 0;

        for (int num1 = 0; num1 < 10; num1++) {
            if (vector[num1] > 0) {
                sumaPos += vector[num1];
                contPos++;
            } else if (vector[num1] < 0) {
                sumaNeg += vector[num1];
                contNeg++;
            }
        }

        if (contPos > 0) {
            double mediaPos = (double) sumaPos / contPos;
            System.out.println("Media positivos: " + mediaPos);
        } else {
            System.out.println("No hay positivos");
        }

        if (contNeg > 0) {
            double mediaNeg = (double) sumaNeg / contNeg;
            System.out.println("Media negativos: " + mediaNeg);
        } else {
            System.out.println("No hay negativos");
        }
        
        //Ejercicio 8
        System.out.println("=== Ejercicio 8 ===");
        String[] nombres = new String[20];
        double[] sueldos = new double[20];
        double mayorSueldo = 0;
        String nombreMayor = null;
        for (int num1 = 0; num1 < 20; num1++) {
            System.out.print("Ingrese el nombre del empleado: ");
            nombres[num1] = teclado.next();
            System.out.print("Ingrese el sueldo: ");
            sueldos[num1] = teclado.nextDouble();
            if (num1 == 0) {
                mayorSueldo = sueldos[num1];
                nombreMayor = nombres[num1];
            } else {
                if (sueldos[num1] > mayorSueldo) {
                    mayorSueldo = sueldos[num1];
                    nombreMayor = nombres[num1];
                }
            }
        }
        System.out.println("Empleado con mayor sueldo:");
        System.out.println("Nombre: " + nombreMayor);
        System.out.println("Sueldo: " + mayorSueldo);
        
        //Ejercicio 9
        System.out.println("=== Ejercicio 9 ===");
        int desde = 1;
        int hasta = 20;
        int tamanio = 10;

        int[] vector9 = llenarArray(desde, hasta, tamanio);

        System.out.println("Contenido del array:");
        for (int num1 = 0; num1 < vector9.length; num1++) {
            System.out.println(vector9[num1]);
        }
    }
    public static int[] llenarArray(int desde, int hasta, int tamanio) {
        Random random = new Random();
        int[] vector9 = new int[tamanio];

        for (int num1 = 0; num1 < tamanio; num1++) {

            int numero;

            do {
                numero = random.nextInt(hasta - desde + 1) + desde;
            } while (comprobarSiContiene(vector9, num1, numero));
            vector9[num1] = numero;
        }

        return vector9;
    }
    public static boolean comprobarSiContiene(int[] vector9, int posicion, int numero) {
        for (int num1 = 0; num1 < posicion; num1++) {
            if (vector9[num1] == numero) {
                return true;
            }
        }
        return false;
    }
}
