/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab.ifelse.pkg2;

import java.util.Scanner;

public class LabIfElse2 {

    public static void main(String[] args) {
        // Ejercicio 1
        Scanner teclado = new Scanner(System.in);
        System.out.println("=== Ejercicio 1 ===");
        System.out.print("Escribe tu edad para comprobar si sos mayor/menor de edad: ");
        int edad = teclado.nextInt();
        if (edad >= 18) {
            System.out.println("Eres mayor de edad, Edad: " + edad);
        } else {
            System.out.println("Eres menor de edad, Edad: " + edad);
        } 
        
        // Ejercicio 2
        System.out.println("=== Ejercicio 2 ===");
        String Contrasenia = "Contrasenia777";
        
        System.out.print("Escribe la contrasenia de la cuenta: ");
        String ponercontra = teclado.next();
        if (Contrasenia.equalsIgnoreCase(ponercontra)) {
            System.out.println("La contrasenia es correcta!");
        } else {
            System.out.println("La contrasenia es incorrecta¡");
        }
        
        //Ejercicio 3
        System.out.println("=== Ejercicio 3 ===");
        System.out.print("Pon un numero para dividir: ");
        double num1 = teclado.nextInt();
        System.out.print("Pon el segundo numero para terminar la division: ");
        double num2 = teclado.nextInt();
        double resultado = num1 / num2;
        System.out.println("El resultado es= " + resultado);
        
        //Ejercicio 4
        System.out.println("=== Ejercicio 4 ===");
        System.out.print("Pon tu edad saber si tenes que atributar con tus ingresos: ");
        int edad2 = teclado.nextInt();
        if (edad2 >= 18) {
            System.out.print("Eres mayor de edad, ahora ingresa cuanto son tus ingresos mensuales: ");
            int ingreso = teclado.nextInt();
            if (ingreso >= 1000){
                System.out.println("Tenes que pagar atributos con tus ingresos");
            } else {
                System.out.println("No debes de pagar atributos con tus ingresos");
            }
        } else {
            System.out.println("No tienes que atributar, eres menor de edad");
        }
        //Ejercicio 5
        double puntuacion;
        String nivel;
        System.out.print("Ingresa tu puntuacion de trabajo; ");
        puntuacion = teclado.nextDouble();
        if (puntuacion == 0.0){
            nivel = "Inaceptable";
        } else if (puntuacion == 0.4){
            nivel = "Aceptable";
        } else if (puntuacion >= 0.6){
            nivel = "Meritorio";
        } else {
            System.out.println("Puntuacion invalida");
            return;
        }
        double dinero = 2400 * puntuacion;
        System.out.println("Nivel de rendimiento en el trabajo: " + nivel);
        System.out.println("Dinero que vas a recibir: $" + dinero);
        
        //Ejercicio 6
        System.out.println("=== Ejercicio 6 ===");
        int edad3;
        int precio;
        
        System.out.print("Ingresa tu edad: ");
        edad3 = teclado.nextInt();
        if (edad3 < 4) {
            precio = 0;
        } else if (edad3 <= 18){
            precio = 5;
        } else {
            precio = 10;
        }
        System.out.println("El precio de la entrada es de: $" + precio);
        
        //Ejercicio 7
        System.out.println("=== Ejercicio 7 ===");
        int opcion;
        int ingrediente;
        String tipoDePizza = "";
        String ingredienteElegido = "";
        System.out.println("¿Desea una pizza vegetariana?");
        System.out.println("1. Si");
        System.out.println("2. No");
        opcion = teclado.nextInt();
        if (opcion == 1) {
            tipoDePizza = "Vegetariana";
            System.out.println("Ingredientes disponibles: ");
            System.out.println("1. Pimiento");
            System.out.println("2. Tofu");
            ingrediente = teclado.nextInt();
            if (ingrediente == 1) {
                ingredienteElegido = "Pimiento";
            } else if (ingrediente == 2) {
                ingredienteElegido = "Tofu";
            } else {
                System.out.println("Opcion invalida");
                return;
            }
        } else if (opcion == 2) {
            tipoDePizza = "No vegetariana";
            System.out.println("Ingredientes disponibles: ");
            System.out.println("1. Peperoni");
            System.out.println("2. Jamon");
            System.out.println("3. Salmon");
            ingrediente = teclado.nextInt();
            if (ingrediente == 1) {
                ingredienteElegido = "Peperoni";
            } else if (ingrediente == 2){
                ingredienteElegido = "Jamon";
            } else if (ingrediente == 3){
                ingredienteElegido = "Salmon";
            } else {
                System.out.println("Ingrediente desconocido");
                return;
            }
        } else {
            System.out.println("Ingrediente desconocido");
            return;
        }
        System.out.println("Pizza elegida: " + tipoDePizza);
        System.out.println("Ingredientes: Mozzarella, Tomate, " + ingredienteElegido);
    }
    
}
