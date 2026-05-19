package ejercicio8orddearrays;
import java.util.Scanner;
import java.util.Arrays;

public class Ejercicio8OrdDeArrays {
    public static void burbuja(double[] array,
    String[] nombres) {

        for (int num = 0; num < array.length - 1; num++) {

            for (int j = 0; j < array.length - 1 - num; j++) {

                if (array[j] > array[j + 1]) {

                    double auxiliarSueldo = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = auxiliarSueldo;

                    String auxiliarNombre = nombres[j];
                    nombres[j] = nombres[j + 1];
                    nombres[j + 1] = auxiliarNombre;
                }
            }
        }
    }


    public static void seleccion(double[] array,
    String[] nombres) {

        for (int num = 0; num < array.length - 1; num++) {

            int menor = num;

            for (int j = num + 1; j < array.length; j++) {

                if (array[j] < array[menor]) {
                    menor = j;
                }
            }

            double auxiliarSueldo = array[num];
            array[num] = array[menor];
            array[menor] = auxiliarSueldo;

            String auxiliarNombre = nombres[num];
            nombres[num] = nombres[menor];
            nombres[menor] = auxiliarNombre;
        }
    }


    public static void insercion(double[] array,
    String[] nombres) {

        for (int num = 1; num < array.length; num++) {

            double auxiliarSueldo = array[num];
            String auxiliarNombre = nombres[num];

            int j = num - 1;

            while (j >= 0 &&
            array[j] > auxiliarSueldo) {

                array[j + 1] = array[j];
                nombres[j + 1] = nombres[j];

                j--;
            }

            array[j + 1] = auxiliarSueldo;
            nombres[j + 1] = auxiliarNombre;
        }
    }


