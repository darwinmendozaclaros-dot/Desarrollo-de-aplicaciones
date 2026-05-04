package ejerciciosdevariablesdoforwhile2;
import java.util.Scanner;
public class EjerciciosDeVariablesDoForWhile2 {

    public static void main(String[] args) {
        //Ejercicio 1
        Scanner teclado = new Scanner(System.in);
        String linea;
        char cuae;
        System.out.println("=== Ejercicio 1 ===");

        for (;;) {
            System.out.print("(Con for)Ingrese un caracter ");
            linea = teclado.nextLine();

            if (linea.equals(" ")) break;

            cuae = Character.toLowerCase(linea.charAt(0));

            if (cuae=='a'||cuae=='e'||cuae=='i'||cuae=='o'||cuae=='u')
                System.out.println("VOCAL");
            else
                System.out.println("NO VOCAL");
        }

        System.out.print("(Con while)Ingrese un caracter ");
        linea = teclado.nextLine();

        while (!linea.equals(" ")) {
            cuae = Character.toLowerCase(linea.charAt(0));

            if (cuae=='a'||cuae=='e'||cuae=='i'||cuae=='o'||cuae=='u')
                System.out.println("VOCAL");
            else
                System.out.println("NO VOCAL");

            System.out.print("Ingrese otro caracter ");
            linea = teclado.nextLine();
        }

        do {
            System.out.print("(con do while)Ingrese un caracter ");
            linea = teclado.nextLine();

            if (!linea.equals(" ")) {
                cuae = Character.toLowerCase(linea.charAt(0));

                if (cuae=='a'||cuae=='e'||cuae=='i'||cuae=='o'||cuae=='u')
                    System.out.println("VOCAL");
                else
                    System.out.println("NO VOCAL");
            }

        } while (!linea.equals(" "));


        //Ejercicio 2
        System.out.println("=== Ejercicio 2 ===");

        double base;
        int exponente;

        System.out.print("Ingrese la base ");
        base = teclado.nextDouble();

        System.out.print("Ingrese el exponente ");
        exponente = teclado.nextInt();

        double resFor = 1;
        for (int i = 1; i <= exponente; i++) {
            resFor *= base;
        }
        System.out.println("Con for: " + resFor);

        double resWhile = 1;
        int i = 1;
        while (i <= exponente) {
            resWhile *= base;
            i++;
        }
        System.out.println("Con while: " + resWhile);

        double resDo = 1;
        int j = 1;
        if (exponente > 0) {
            do {
                resDo *= base;
                j++;
            } while (j <= exponente);
        }
        System.out.println("Con do while: " + resDo);

        teclado.nextLine();


        //Ejercicio 3
        System.out.println("=== Ejercicio 3 ===");

        int meses = 20;

        double pago = 10, total = 0;
        for (int k = 1; k <= meses; k++) {
            System.out.println("(Con for)Mes " + k + " " + pago + " euros");
            total += pago;
            pago *= 2;
        }
        System.out.println(total);

        int m = 1;
        pago = 10;
        total = 0;

        while (m <= meses) {
            System.out.println("(Con while)Mes " + m + " " + pago + " euros");
            total += pago;
            pago *= 2;
            m++;
        }
        System.out.println(total);

        int letrado3 = 1;
        pago = 10;
        total = 0;

        do {
            System.out.println("(Con do while)Mes " + letrado3 + " " + pago + " euros");
            total += pago;
            pago *= 2;
            letrado3++;
        } while (letrado3 <= meses);

        System.out.println(total);


        //Ejercicio 4
        System.out.println("=== Ejercicio 4 ===");

        for (int num = 100; num >= 0; num -= 23) {
            System.out.println("(Con for)" + num);
        }

        int numWhile = 100;
        while (numWhile >= 0) {
            System.out.println("(Con while)" + numWhile);
            numWhile -= 23;
        }

        int letrado3b = 100;
        do {
            System.out.println("Con do while)" + letrado3b);
            letrado3b -= 23;
        } while (letrado3b >= 0);


        //Ejercicio 5
        System.out.println("=== Ejercicio 5 ===");

        for (int t = 1; t <= 10; t++) {
            System.out.println("(Con for)Tabla del " + t);
            System.out.println("----------------");
            for (int x = 1; x <= 10; x++) {
                System.out.println(t + " x " + x + " = " + (t * x));
            }
        }

        int t2 = 1;
        while (t2 <= 10) {
            System.out.println("(Con while)Tabla del " + t2);
            System.out.println("----------------");
            int x2 = 1;
            while (x2 <= 10) {
                System.out.println(t2 + " x " + x2 + " = " + (t2 * x2));
                x2++;
            }
            t2++;
        }

        int t3 = 1;
        do {
            System.out.println("(Con do while)Tabla del " + t3);
            System.out.println("----------------");
            int x3 = 1;
            do {
                System.out.println(t3 + " x " + x3 + " = " + (t3 * x3));
                x3++;
            } while (x3 <= 10);
            t3++;
        } while (t3 <= 10);
    }
}