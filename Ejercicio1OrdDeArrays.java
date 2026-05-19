package ejercicio1orddearrays;
import java.util.Scanner;
import java.util.Arrays;
public class Ejercicio1OrdDeArrays {
     static void burbuja(int[] array) {

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


    public static void quickSort(int[] array, int inicio, int fin) {

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

            for (int num = salto; num < array.length; num++) {

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

            int medio = (izquierda + derecha) / 2;

            mergeSort(array, izquierda, medio);
            mergeSort(array, medio + 1, derecha);

            merge(array, izquierda, medio, derecha);
        }
    }


    public static void merge(int[] array,
    int izquierda,
    int medio,
    int derecha) {

        int tamanio1 = medio - izquierda + 1;
        int tamanio2 = derecha - medio;

        int[] izquierdaArray = new int[tamanio1];
        int[] derechaArray = new int[tamanio2];

        for (int num = 0; num < tamanio1; num++) {
            izquierdaArray[num] = array[izquierda + num];
        }

        for (int num = 0; num < tamanio2; num++) {
            derechaArray[num] = array[medio + 1 + num];
        }

        int i = 0;
        int j = 0;
        int k = izquierda;

        while (i < tamanio1 && j < tamanio2) {

            if (izquierdaArray[i] <= derechaArray[j]) {

                array[k] = izquierdaArray[i];
                i++;
            }

            else {

                array[k] = derechaArray[j];
                j++;
            }

            k++;
        }

        while (i < tamanio1) {

            array[k] = izquierdaArray[i];
            i++;
            k++;
        }

        while (j < tamanio2) {

            array[k] = derechaArray[j];
            j++;
            k++;
        }
    }


    public static void mostrarArray(int[] array) {

        for (int num = 0; num < array.length; num++) {

            System.out.print(array[num] + " ");
        }

        System.out.println();
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

            System.out.print("Ingrese un numero: ");
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


        int[] copiaBurbuja = arr1.clone();
        burbuja(copiaBurbuja);

        System.out.println("Burbuja:");
        mostrarArray(copiaBurbuja);


        int[] copiaSeleccion = arr1.clone();
        seleccion(copiaSeleccion);

        System.out.println("Seleccion:");
        mostrarArray(copiaSeleccion);


        int[] copiaInsercion = arr1.clone();
        insercion(copiaInsercion);

        System.out.println("Insercion:");
        mostrarArray(copiaInsercion);


        int[] copiaArrays = arr1.clone();
        Arrays.sort(copiaArrays);

        System.out.println("Arrays.sort:");
        mostrarArray(copiaArrays);


        int[] copiaQuick = arr1.clone();
        quickSort(copiaQuick, 0, copiaQuick.length - 1);

        System.out.println("QuickSort:");
        mostrarArray(copiaQuick);


        int[] copiaShell = arr1.clone();
        shell(copiaShell);

        System.out.println("Shell:");
        mostrarArray(copiaShell);


        int[] copiaMerge = arr1.clone();
        mergeSort(copiaMerge, 0, copiaMerge.length - 1);

        System.out.println("MergeSort:");
        mostrarArray(copiaMerge);


        System.out.println("Media positivos: " +
        (contPos1 > 0 ?
        (double) sumaPos1 / contPos1 : 0));

        System.out.println("Media negativos: " +
        (contNeg1 > 0 ?
        (double) sumaNeg1 / contNeg1 : 0));

        teclado.close();
    }
    
}
