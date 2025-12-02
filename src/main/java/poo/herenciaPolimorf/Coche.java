package poo.herenciaPolimorf;

public class Coche extends Vehiculo {

  private int puertas;

  public Coche(String color, boolean motor, int ruedas, int puertas) {
    super(color, motor, ruedas);
    this.puertas = puertas;
  }

  public int getPuertas() {
    return puertas;
  }

  public void setPuertas(int puertas) {
    this.puertas = puertas;
  }

  @Override
  public void girar() {
    System.out.println("Estoy girando el volante.");
  }


}
