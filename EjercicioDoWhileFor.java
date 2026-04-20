package variabe;
import java.util.Scanner;
public class EjercicioDoWhileFor {

    public static void main(String[] args) {
        //Ejercicio 1

        System.out.println("=== Ejercicio 1 ===");
        int contadorWhile = 1;
        int contadorDo = 1;
        while (contadorWhile <= 100) {
        System.out.println("Contador Con While: " + contadorWhile);
        contadorWhile++; 
        }
        do {
            System.out.println("Contador con Do While: " + contadorDo);
            contadorDo++;

        } while (contadorDo <= 100);
        for (int contadorFor = 1; contadorFor <= 100 ; contadorFor++) {
            System.out.println("Contador con For: " + contadorFor);
        }
        //Ejercicio 2
        
        System.out.println("=== Ejercicio 2 ===");
        Scanner teclado = new Scanner(System.in);
        System.out.print("Escriba un numero para que sea el limite para parar el contador: ");
        int contadorcustom2 = teclado.nextInt();
        int contadorWhile2 = 1;
        int contadorDo2 = 1;
        while (contadorWhile2 <= contadorcustom2) {
            System.out.println("Contador con el limite que pusiste con while: " + contadorWhile2);
            contadorWhile2++;
        }
        do {
            System.out.println("Contador con el limite que pusiste con Do while: " + contadorDo2);
            contadorDo2++;
        } while (contadorDo2 <= contadorcustom2);
        for (int contadorFor2 = 1; contadorFor2 <= contadorcustom2 ; contadorFor2++) {
            System.out.println("Contador con el limite que pusiste con For: " + contadorFor2);
        }
         //Ejercicio 3
        
        System.out.println("=== Ejercicio 3 ===");
        System.out.print("Introduce un numero entero para parar que se reste hasta el 1: ");
        int contadorcustom3 = teclado.nextInt();
        for (int contadorfor3 = contadorcustom3; contadorfor3 >= 1; contadorfor3--) {
            System.out.println("Contador hacia 1 usando for:" + contadorfor3);
        }
        int contadorwhile3 = contadorcustom3;
        while (contadorwhile3 >= 1) {
            System.out.println("Contador hacia 1 usando while: " + contadorwhile3);
            contadorwhile3--;
        }
        System.out.println("Contador hacia 1 usando do while:");
        if (contadorcustom3 >= 1) {
            int contadordo3 = contadorcustom3;
            do {
                System.out.println("Contador hacia 1 usando do while:" + contadordo3);
                contadordo3--;
            } while (contadordo3 >= 1);
        } else {
            System.out.println("El numero que pusiste es menor que 1, no hay numeros que mostrar");
        }
        
        //Ejercicio 4
        System.out.println("=== Ejercicio 4 ===");
        int contadorcustom4, contadorcustom45;

        do {
            System.out.print("Introduce un numero: ");
            contadorcustom4 = teclado.nextInt();
            System.out.print("Introduce otro numero: ");
            contadorcustom45 = teclado.nextInt();
            if(contadorcustom4 == contadorcustom45) System.out.println("Deben ser distintos.");
        } while (contadorcustom4 == contadorcustom45);

        int menor = Math.min(contadorcustom4, contadorcustom45);
        int mayor = Math.max(contadorcustom4, contadorcustom45);
        int contadordo4 = menor;
        do {
            System.out.println("Resultado con do while: " + contadordo4);
            contadordo4++;
        } while (contadordo4 <= mayor);

        int contadorconwhile4 = menor;
        while (contadorconwhile4 <= mayor) {
            System.out.println("Resultado con white: " + contadorconwhile4);
            contadorconwhile4++;
        }

        for (int contadorconfor4 = menor; contadorconfor4 <= mayor; contadorconfor4++) {
            System.out.println("Resultado con for: " + contadorconfor4);
        }
        
       //Ejercicio 5
       System.out.println("=== Ejercicio 5 ===");
       int A, B;
        do {
            System.out.print("Introduce A: ");
            A = teclado.nextInt();
            System.out.print("Introduce B: ");
            B = teclado.nextInt();
            if (A >= B) {
                System.out.println("Error: A debe ser menor que B.");
            }
        } while (A >= B);

        for (int contadorconfor5 = A; contadorconfor5 <= B; contadorconfor5++) {
            if (contadorconfor5 % 2 == 0) System.out.println("Con for: " + contadorconfor5);
        }
        int contadorconwhile5 = A;
        while (contadorconwhile5 <= B) {
            if (contadorconwhile5 % 2 == 0) System.out.println("Con while: " + contadorconwhile5);
            contadorconwhile5++;
        }
        int contadordo5 = A;
        do {
            if (contadordo5 % 2 == 0) System.out.println("Con do while: " + contadordo5);
            contadordo5++;
        } while (contadordo5 <= B);
        
        //Ejercicio 6
        
        System.out.println("=== Ejercicio 6 ===");
        int n, m;
        do {
            System.out.print("Introduce el valor de N (positivo): ");
            n = teclado.nextInt();
            System.out.print("Introduce el valor de M (positivo y mayor que N): ");
            m = teclado.nextInt();

            if (n <= 0 || m <= 0) {
                System.out.println("Error: Los numeros deben ser mayores que cero");
            } else if (n >= m) {
                System.out.println("Error: N debe ser estrictamente menor que M");
            }           
        } while (n <= 0 || m <= 0 || n >= m);
        for (int contadorconfor6 = n; contadorconfor6 <= m; contadorconfor6 += n) {
            System.out.println("Resultado con FOR: " + contadorconfor6);
        }
        int contadorconwhile6 = n;
        while (contadorconwhile6 <= m) {
            System.out.println("Resultado con While: " + contadorconwhile6);
            contadorconwhile6+= n;
        }
        int contadordo6 = n;
        do {
            System.out.println("Resultado con do: " + contadordo6);
            contadordo6 += n;
        } while (contadordo6 <= m);
        
        //Ejercicio 7
        System.out.println("=== Ejercicio 7 ===");
        double millas;
        double VALOR_KM = 1.6093;
        do {
            System.out.print("Introduce millas(do while): ");
            millas = teclado.nextDouble();
            if (millas != 0) {
                System.out.println("Resultado con do while: km " + millas * VALOR_KM);
            }
        } while (millas != 0);
        System.out.print("Introduce millas(while): ");
        millas = teclado.nextDouble();
        while (millas != 0) {
            System.out.print("Resultado con while: km" + millas * VALOR_KM);
            System.out.print("Introduce millas: ");
            millas = teclado.nextDouble();
        }
        for (; ; ) { 
            System.out.print("Introduce millas(for): ");
            millas = teclado.nextDouble();
            if (millas != 0) {
                break;
            }
            System.out.print("Resultado con for: km" + millas * VALOR_KM);
        }
    }
}
