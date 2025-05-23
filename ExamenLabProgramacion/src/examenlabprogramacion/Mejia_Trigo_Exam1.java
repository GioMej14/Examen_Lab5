/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenlabprogramacion;

/**
 *
 * @author trigo
 */
import java.util.Scanner;
import java.util.Random;

public class Mejia_Trigo_Exam1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        input.useDelimiter("\n");

        int opcion;

        do {

            System.out.println("**** MENÚ PRINCIPAL****");
            System.out.println("1. Piramide");
            System.out.println("2. Clave");
            System.out.println("3. Juego de piedra, papel, y tijera");
            System.out.println("4. Adivinar");
            System.out.println("5. Salir del programa");
            System.out.print("Seleccione una opción: ");
            opcion = input.nextInt();

            switch (opcion) {
                case 1:
                    int filas;
                    do {
                        System.out.print("Cantidad de fila de la pirámide: ");
                        while (!input.hasNextInt()) {
                            System.out.print("Por favor, introduce un número entero positivo: ");
                            input.next();
                        }
                        filas = input.nextInt();
                    } while (filas <= 0);

                    int numeroImpar = 1;

                    for (int contador = 1; contador <= filas; contador++) {
                        int suma = 0;
                        for (int contar = 0; contar < contador; contar++) {
                            System.out.print(numeroImpar + " ");
                            suma += numeroImpar;
                            numeroImpar += 2;
                        }
                        System.out.println(" = " + suma);
                    }
                    break;
                case 2:
                    System.out.print("Ingrese el mensaje a cifrar o descifrar: ");
                    String mensaje = input.next();

                    String resultado = "";

                    for (int contador = 0; contador < mensaje.length(); contador++) {
                        char letra = mensaje.charAt(contador);
                        char nueva = letra;

                        if (letra >= 'a' && letra <= 'z') {
                            char original = 'a';
                            char opuesta = 'z';
                            while (original <= 'z') {
                                if (letra == original) {
                                    nueva = opuesta;
                                    break;
                                }
                                original++;
                                opuesta--;
                            }
                        } else if (letra >= 'A' && letra <= 'Z') {
                            char original = 'A';
                            char opuesta = 'Z';
                            while (original <= 'Z') {
                                if (letra == original) {
                                    nueva = opuesta;
                                    break;
                                }
                                original++;
                                opuesta--;
                            }
                        }

                        resultado += nueva;
                    }

                    System.out.println("Resultado: " + resultado);
                    break;
                case 3:
                    String jugarDeNuevo;

                    System.out.println("¡Bienvenido al juego piedra, papel o tijera!");

                    do {
                        String eleccionDelUsuario = "";
                        boolean entradaValida = false;

                        while (!entradaValida) {
                            System.out.print("Elije piedra, papel o tijera: ");
                            eleccionDelUsuario = input.next();

                            if ((eleccionDelUsuario.length() == 6
                                    && eleccionDelUsuario.charAt(0) == 'p'
                                    && eleccionDelUsuario.charAt(1) == 'i'
                                    && eleccionDelUsuario.charAt(2) == 'e'
                                    && eleccionDelUsuario.charAt(3) == 'd'
                                    && eleccionDelUsuario.charAt(4) == 'r'
                                    && eleccionDelUsuario.charAt(5) == 'a') || 
                                    
                                    (eleccionDelUsuario.length() == 5
                                    && eleccionDelUsuario.charAt(0) == 'p'
                                    && eleccionDelUsuario.charAt(1) == 'a'
                                    && eleccionDelUsuario.charAt(2) == 'p'
                                    && eleccionDelUsuario.charAt(3) == 'e'
                                    && eleccionDelUsuario.charAt(4) == 'l') || 
                                    
                                    (eleccionDelUsuario.length() == 6
                                    && eleccionDelUsuario.charAt(0) == 't'
                                    && eleccionDelUsuario.charAt(1) == 'i'
                                    && eleccionDelUsuario.charAt(2) == 'j'
                                    && eleccionDelUsuario.charAt(3) == 'e'
                                    && eleccionDelUsuario.charAt(4) == 'r'
                                    && eleccionDelUsuario.charAt(5) == 'a')) {

                                entradaValida = true;

                            } else {
                                System.out.println("Entrada inválida. Inténtalo de nuevo.");
                            }
                        }


                        int eleccionComputadoraNum = random.nextInt(3);
                        String eleccionComputadora = "";
                        if (eleccionComputadoraNum == 0) {
                            eleccionComputadora = "piedra";
                        } else if (eleccionComputadoraNum == 1) {
                            eleccionComputadora = "papel";
                        } else {
                            eleccionComputadora = "tijera";
                        }

                        System.out.println("La computadora eligió: " + eleccionComputadora);

   
                        boolean empate = false;
                        if (eleccionDelUsuario.length() == eleccionComputadora.length()) {
                            boolean iguales = true;
                            for (int i = 0; i < eleccionDelUsuario.length(); i++) {
                                if (eleccionDelUsuario.charAt(i) != eleccionComputadora.charAt(i)) {
                                    iguales = false;
                                    break;
                                }
                            }
                            if (iguales) {
                                empate = true;
                            }
                        }


                        if (empate) {
                            System.out.println("¡Es un empate!");
                        } else if ((eleccionDelUsuario.length() == 6 && eleccionDelUsuario.charAt(0) == 'p' && eleccionComputadora == "tijera")
                                || 
                                (eleccionDelUsuario.length() == 5 && eleccionDelUsuario.charAt(0) == 'p' && eleccionComputadora == "piedra")
                                ||
                                (eleccionDelUsuario.length() == 6 && eleccionDelUsuario.charAt(0) == 't' && eleccionComputadora == "papel") 
                                ) {
                            System.out.println("¡Ganaste esta ronda!");
                        } else {
                            System.out.println("La computadora gana esta ronda.");
                        }

                        System.out.print("¿Desea jugar otra ronda? (si/no): ");
                        jugarDeNuevo = input.next();

                    } while (jugarDeNuevo.length() == 2
                            && jugarDeNuevo.charAt(0) == 's'
                            && jugarDeNuevo.charAt(1) == 'i');

                    System.out.println("Gracias por jugar. ¡Hasta la próxima!");
                    break;
                case 4:
                    int numeroSecreto = random.nextInt(100) +1;
                    int intentos = 0;
                    int numeroIngresado = 0;
                    boolean acertado = false;
                    
                    System.out.println("¡Bienvenido al juego del número secreto!");
                    System.out.println("Cuentas con 10 intentos para adivinar un número entre 1 y 100");
                    
                    while (intentos < 10 && !acertado) {
                        System.out.println("Intento " + (intentos + 1) + ": Ingrese un número: ");
                        numeroIngresado  = input.nextInt();
                        intentos++;
                        
                        if (numeroIngresado == numeroSecreto) {
                            acertado = true; 
                            System.out.println("¡Correcto! Adivinaste el número en " + intentos + " intento(s)");
                        } else if (numeroIngresado < numeroSecreto){
                            System.out.println("El número secreto es mayor.");
                        } else {
                            System.out.println("El número secreto es menor.");
                        }
                    }
                    
                    if (!acertado) {
                        System.out.println("¡Se acabarón los intentos, el número secreto era " + numeroSecreto);
                    }
                    
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción invalida, intetelo de nuevo.");    
            }
        } while (opcion != 5);

    }

}
