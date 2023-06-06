package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x, y;
        do {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Introduce el valor de x (numero entero): ");
                x = sc.nextInt();
                System.out.println("Introduce el valor de y (numero entero): ");
                y = sc.nextInt();
                int resu = x / y;
                System.out.println("Resultado de: " + x + "/" + y + " : " + resu);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Captura en formato incorrecto, no se puede convertir en un numero");
            } catch (ArithmeticException e) {
                System.out.println("No se puede dividir entre cero");
            }
        }while (true);
        System.out.println("");
        System.out.println("Programa terminado exitosamente");
    }
}