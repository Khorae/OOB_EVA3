package org.example;

public class Main {
    public static void main(String[] args) {
      int x=5,y=1;
      try {
          int resu = x/y;
      } catch (ArithmeticException e){
          System.out.println(e.getMessage());
      } finally {
          System.out.println("SIEMPRE ME EJECUTO");
      }
    }
}