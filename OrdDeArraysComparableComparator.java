package orddearrays.comparablecomparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;
class Numero implements Comparable<Numero> {
    int valor;
    public Numero(int valor) {
        this.valor = valor;
    }
    @Override
    public int compareTo(Numero otro) {
        return this.valor - otro.valor;
    }
}
class Empleado {
    String nombre8;
    double sueldo8;
    public Empleado(String nombre8, double sueldo8) {
        this.nombre8 = nombre8;
        this.sueldo8 = sueldo8;
    }
}

class ComparadorEmpleado implements Comparator<Empleado> {

    @Override
    public int compare(Empleado e1, Empleado e2) {
        if (e1.sueldo8 > e2.sueldo8) {
            return -1;
        }
        if (e1.sueldo8 < e2.sueldo8) {
            return 1;
        }
        return 0;
    }
}
public class OrdDeArraysComparableComparator {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //Ejercicio 1
        System.out.println("=== Ejercicio 1 ===");

        ArrayList<Numero> lista1 = new ArrayList<>();

        int sumaPos1 = 0;
        int sumaNeg1 = 0;
        int contPos1 = 0;
        int contNeg1 = 0;

        for (int num = 0; num < 10; num++) {

            System.out.print("Ingrese numero: ");
            int valor1 = teclado.nextInt();

            lista1.add(new Numero(valor1));

            if (valor1 > 0) {
                sumaPos1 += valor1;
                contPos1++;
            }

            else if (valor1 < 0) {
                sumaNeg1 += valor1;
                contNeg1++;
            }
        }
        Collections.sort(lista1);

        System.out.println("Numeros ordenados:");

        for (Numero n : lista1) {
            System.out.print(n.valor + " ");
        }

        System.out.println();
        System.out.println("Media positivos: " + (double) sumaPos1 / contPos1);
        System.out.println("Media negativos: " + (double) sumaNeg1 / contNeg1);
        
        //Ejercicio 2
        System.out.println("=== Ejercicio 2 ===");

        ArrayList<Numero> lista2 = new ArrayList<>();

        int suma2 = 0;
        int cont2 = 0;

        for (int num = 0; num < 10; num++) {

            System.out.print("Ingrese numero: ");
            int valor2 = teclado.nextInt();

            lista2.add(new Numero(valor2));
        }

        Collections.sort(lista2);

        for (int num = 0; num < lista2.size(); num += 2) {

            suma2 += lista2.get(num).valor;
            cont2++;
        }
        System.out.println("Media posiciones pares: " + (double) suma2 / cont2);
        
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
                System.out.println("Alumno " + (num + 1) + ": " + notas3[num]);
            }
        }
        
        //Ejercicio 4
        System.out.println("=== Ejercicio 4 ===");

        ArrayList<Numero> lista4 = new ArrayList<>();

        for (int num = 0; num < 20; num++) {
            lista4.add(new Numero(num * 2));
        }

        Collections.sort(lista4);

        for (Numero n : lista4) {
            System.out.println(n.valor + " ");
        }
        
        //Ejercicio 5
        System.out.println("=== Ejercicio 5 ===");

        ArrayList<Numero> lista5 = new ArrayList<>();

        int positivos5 = 0;
        int negativos5 = 0;
        int ceros5 = 0;

        for (int num = 0; num < 10; num++) {

            System.out.print("Ingrese numero: ");
            int valor5 = teclado.nextInt();

            lista5.add(new Numero(valor5));

            if (valor5 > 0) {
                positivos5++;
            }

            else if (valor5 < 0) {
                negativos5++;
            }

            else {
                ceros5++;
            }
        }

        Collections.sort(lista5);

        System.out.println("Positivos: " + positivos5);
        System.out.println("Negativos: " + negativos5);
        System.out.println("Ceros: " + ceros5);
        
        //Ejercicio 6 y 7
        System.out.println("=== Ejercicio 6 y 7 ===");
        ArrayList<Numero> lista6 = new ArrayList<>();

        int sumaPos6 = 0;
        int sumaNeg6 = 0;
        int contPos6 = 0;
        int contNeg6 = 0;

        for (int num = 0; num < 10; num++) {

            System.out.print("Ingrese numero: ");
            int valor6 = teclado.nextInt();

            lista6.add(new Numero(valor6));

            if (valor6 > 0) {
                sumaPos6 += valor6;
                contPos6++;
            }

            else if (valor6 < 0) {
                sumaNeg6 += valor6;
                contNeg6++;
            }
        }

        Collections.sort(lista6);

        System.out.println("Media positivos: " + (double) sumaPos6 / contPos6);
        System.out.println("Media negativos: " + (double) sumaNeg6 / contNeg6);
        
        //Ejercicio 8
        System.out.println("=== Ejercicio 8 ===");

        ArrayList<Empleado> empleados8 = new ArrayList<>();

        for (int num = 0; num < 20; num++) {
            teclado.nextLine();
            System.out.print("Ingrese nombre: ");
            String nombre8 = teclado.nextLine();
            System.out.print("Ingrese sueldo: ");
            double sueldo8 = teclado.nextDouble();
            empleados8.add(new Empleado(nombre8, sueldo8));
        }
        Collections.sort(empleados8, new ComparadorEmpleado());
        System.out.println("Empleado que mas gana: " + empleados8.get(0).nombre8);
        System.out.println("Sueldo: " + empleados8.get(0).sueldo8);
        
        //Ejercicio 9
        System.out.println("=== Ejercicio 9 ===");

        Random random9 = new Random();

        System.out.print("Ingrese desde: ");
        int desde9 = teclado.nextInt();

        System.out.print("Ingrese hasta: ");
        int hasta9 = teclado.nextInt();

        System.out.print("Ingrese tamanio: ");
        int tamanio9 = teclado.nextInt();

        ArrayList<Numero> lista9 = new ArrayList<>();

        while (lista9.size() < tamanio9) {

            int numero9 = random9.nextInt(hasta9 - desde9 + 1) + desde9;

            boolean repetido9 = false;

            for (Numero n : lista9) {

                if (n.valor == numero9) {
                    repetido9 = true;
                }
            }

            if (!repetido9) {
                lista9.add(new Numero(numero9));
            }
        }

        Collections.sort(lista9);

        for (Numero n : lista9) {
            System.out.print(n.valor + " ");
        }

        teclado.close();
    }
}
