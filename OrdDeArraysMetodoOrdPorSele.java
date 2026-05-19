package orddearrays.metodoordporsele;

import java.util.Scanner;
import java.util.Random;

public class OrdDeArraysMetodoOrdPorSele {
    public static void seleccion(int[] array) {

        int n = array.length;

        for (int num = 0; num < n - 1; num++) {

            int menor = num;

            for (int j = num + 1; j < n; j++) {

                if (array[j] < array[menor]) {
                    menor = j;
                }
            }

            int auxiliar = array[num];
            array[num] = array[menor];
            array[menor] = auxiliar;
        }
    }


    public static int[] generarArray9(int desde9, int hasta9, int tamanio9) {

        Random random9 = new Random();

        int[] array9 = new int[tamanio9];

        for (int num = 0; num < tamanio9; num++) {

            int numeroAleatorio9;
            boolean repetido9;

            do {

                repetido9 = false;

                numeroAleatorio9 =
                random9.nextInt(hasta9 - desde9 + 1) + desde9;

                for (int j = 0; j < num; j++) {

                    if (array9[j] == numeroAleatorio9) {
                        repetido9 = true;
                    }
                }

            } while (repetido9);

            array9[num] = numeroAleatorio9;
        }

        seleccion(array9);

        return array9;
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        //Ejercicio 1
        System.out.println("=== Ejercicio 1 ===");

        int[] arr1 = new int[10];

        int sumaPos1 = 0;
        int sumaNeg1 = 0;
        int contPos1 = 0;
        int contNeg1 = 0;

        for (int num = 0; num < 10; num++) {

            System.out.print("Ingrese numero: ");
            arr1[num] = teclado.nextInt();

            if (arr1[num] > 0) {

                sumaPos1 += arr1[num];
                contPos1++;
            }

            else if (arr1[num] < 0) {

                sumaNeg1 += arr1[num];
                contNeg1++;
            }
        }

        seleccion(arr1);

        for (int valor : arr1) {
            System.out.print(valor + " ");
        }

        System.out.println();

        System.out.println("Media positivos: " +
        (contPos1 > 0 ? (double) sumaPos1 / contPos1 : 0));

        System.out.println("Media negativos: " +
        (contNeg1 > 0 ? (double) sumaNeg1 / contNeg1 : 0));
        
        //Ejercicio 2
        System.out.println("=== Ejercicio 2 ===");

        int[] arr2 = new int[10];

        int suma2 = 0;
        int cont2 = 0;

        for (int num = 0; num < 10; num++) {

            System.out.print("Ingrese numero: ");
            arr2[num] = teclado.nextInt();
        }

        seleccion(arr2);

        for (int num = 0; num < 10; num += 2) {

            suma2 += arr2[num];
            cont2++;
        }

        System.out.println("Media posiciones pares: " +
        (double) suma2 / cont2);
        
        //Ejercicio 3
        System.out.println("=== Ejercicio 3 ===");

        System.out.print("Ingrese cantidad de alumnos: ");
        int cantAlumnos3 = teclado.nextInt();

        double[] notas3 = new double[cantAlumnos3];

        double sumaNotas3 = 0;

        for (int num = 0; num < cantAlumnos3; num++) {

            System.out.print("Nota alumno " + (num + 1) + ": ");
            notas3[num] = teclado.nextDouble();

            sumaNotas3 += notas3[num];
        }

        double media3 = sumaNotas3 / cantAlumnos3;

        System.out.println("Media: " + media3);

        for (int num = 0; num < cantAlumnos3; num++) {

            if (notas3[num] > media3) {

                System.out.println("Alumno " +
                (num + 1) + ": " + notas3[num]);
            }
        }
        
        //Ejercicio 4
        System.out.println("=== Ejercicio 4 ===");

        int[] pares4 = new int[20];

        for (int num = 0; num < 20; num++) {

            pares4[num] = num * 2;
        }

        seleccion(pares4);

        for (int valor : pares4) {
            System.out.print(valor + " ");
        }

        System.out.println();
        
        //Ejercicio 5
        System.out.println("=== Ejercicio 5 ===");

        int[] arr5 = new int[10];

        int positivos5 = 0;
        int negativos5 = 0;
        int ceros5 = 0;

        for (int num = 0; num < 10; num++) {

            System.out.print("Ingrese numero: ");
            arr5[num] = teclado.nextInt();

            if (arr5[num] > 0) {
                positivos5++;
            }

            else if (arr5[num] < 0) {
                negativos5++;
            }

            else {
                ceros5++;
            }
        }

        seleccion(arr5);

        System.out.println("Positivos: " + positivos5);
        System.out.println("Negativos: " + negativos5);
        System.out.println("Ceros: " + ceros5);
        
        //Ejercicio 6 y 7
        System.out.println("=== Ejercicio 6 y 7===");

        int[] arr6 = new int[10];

        int sumaPos6 = 0;
        int sumaNeg6 = 0;
        int contPos6 = 0;
        int contNeg6 = 0;

        for (int num = 0; num < 10; num++) {

            System.out.print("Ingrese numero: ");
            arr6[num] = teclado.nextInt();

            if (arr6[num] > 0) {

                sumaPos6 += arr6[num];
                contPos6++;
            }

            else if (arr6[num] < 0) {

                sumaNeg6 += arr6[num];
                contNeg6++;
            }
        }

        seleccion(arr6);

        System.out.println("Media positivos: " +
        (contPos6 > 0 ? (double) sumaPos6 / contPos6 : 0));

        System.out.println("Media negativos: " +
        (contNeg6 > 0 ? (double) sumaNeg6 / contNeg6 : 0));
        
        //Ejercicio 8
        System.out.println("=== Ejercicio 8 ===");

        String[] nombres8 = new String[20];
        double[] sueldos8 = new double[20];

        teclado.nextLine();

        for (int num = 0; num < 20; num++) {

            System.out.print("Ingrese nombre: ");
            nombres8[num] = teclado.nextLine();

            System.out.print("Ingrese sueldo: ");
            sueldos8[num] = teclado.nextDouble();

            teclado.nextLine();
        }

        double mayorSueldo8 = sueldos8[0];
        String nombreMayor8 = nombres8[0];

        for (int num = 1; num < 20; num++) {

            if (sueldos8[num] > mayorSueldo8) {

                mayorSueldo8 = sueldos8[num];
                nombreMayor8 = nombres8[num];
            }
        }

        System.out.println("Empleado que mas gana: " + nombreMayor8);
        System.out.println("Sueldo mayor: " + mayorSueldo8);
        
        //Ejercicio 9
        System.out.println("=== Ejercicio 9 ===");

        System.out.print("Ingrese desde: ");
        int desde9 = teclado.nextInt();

        System.out.print("Ingrese hasta: ");
        int hasta9 = teclado.nextInt();

        System.out.print("Ingrese tamanio del array: ");
        int tamanio9 = teclado.nextInt();

        int[] array9 = generarArray9(desde9, hasta9, tamanio9);

        System.out.println("Numeros aleatorios ordenados:");

        for (int valor : array9) {
            System.out.print(valor + " ");
        }

        teclado.close();
    }
    
}
