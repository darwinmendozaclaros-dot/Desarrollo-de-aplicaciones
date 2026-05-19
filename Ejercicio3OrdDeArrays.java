package ejercicio3orddearrays;
import java.util.Scanner;
import java.util.Arrays;

public class Ejercicio3OrdDeArrays {
    public static void burbuja(double[] array) {

        for (int num = 0; num < array.length - 1; num++) {

            for (int j = 0; j < array.length - 1 - num; j++) {

                if (array[j] > array[j + 1]) {

                    double auxiliar = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = auxiliar;
                }
            }
        }
    }


    public static void seleccion(double[] array) {

        for (int num = 0; num < array.length - 1; num++) {

            int menor = num;

            for (int j = num + 1; j < array.length; j++) {

                if (array[j] < array[menor]) {
                    menor = j;
                }
            }

            double auxiliar = array[num];
            array[num] = array[menor];
            array[menor] = auxiliar;
        }
    }


    public static void insercion(double[] array) {

        for (int num = 1; num < array.length; num++) {

            double auxiliar = array[num];
            int j = num - 1;

            while (j >= 0 && array[j] > auxiliar) {

                array[j + 1] = array[j];
                j--;
            }

            array[j + 1] = auxiliar;
        }
    }


    public static void quickSort(double[] array,
    int inicio,
    int fin) {

        int i = inicio;
        int j = fin;

        double pivote = array[(inicio + fin) / 2];

        while (i <= j) {

            while (array[i] < pivote) {
                i++;
            }

            while (array[j] > pivote) {
                j--;
            }

            if (i <= j) {

                double auxiliar = array[i];
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


    public static void shell(double[] array) {

        int salto = array.length / 2;

        while (salto > 0) {

            for (int num = salto; num < array.length; num++) {

                double auxiliar = array[num];
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


    public static void mergeSort(double[] array,
    int izquierda,
    int derecha) {

        if (izquierda < derecha) {

            int medio = (izquierda + derecha) / 2;

            mergeSort(array, izquierda, medio);
            mergeSort(array, medio + 1, derecha);

            merge(array, izquierda, medio, derecha);
        }
    }


    public static void merge(double[] array,
    int izquierda,
    int medio,
    int derecha) {

        int tamanio1 = medio - izquierda + 1;
        int tamanio2 = derecha - medio;

        double[] izquierdaArray = new double[tamanio1];
        double[] derechaArray = new double[tamanio2];

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


    public static void mostrarArray(double[] array) {

        for (int num = 0; num < array.length; num++) {

            System.out.print(array[num] + " ");
        }

        System.out.println();
    }


    public static double calcularMedia(double[] array) {

        double suma3 = 0;

        for (int num = 0; num < array.length; num++) {
            suma3 += array[num];
        }

        return suma3 / array.length;
    }


    public static void mostrarMayoresMedia(double[] array,
    double media3) {

        System.out.println("Notas mayores a la media:");

        for (int num = 0; num < array.length; num++) {

            if (array[num] > media3) {

                System.out.println(array[num]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("=== Ejercicio 3 ===");
        System.out.print("Ingrese cantidad de alumnos: ");
        int cantAlumnos3 = teclado.nextInt();

        double[] notas3 = new double[cantAlumnos3];

        for (int num = 0; num < cantAlumnos3; num++) {

            System.out.print("Ingrese nota: ");
            notas3[num] = teclado.nextDouble();
        }


        double[] copiaBurbuja = notas3.clone();
        burbuja(copiaBurbuja);

        System.out.println("Burbuja:");
        mostrarArray(copiaBurbuja);

        double mediaBurbuja = calcularMedia(copiaBurbuja);

        System.out.println("Media: " + mediaBurbuja);

        mostrarMayoresMedia(copiaBurbuja,
        mediaBurbuja);


        double[] copiaSeleccion = notas3.clone();
        seleccion(copiaSeleccion);

        System.out.println("Seleccion:");
        mostrarArray(copiaSeleccion);

        double mediaSeleccion = calcularMedia(copiaSeleccion);

        System.out.println("Media: " + mediaSeleccion);

        mostrarMayoresMedia(copiaSeleccion,
        mediaSeleccion);


        double[] copiaInsercion = notas3.clone();
        insercion(copiaInsercion);

        System.out.println("Insercion:");
        mostrarArray(copiaInsercion);

        double mediaInsercion = calcularMedia(copiaInsercion);

        System.out.println("Media: " + mediaInsercion);

        mostrarMayoresMedia(copiaInsercion,
        mediaInsercion);


        double[] copiaArrays = notas3.clone();
        Arrays.sort(copiaArrays);

        System.out.println("Arrays.sort:");
        mostrarArray(copiaArrays);

        double mediaArrays = calcularMedia(copiaArrays);

        System.out.println("Media: " + mediaArrays);

        mostrarMayoresMedia(copiaArrays,
        mediaArrays);


        double[] copiaQuick = notas3.clone();
        quickSort(copiaQuick, 0,
        copiaQuick.length - 1);

        System.out.println("QuickSort:");
        mostrarArray(copiaQuick);

        double mediaQuick = calcularMedia(copiaQuick);

        System.out.println("Media: " + mediaQuick);

        mostrarMayoresMedia(copiaQuick,
        mediaQuick);


        double[] copiaShell = notas3.clone();
        shell(copiaShell);

        System.out.println("Shell:");
        mostrarArray(copiaShell);

        double mediaShell = calcularMedia(copiaShell);

        System.out.println("Media: " + mediaShell);

        mostrarMayoresMedia(copiaShell,
        mediaShell);


        double[] copiaMerge = notas3.clone();
        mergeSort(copiaMerge, 0,
        copiaMerge.length - 1);

        System.out.println("MergeSort:");
        mostrarArray(copiaMerge);

        double mediaMerge = calcularMedia(copiaMerge);

        System.out.println("Media: " + mediaMerge);

        mostrarMayoresMedia(copiaMerge,
        mediaMerge);

        teclado.close();
    }
    
}
