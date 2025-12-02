package poo.herenciaPolimorf;

public class Moto extends Vehiculo {

  private boolean manillar = true;

  public Moto(String color, boolean motor, int ruedas) {
    super(color, motor, ruedas);
  }

  public Moto(String color, boolean motor, int ruedas, boolean manillar) {
    super(color, motor, ruedas);
    this.manillar = manillar;
  }

  public boolean isManillar() {
    return manillar;
  }

  public void setManillar(boolean manillar) {
    this.manillar = manillar;
  }


  @Override
  public void girar() {

    if(manillar) {
      System.out.println("Estoy girando la moto.");
    }

  }

}


