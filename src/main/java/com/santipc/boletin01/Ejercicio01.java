package com.santipc.boletin01;

public class Ejercicio01 {
  public static void resolver() {
    int a = Entrada.leerEntero("Introduce el primer número: ");
    int b = Entrada.leerEntero("Introduce el segundo número: ");
    int suma = a + b;
    System.out.println("La suma es: " + suma);
    Entrada.cerrar();
  }
}