    public static void quickSort(double[] array,
    String[] nombres,
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

                double auxiliarSueldo = array[i];
                array[i] = array[j];
                array[j] = auxiliarSueldo;

                String auxiliarNombre = nombres[i];
                nombres[i] = nombres[j];
                nombres[j] = auxiliarNombre;

                i++;
                j--;
            }
        }

        if (inicio < j) {
            quickSort(array, nombres,
            inicio, j);
        }

        if (i < fin) {
            quickSort(array, nombres,
            i, fin);
        }
    }


    public static void shell(double[] array,
    String[] nombres) {

        int salto = array.length / 2;

        while (salto > 0) {

            for (int num = salto;
            num < array.length;
            num++) {

                double auxiliarSueldo = array[num];
                String auxiliarNombre = nombres[num];

                int j = num;

                while (j >= salto &&
                array[j - salto] >
                auxiliarSueldo) {

                    array[j] = array[j - salto];
                    nombres[j] = nombres[j - salto];

                    j = j - salto;
                }

                array[j] = auxiliarSueldo;
                nombres[j] = auxiliarNombre;
            }

            salto = salto / 2;
        }
    }


    public static void mergeSort(double[] array,
    String[] nombres,
    int izquierda,
    int derecha) {

        if (izquierda < derecha) {

            int medio = (izquierda + derecha) / 2;

            mergeSort(array, nombres,
            izquierda, medio);

            mergeSort(array, nombres,
            medio + 1, derecha);

            merge(array, nombres,
            izquierda, medio, derecha);
        }
    }


    public static void merge(double[] array,
    String[] nombres,
    int izquierda,
    int medio,
    int derecha) {

        int tamanio1 = medio - izquierda + 1;
        int tamanio2 = derecha - medio;

        double[] izquierdaArray =
        new double[tamanio1];

        double[] derechaArray =
        new double[tamanio2];

        String[] izquierdaNombres =
        new String[tamanio1];

        String[] derechaNombres =
        new String[tamanio2];

        for (int num = 0;
        num < tamanio1;
        num++) {

            izquierdaArray[num] =
            array[izquierda + num];

            izquierdaNombres[num] =
            nombres[izquierda + num];
        }

        for (int num = 0;
        num < tamanio2;
        num++) {

            derechaArray[num] =
            array[medio + 1 + num];

            derechaNombres[num] =
            nombres[medio + 1 + num];
        }

        int i = 0;
        int j = 0;
        int k = izquierda;

        while (i < tamanio1 &&
        j < tamanio2) {

            if (izquierdaArray[i] <=
            derechaArray[j]) {

                array[k] = izquierdaArray[i];
                nombres[k] =
                izquierdaNombres[i];

                i++;
            }

            else {

                array[k] = derechaArray[j];
                nombres[k] =
                derechaNombres[j];

                j++;
            }

            k++;
        }

        while (i < tamanio1) {

            array[k] = izquierdaArray[i];
            nombres[k] =
            izquierdaNombres[i];

            i++;
            k++;
        }

        while (j < tamanio2) {

            array[k] = derechaArray[j];
            nombres[k] =
            derechaNombres[j];

            j++;
            k++;
        }
    }


    public static void mostrar(double[] array,
    String[] nombres) {

        for (int num = 0;
        num < array.length;
        num++) {

            System.out.println(
            nombres[num] + " - " +
            array[num]);
        }
    }
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

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


    double[] copiaBurbuja = sueldos8.clone();
    String[] nombresBurbuja = nombres8.clone();
    burbuja(copiaBurbuja, nombresBurbuja);
    System.out.println("Burbuja:");
    mostrar(copiaBurbuja, nombresBurbuja);

    System.out.println("Mayor sueldo: " + nombresBurbuja[19] + " - " + copiaBurbuja[19]);

    double[] copiaSeleccion = sueldos8.clone();
    String[] nombresSeleccion = nombres8.clone();

    seleccion(copiaSeleccion, nombresSeleccion);

    System.out.println("Seleccion:");

    mostrar(copiaSeleccion, nombresSeleccion);

    System.out.println("Mayor sueldo: " + nombresSeleccion[19] + " - " + copiaSeleccion[19]);

    double[] copiaInsercion = sueldos8.clone();
    String[] nombresInsercion = nombres8.clone();

    insercion(copiaInsercion, nombresInsercion);

    System.out.println("Insercion:");

    mostrar(copiaInsercion, nombresInsercion);

    System.out.println("Mayor sueldo: " + nombresInsercion[19] + " - " + copiaInsercion[19]);


    double[] copiaArrays = sueldos8.clone();
    String[] nombresArrays = nombres8.clone();

    Arrays.sort(copiaArrays);

    System.out.println("Arrays.sort:");

    for (int num = 0;
    num < copiaArrays.length;
    num++) {

        System.out.println(copiaArrays[num]);
    }


    double[] copiaQuick = sueldos8.clone();
    String[] nombresQuick = nombres8.clone();

    quickSort(copiaQuick, nombresQuick,0,copiaQuick.length - 1);

    System.out.println("QuickSort:");

    mostrar(copiaQuick, nombresQuick);

    System.out.println("Mayor sueldo: " +
    nombresQuick[19] + " - " +
    copiaQuick[19]);


    double[] copiaShell = sueldos8.clone();
    String[] nombresShell = nombres8.clone();

    shell(copiaShell, nombresShell);

    System.out.println("Shell:");

    mostrar(copiaShell, nombresShell);

    System.out.println("Mayor sueldo: " +
    nombresShell[19] + " - " +
    copiaShell[19]);

    double[] copiaMerge = sueldos8.clone();
    String[] nombresMerge = nombres8.clone();
    mergeSort(copiaMerge, nombresMerge, 0,copiaMerge.length - 1);

    System.out.println("MergeSort:");
    mostrar(copiaMerge, nombresMerge);

    System.out.println("Mayor sueldo: " + nombresMerge[19] + " - " + copiaMerge[19]);

    teclado.close();
    }
    
}
