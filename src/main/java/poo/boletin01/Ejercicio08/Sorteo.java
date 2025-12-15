package poo.boletin01.Ejercicio08;

  /*
  Crear la clase dado, la cual desciende de la clase sorteo. La clase dado, en la llamada lanzar()
  mostrará un número aleatorio del 1 al 6.
  • Crear la clase moneda, la cual desciende de la clase sorteo. Esta clase en la llamada al
  metodo lanzar()mostrará las palabras cara o cruz
   */


public abstract class Sorteo {


  protected int posibilidades;

  public abstract int lanzar();

}
