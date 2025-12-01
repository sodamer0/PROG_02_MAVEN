package com.santipc.boletin01;

import java.util.Scanner;

public class Entrada {
  private static final Scanner scanner = new Scanner(System.in);

  public static int leerEntero(String mensaje) {
    System.out.print(mensaje);
    return scanner.nextInt();
  }

  public static void cerrar() {
    scanner.close();
  }
}
