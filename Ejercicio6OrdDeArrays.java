package ejercicio6orddearrays;
import java.util.Scanner;
import java.util.Arrays;

public class Ejercicio6OrdDeArrays {
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


    public static void calcularMedia(int[] array) {

        int sumaPos6 = 0;
        int sumaNeg6 = 0;
        int contPos6 = 0;
        int contNeg6 = 0;

        for (int num = 0; num < array.length; num++) {

            if (array[num] > 0) {

                sumaPos6 += array[num];
                contPos6++;
            }

            else if (array[num] < 0) {

                sumaNeg6 += array[num];
                contNeg6++;
            }
        }

        double mediaPos6 = 0;
        double mediaNeg6 = 0;

        if (contPos6 > 0) {
            mediaPos6 = (double) sumaPos6 / contPos6;
        }

        if (contNeg6 > 0) {
            mediaNeg6 = (double) sumaNeg6 / contNeg6;
        }

        System.out.println("Media positivos: " + mediaPos6);
        System.out.println("Media negativos: " + mediaNeg6);
    }
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("=== Ejercicio 6 ===");

        int[] arr6 = new int[10];

        for (int num = 0; num < 10; num++) {

            System.out.print("Ingrese numero: ");
            arr6[num] = teclado.nextInt();
        }


        int[] copiaBurbuja = arr6.clone();
        burbuja(copiaBurbuja);

        System.out.println("Burbuja:");
        mostrarArray(copiaBurbuja);
        calcularMedia(copiaBurbuja);


        int[] copiaSeleccion = arr6.clone();
        seleccion(copiaSeleccion);

        System.out.println("Seleccion:");
        mostrarArray(copiaSeleccion);
        calcularMedia(copiaSeleccion);


        int[] copiaInsercion = arr6.clone();
        insercion(copiaInsercion);

        System.out.println("Insercion:");
        mostrarArray(copiaInsercion);
        calcularMedia(copiaInsercion);


        int[] copiaArrays = arr6.clone();
        Arrays.sort(copiaArrays);

        System.out.println("Arrays.sort:");
        mostrarArray(copiaArrays);
        calcularMedia(copiaArrays);


        int[] copiaQuick = arr6.clone();
        quickSort(copiaQuick, 0,
        copiaQuick.length - 1);

        System.out.println("QuickSort:");
        mostrarArray(copiaQuick);
        calcularMedia(copiaQuick);


        int[] copiaShell = arr6.clone();
        shell(copiaShell);

        System.out.println("Shell:");
        mostrarArray(copiaShell);
        calcularMedia(copiaShell);


        int[] copiaMerge = arr6.clone();
        mergeSort(copiaMerge, 0,
        copiaMerge.length - 1);

        System.out.println("MergeSort:");
        mostrarArray(copiaMerge);
        calcularMedia(copiaMerge);

        teclado.close();
    }
    
}
