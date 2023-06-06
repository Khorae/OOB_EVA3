package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //ARITMETIC EXCEPTION: DIVISION ENTRE CERO
        /*System.out.println("INICIANDO EL PROGRAMA...");
        System.out.println("DECLARANDO VARIABLES...");
        int x = 5, y=0;
        System.out.println("INTENTANDO LA DIVISION...");
        int resu = x/y; // AQUI SE GENRA LE EXCEPCION, SI NO SE ATIENDE, EL PROGRAMA TERMINA
        System.out.println("Resultado: " + resu); //YA NO SE EJECUTA*/

        //INPUTMISMATCH EXCEPTION
        /*Scanner input = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int num = input.nextInt(); // si el usuario camptura una cadena que no puede convertirse a numero, se produce la excepcopm y termina el programa
        System.out.println("El numero es: " + num);*/

        //ARRAYINDEXOUTOFBOUNDS EXCEPTION
        int[] array = new int[5]; // arreglo con 5 posiciones
        array[0] = 100;
        array[1] = 200;
        array[2] = 300;
        array[3] = 400;
        array[4] = 500;
        array[5] = 600;// <-- 5 no es un indice valido, el arreglo va de 0 a 4

    }
}