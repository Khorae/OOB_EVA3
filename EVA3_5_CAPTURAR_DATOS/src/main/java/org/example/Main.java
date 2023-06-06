package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int valor;
        do {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Introduce un valor (Numero entero): ");
                valor = sc.nextInt();
                break;
            }catch (InputMismatchException e){
                System.out.println("El valor es erroneo, no se puede convertir a entero");
            }
        }while (true);
        System.out.println("El valor capturado es: " + valor);
    }
}