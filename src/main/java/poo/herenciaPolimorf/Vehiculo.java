package poo.herenciaPolimorf;

public abstract class Vehiculo {
  private int ruedas;
  private boolean motor;
  private String color;
  private Conductor conductor;

  public Vehiculo(String color, boolean motor, int ruedas) {
    this.color = color;
    this.motor = motor;
    this.ruedas = ruedas;
  }

  public int getRuedas() {
    return ruedas;
  }

  public void setRuedas(int ruedas) {
    this.ruedas = ruedas;
  }

  public boolean isMotor() {
    return motor;
  }

  public void setMotor(boolean motor) {
    this.motor = motor;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public Conductor getConductor() {
    return conductor;
  }

  public void setConductor(Conductor conductor) {
    this.conductor = conductor;
  }


  public void girar() {

  }


}
