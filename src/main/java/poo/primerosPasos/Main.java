package poo.primerosPasos;

public class Main {
  public static void main(String[] args) {

    Avion avion1 = new Avion(70);

    System.out.println(avion1.getNumAsientos());

    avion1.setNumAsientos(-1100);

    System.out.println(avion1.getNumAsientos());

    avion1.despegar();

    avion1.aterrizar();

  }




}
