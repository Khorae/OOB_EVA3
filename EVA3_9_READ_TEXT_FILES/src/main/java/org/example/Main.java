package org.example;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

/* Files ---> lee todo el archivo y lo carga en la memoria principal (Ram) , por tanto
                  , solo sirve con archivos pequeños*/

public class Main {
    public static void main(String[] args) {
        String ruta = "C:\\archivos\\prueba.txt"; //Windows
        //String ruta = "/archivos/prueba";  //sistemas tipo unix
        try {
            readUsingFiles(ruta);
        } catch (IOException ex) {
            ex.printStackTrace();//imprimir la excepcion
        }
    }
    public static void readUsingFiles(String ruta) throws IOException {
        //recibimos la ruta en formato de texto, la convertimos a formato Path
        Path path = Paths.get(ruta);

        //Usando Lines
        List<String> contenidoArch = Files.readAllLines(path);
        System.out.println(contenidoArch.toString());
        for (int i = 0; i < contenidoArch.size(); i++) {
            System.out.println(contenidoArch.get(i));
        }

        //Usando bytes
        byte [] arreglobytes = Files.readAllBytes(path);
        System.out.println(new String(arreglobytes));
    }
}