package ejercitaciones;
import java.util.Scanner;
public class Ejercitaciones {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("=== Ejercicio 1 ===");
        String nombre, numero;
        double tipo, importe;

        Cuenta cuenta1 = new Cuenta();

        System.out.print("Nombre: ");
        nombre = teclado.nextLine();

        System.out.print("Numero de cuenta: ");
        numero = teclado.nextLine();

        System.out.print("Tipo de interes: ");
        tipo = teclado.nextDouble();

        System.out.print("Saldo: ");
        importe = teclado.nextDouble();

        cuenta1.setNombre(nombre);
        cuenta1.setNumeroCuenta(numero);
        cuenta1.setTipoInteres(tipo);
        cuenta1.setSaldo(importe);

        Cuenta cuenta2 = new Cuenta("Juan Ferrandez Rubio", "12345678901234567890", 1.75, 300);

        Cuenta cuenta3 = new Cuenta(cuenta1);

        System.out.println("Datos de la cuenta 1");
        System.out.println("Nombre del titular: " + cuenta1.getNombre());
        System.out.println("Numero de cuenta: " + cuenta1.getNumeroCuenta());
        System.out.println("Tipo de interes: " + cuenta1.getTipoInteres());
        System.out.println("Saldo: " + cuenta1.getSaldo());

        cuenta1.ingreso(4000);

        System.out.println("Saldo de cuenta1 despues del ingreso");
        System.out.println("Saldo: " + cuenta1.getSaldo());

        cuenta3.transferencia(cuenta2, 10);

        System.out.println("Saldo de la cuenta 2");
        System.out.println("Saldo: " + cuenta2.getSaldo());

        System.out.println("Saldo de la cuenta 3");
        System.out.println("Saldo: " + cuenta3.getSaldo());
        
        // Ejercicio 2
        System.out.println("=== Ejercicio 2 ===");
        Contador contador1 = new Contador();
        Contador contador2 = new Contador(10);
        Contador contador3 = new Contador(contador2);

        System.out.println("Contador 1: " + contador1.getCont());
        System.out.println("Contador 2: " + contador2.getCont());
        System.out.println("Contador 3: " + contador3.getCont());

        contador1.incrementar();
        contador1.incrementar();

        System.out.println("Contador 1 despues de incrementar dos veces: "
        + contador1.getCont());

        contador2.decrementar();

        System.out.println("Contador 2 despues de decrementar: "
        + contador2.getCont());
        
        //Ejercicio 3
        System.out.println("=== Ejercicio 3 ===");
        Libro libro1 = new Libro("Don Quijote", "Miguel de Cervantes", 5, 0);

        System.out.println("Datos del libro");
        System.out.println(libro1);

        libro1.prestamo();
        libro1.prestamo();

        System.out.println("Despues de dos prestamos");
        System.out.println(libro1);

        libro1.devolucion();

        System.out.println("Despues de una devolucion");
        System.out.println(libro1);

        teclado.close();
    }
}

class Cuenta {

    private String nombre;
    private String numeroCuenta;
    private double tipoInteres;
    private double saldo;

    public Cuenta() {
        nombre = "";
        numeroCuenta = "";
        tipoInteres = 0;
        saldo = 0;
    }

    public Cuenta(String nombre, String numeroCuenta, double tipoInteres, double saldo) {
        this.nombre = nombre;
        this.numeroCuenta = numeroCuenta;
        this.tipoInteres = tipoInteres;
        this.saldo = saldo;
    }

    public Cuenta(Cuenta c) {
        nombre = c.nombre;
        numeroCuenta = c.numeroCuenta;
        tipoInteres = c.tipoInteres;
        saldo = c.saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getTipoInteres() {
        return tipoInteres;
    }

    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean ingreso(double cantidad) {
        if (cantidad < 0) {
            return false;
        }

        saldo += cantidad;
        return true;
    }

    public boolean reintegro(double cantidad) {
        if (cantidad < 0 || cantidad > saldo) {
            return false;
        }

        saldo -= cantidad;
        return true;
    }

    public boolean transferencia(Cuenta destino, double importe) {
        if (importe < 0 || saldo < importe) {
            return false;
        }

        saldo -= importe;
        destino.saldo += importe;
        return true;
    }
}

class Contador {

    private int cont;

    public Contador() {
        cont = 0;
    }

    public Contador(int cont) {
        if (cont >= 0) {
            this.cont = cont;
        } else {
            this.cont = 0;
        }
    }

    public Contador(Contador c) {
        cont = c.cont;
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        if (cont >= 0) {
            this.cont = cont;
        } else {
            this.cont = 0;
        }
    }

    public void incrementar() {
        cont++;
    }

    public void decrementar() {
        cont--;

        if (cont < 0) {
            cont = 0;
        }
    }
}

class Libro {

    private String titulo;
    private String autor;
    private int ejemplares;
    private int prestados;

    public Libro() {
        titulo = "";
        autor = "";
        ejemplares = 0;
        prestados = 0;
    }
    public Libro(String titulo, String autor, int ejemplares, int prestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.ejemplares = ejemplares;
        this.prestados = prestados;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getEjemplares() {
        return ejemplares;
    }
    public void setEjemplares(int ejemplares) {
        this.ejemplares = ejemplares;
    }
    public int getPrestados() {
        return prestados;
    }
    public void setPrestados(int prestados) {
        this.prestados = prestados;
    }
    public boolean prestamo() {
        if (prestados < ejemplares) {
            prestados++;
            return true;
        }
        return false;
    }
    public boolean devolucion() {
        if (prestados > 0) {
            prestados--;
            return true;
        }
        return false;
    }
    @Override
    public String toString() {
        return "Titulo: " + titulo + " ; " + "Autor: " + autor + " ; " + "Ejemplares: " + ejemplares + " ; " + "Prestados: " + prestados;
    }
}
