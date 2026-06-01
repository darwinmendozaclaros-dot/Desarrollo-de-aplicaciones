package matrices;
import java.util.Scanner;
public class Matrices {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //Ejercicio 1
        System.out.println("=== Ejercicio 1 ===");

        int[][] matriz1 = {
            {4, 5},
            {3, 2}
        };

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                System.out.print("[" + matriz1[i][j] + "]");
            }
            System.out.println();
        }

        //Ejercicio 2
        System.out.println("\n=== Ejercicio 2 ===");

        int[][] matriz2 = {
            {1, 5, 4},
            {2, 4, 5},
            {1, 2, 3}
        };

        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                System.out.print(matriz2[i][j] + " ");
            }
            System.out.println();
        }

        //Ejercicio 3
        System.out.println("\n=== Ejercicio 3 ===");

        System.out.print("Ingrese el tamaño de la matriz cuadrada: ");
        int n = teclado.nextInt();

        int[][] matriz3 = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz3[i][j] = teclado.nextInt();
            }
        }

        System.out.println("Matriz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz3[i][j] + " ");
            }
            System.out.println();
        }

        //Ejercicio 4
        System.out.println("\n=== Ejercicio 4 ===");

        System.out.print("Ingrese cantidad de filas: ");
        int filas = teclado.nextInt();

        System.out.print("Ingrese cantidad de columnas: ");
        int columnas = teclado.nextInt();

        int[][] matriz4 = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz4[i][j] = teclado.nextInt();
            }
        }

        System.out.println("Matriz:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz4[i][j] + " ");
            }
            System.out.println();
        }

        teclado.nextLine();

        //Ejercicio 5
        System.out.println("\n=== Ejercicio 5 ===");

        System.out.print("Ingrese cantidad de registros: ");
        int tam = teclado.nextInt();
        teclado.nextLine();

        String[][] matriz5 = new String[tam][2];

        for (int i = 0; i < tam; i++) {
            System.out.print("Nombre: ");
            matriz5[i][0] = teclado.nextLine();

            System.out.print("Numero: ");
            matriz5[i][1] = teclado.nextLine();
        }

        System.out.println("Nombre\tNumero");
        for (int i = 0; i < tam; i++) {
            System.out.println(matriz5[i][0] + "\t" + matriz5[i][1]);
        }

        //Ejercicio 6
        System.out.println("\n=== Ejercicio 6 ===");

        String[][] matriz6 = {
            {"Juan", "25", "Ana"},
            {"30", "Pedro", "40"},
            {"Maria", "50", "Luis"}
        };

        for (int i = 0; i < matriz6.length; i++) {
            for (int j = 0; j < matriz6[i].length; j++) {
                System.out.print(matriz6[i][j] + "\t");
            }
            System.out.println();
        }

        //Ejercicio 7
        System.out.println("\n=== Ejercicio 7 ===");

        String[][] empleados = {
            {"Juan", "35", "2500"},
            {"Maria", "28", "3000"},
            {"Pedro", "42", "3200"}
        };

        System.out.println("Nombre\tEdad\tSueldo");

        for (int i = 0; i < empleados.length; i++) {
            for (int j = 0; j < empleados[i].length; j++) {
                System.out.print(empleados[i][j] + "\t");
            }
            System.out.println();
        }

        //Ejercicio 8
        System.out.println("\n=== Ejercicio 8 ===");

        System.out.print("Ingrese filas: ");
        filas = teclado.nextInt();

        System.out.print("Ingrese columnas: ");
        columnas = teclado.nextInt();

        int[][] matriz8 = new int[filas][columnas];

        int suma = 0;
        int contador = 0;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz8[i][j] = teclado.nextInt();

                if (matriz8[i][j] > 0 && matriz8[i][j] % 2 != 0) {
                    suma += matriz8[i][j];
                    contador++;
                }
            }
        }

        System.out.println("Matriz:");

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz8[i][j] + " ");
            }
            System.out.println();
        }

        if (contador > 0) {
            double promedio = (double) suma / contador;
            System.out.println("Promedio de positivos impares: " + promedio);
        } else {
            System.out.println("No hay numeros positivos impares.");
        }
        teclado.close();
    }
    
}
