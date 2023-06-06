package org.example;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Raul");
        persona.setApellidos("Fernandez");
        try {
        persona.setEdad(-1);
        }catch (DatoIncorrectoCheckedException e){
            System.out.println(e.getMessage());
        }
    }
}
class Persona{
    private String nombre;
    private String apellidos;
    private int edad;

    public Persona() {
        this.nombre = "";
        this.apellidos = "";
        this.edad =0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws DatoIncorrectoCheckedException {
        if (edad<0){
            // throw new DatoIncorrectoException(); //UNCHECKED EXCEPTION
            throw new DatoIncorrectoCheckedException(); //CHECKED EXCEPTION
        }
        this.edad = edad;
    }

    public Persona(String nombre, String apellidos, int edad) throws DatoIncorrectoCheckedException {
        this.nombre = nombre;
        this.apellidos = apellidos;
        setEdad(edad);
    }
}
class DatoIncorrectoException extends RuntimeException{
    public DatoIncorrectoException() {
        super("Dato Incorrecto! El valor introducido no puede ser negativo");
    }
}
class DatoIncorrectoCheckedException extends Exception{
    public DatoIncorrectoCheckedException() {
        super("Dato Incorrecto! El valor introducido no puede ser negativo");
    }
}