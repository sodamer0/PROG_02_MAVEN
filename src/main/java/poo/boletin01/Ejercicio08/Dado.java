package poo.boletin01.Ejercicio08;

import java.util.Random;

public class Dado extends Sorteo {

  private Random numRandom = new Random();

  public Dado() {
    posibilidades = 6;
  }
// Constructor sin parámetros, el atributo posibilidades es el número de resultados posibles:
// si fuese la clase moneda sería posibilidades = 2


  @Override
  public int lanzar() {

    int resultado = numRandom.nextInt(posibilidades) + 1;

    return resultado;
  }

}
