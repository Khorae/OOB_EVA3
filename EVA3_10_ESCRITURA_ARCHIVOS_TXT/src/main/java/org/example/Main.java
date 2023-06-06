package org.example;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
       String ruta = "c:\\archivos\\";
        try {
            writeUsingFiles(ruta,"Prueba de escritura de archivos usando CLASE FILES");
            writeUsingFileWriter(ruta,"Prueba de escritura usando CLASE FileWriter");
            writeUsingBufferedWriter(ruta,"Prueba de escritura usadndo CLASE BufferedWriter");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void writeUsingFiles(String ruta, String datos) throws IOException {
        Path path = Paths.get(ruta + "archivoFiles.txt");
        Files.write(path,datos.getBytes());
    }
    public static void writeUsingFileWriter(String ruta, String datos) throws IOException {
        File file = new File(ruta + "archivoFileWriter.txt");
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write(datos);
        fileWriter.close();
    }
    public static void writeUsingBufferedWriter(String ruta, String datos) throws IOException {
        Path path = Paths.get(ruta + "archivoBufferedWriter.txt");
        OutputStream out = Files.newOutputStream(path);
        OutputStreamWriter osWriter = new OutputStreamWriter(out);
        BufferedWriter bufferedWriter = new BufferedWriter(osWriter);
        for (int i = 0; i < 10; i++) {//Escribimos 10 lineas al archivo
            bufferedWriter.write((i+1) + ".- " + datos);
            bufferedWriter.write("\n");
        }
        bufferedWriter.close();
        osWriter.close();
    }
}