/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenlabprogramacion;

/**
 *
 * @author trigo
 */
import java.util.*;

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
                        
                        if (letra >= 'a' && letra <= 'z'){
                            char original = 'a';
                            char opuesta = 'z';
                            while (original <= 'z'){
                                if (letra == original){
                                    nueva = opuesta;
                                    break;
                                }
                                original++;
                                opuesta--;
                            }    
                        }
                        
                        else if (letra >= 'A' && letra <= 'Z'){
                            char original = 'A';
                            char opuesta = 'Z';
                            while (original <= 'Z'){
                                if (letra == original){
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
                    
  
            }
        }while (opcion != 5);
    }

}
