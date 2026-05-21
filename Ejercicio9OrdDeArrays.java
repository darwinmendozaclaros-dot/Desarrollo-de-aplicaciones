package ejercicio9orddearrays;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Ejercicio9OrdDeArrays {
    public static void burbuja(int[] array) {

        for (int num = 0; num < array.length - 1; num++) {

            for (int j = 0; j < array.length - 1 - num; j++) {

                if (array[j] > array[j + 1]) {

                    int auxiliar = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = auxiliar;
                }
            }
        }
    }

    public static void seleccion(int[] array) {

        for (int num = 0; num < array.length - 1; num++) {

            int menor = num;

            for (int j = num + 1; j < array.length; j++) {

                if (array[j] < array[menor]) {
                    menor = j;
                }
            }

            int auxiliar = array[num];
            array[num] = array[menor];
            array[menor] = auxiliar;
        }
    }

    public static void insercion(int[] array) {

        for (int num = 1; num < array.length; num++) {

            int auxiliar = array[num];
            int j = num - 1;

            while (j >= 0 && array[j] > auxiliar) {

                array[j + 1] = array[j];
                j--;
            }

            array[j + 1] = auxiliar;
        }
    }

    public static void quickSort(int[] array,
    int inicio,
    int fin) {

        int i = inicio;
        int j = fin;

        int pivote = array[(inicio + fin) / 2];

        while (i <= j) {

            while (array[i] < pivote) {
                i++;
            }

            while (array[j] > pivote) {
                j--;
            }

            if (i <= j) {

                int auxiliar = array[i];
                array[i] = array[j];
                array[j] = auxiliar;

                i++;
                j--;
            }
        }

        if (inicio < j) {
            quickSort(array, inicio, j);
        }

        if (i < fin) {
            quickSort(array, i, fin);
        }
    }

    public static void shell(int[] array) {

        int salto = array.length / 2;

        while (salto > 0) {

            for (int num = salto;
            num < array.length;
            num++) {

                int auxiliar = array[num];
                int j = num;

                while (j >= salto &&
                array[j - salto] > auxiliar) {

                    array[j] = array[j - salto];
                    j = j - salto;
                }

                array[j] = auxiliar;
            }

            salto = salto / 2;
        }
    }

    public static void mergeSort(int[] array,
    int izquierda,
    int derecha) {

        if (izquierda < derecha) {

            int medio =
            (izquierda + derecha) / 2;

            mergeSort(array,
            izquierda,
            medio);

            mergeSort(array,
            medio + 1,
            derecha);

            merge(array,
            izquierda,
            medio,
            derecha);
        }
    }

    public static void merge(int[] array,
    int izquierda,
    int medio,
    int derecha) {

        int tamanio1 =
        medio - izquierda + 1;

        int tamanio2 =
        derecha - medio;

        int[] izquierdaArray =
        new int[tamanio1];

        int[] derechaArray =
        new int[tamanio2];

        for (int num = 0;
        num < tamanio1;
        num++) {

            izquierdaArray[num] =
            array[izquierda + num];
        }

        for (int num = 0;
        num < tamanio2;
        num++) {

            derechaArray[num] =
            array[medio + 1 + num];
        }

        int i = 0;
        int j = 0;
        int k = izquierda;

        while (i < tamanio1 &&
        j < tamanio2) {

            if (izquierdaArray[i] <=
            derechaArray[j]) {

                array[k] =
                izquierdaArray[i];

                i++;
            }

            else {

                array[k] =
                derechaArray[j];

                j++;
            }

            k++;
        }

        while (i < tamanio1) {

            array[k] =
            izquierdaArray[i];

            i++;
            k++;
        }

        while (j < tamanio2) {

            array[k] =
            derechaArray[j];

            j++;
            k++;
        }
    }

    public static void mostrarArray(int[] array) {

        for (int num = 0;
        num < array.length;
        num++) {

            System.out.print(
            array[num] + " ");
        }

        System.out.println();
    }

    public static int[] generarArray9(int desde9,
    int hasta9,
    int tamanio9) {

        Random random9 =
        new Random();

        int[] array9 =
        new int[tamanio9];

        for (int num = 0;
        num < tamanio9;
        num++) {

            int numeroAleatorio9;
            boolean repetido9;

            do {

                repetido9 = false;

                numeroAleatorio9 =
                random9.nextInt(
                hasta9 - desde9 + 1)
                + desde9;

                for (int j = 0;
                j < num;
                j++) {

                    if (array9[j] ==
                    numeroAleatorio9) {

                        repetido9 = true;
                    }
                }

            } while (repetido9);

            array9[num] =
            numeroAleatorio9;
        }

        return array9;
    }
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
    System.out.println("=== Ejercicio 9 ===");

    System.out.print("Ingrese desde: ");
    int desde9 = teclado.nextInt();

    System.out.print("Ingrese hasta: ");
    int hasta9 = teclado.nextInt();

    System.out.print("Ingrese tamanio del array: ");
    int tamanio9 = teclado.nextInt();

    int[] array9 = generarArray9(desde9, hasta9, tamanio9);

    int[] copiaBurbuja = array9.clone();
    burbuja(copiaBurbuja);
    System.out.println("Burbuja:");
    mostrarArray(copiaBurbuja);

    int[] copiaSeleccion = array9.clone();
    seleccion(copiaSeleccion);
    System.out.println("Seleccion:");
    mostrarArray(copiaSeleccion);

    int[] copiaInsercion = array9.clone();
    insercion(copiaInsercion);
    System.out.println("Insercion:");
    mostrarArray(copiaInsercion);

    int[] copiaArrays = array9.clone();
    Arrays.sort(copiaArrays);
    System.out.println("Arrays.sort:");
    mostrarArray(copiaArrays);

    int[] copiaQuick = array9.clone();
    quickSort(copiaQuick, 0, copiaQuick.length - 1);
    System.out.println("QuickSort:");
    mostrarArray(copiaQuick);

    int[] copiaShell = array9.clone();
    shell(copiaShell);
    System.out.println("Shell:");
    mostrarArray(copiaShell);

    int[] copiaMerge = array9.clone();
    mergeSort(copiaMerge, 0, copiaMerge.length - 1);
    System.out.println("MergeSort:");
    mostrarArray(copiaMerge);

    teclado.close();
    }
}
