package poo.boletin01.Ejercicio06;

/*
Modifica la clase Satélite y añádele los siguientes métodos:
• Metodo void variaAltura(double desplazamiento): Este metodo acepta un parámetro que será
positivo o negativo dependiendo de si el satélite tiene que alejarse o acercarse a La Tierra.
• Metodo boolean enOrbita(): Este metodo devolverá false si el satélite está en tierra, y true en
caso contrario.
• Metodo void variaPosicion(double variap, double variam): Este metodo permite modificar los
atributos de posición (meridiano y paralelo) mediante los parámetros variap y variam. Estos
parámetros serán valores positivos o negativos relativos que harán al satélite modificar su
posición.
 */



public class Satelite {

  private double meridiano;
  private double paralelo;
  private double distancia_tierra;

  Satelite(double m, double p, double d) {
    meridiano = m;
    paralelo = p;
    distancia_tierra = d;
  }

  Satelite() {
    meridiano = paralelo = distancia_tierra = 0;
  }

  public void setPosicion(double m, double p, double d) {
    meridiano = m;
    paralelo = p;
    distancia_tierra = d;
  }

  public double getMeridiano() {
    return meridiano;
  }

  public void setMeridiano(double meridiano) {
    this.meridiano = meridiano;
  }

  public double getParalelo() {
    return paralelo;
  }

  public void setParalelo(double paralelo) {
    this.paralelo = paralelo;
  }

  public double getDistancia_tierra() {
    return distancia_tierra;
  }

  public void setDistancia_tierra(double distancia_tierra) {
    this.distancia_tierra = distancia_tierra;
  }

  public void printPosicion() {

    System.out.println("El satélite se encuentra en el paralelo" + paralelo + " Meridiano " + meridiano
      + " a una distacia de la Tierra de " + distancia_tierra + " Kilómetros");

  }

  public void variaAltura(double desplazamiento) {

      setDistancia_tierra(getDistancia_tierra() + desplazamiento);

  }

  public boolean enOrbita() {

    if (distancia_tierra > 0) {
      return true;
    }

    return false;
  }
  /*
  public boolean enOrbita() {
    return distancia_tierra > 0;
  }
  */
  public void variaPosicion(double variap, double variam) {

    paralelo = paralelo + variap;
    meridiano = meridiano + variam;
    //paralelo += variap;
    //meridiano += variam;

  }


}
