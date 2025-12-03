package poo.boletin01.Ejercicio01;

public class Cuenta {
  // Atributos
  private String titular;
  private double cantidad;

  // Constructor 1: solo con titular (cantidad es opcional → se pone a 0)
  public Cuenta(String titular) {
    this.titular = titular;
    this.cantidad = 0.0;
  }

  // Constructor 2: con titular y cantidad (cantidad opcional, pero se permite darla)
  public Cuenta(String titular, double cantidad) {
    this.titular = titular;
    // Si la cantidad inicial es negativa, ¿qué hacemos?
    // El enunciado no lo dice para el constructor, pero por lógica,
    // y como en "ingresar" se ignora lo negativo, asumimos que aquí
    // se acepta cualquier valor (o podríamos poner 0 si es negativo).
    // Pero como no se especifica, lo asignamos directamente.
    this.cantidad = cantidad;
  }

  // Getters
  public String getTitular() {
    return titular;
  }

  public double getCantidad() {
    return cantidad;
  }

  // Setters
  public void setTitular(String titular) {
    this.titular = titular;
  }

  public void setCantidad(double cantidad) {
    this.cantidad = cantidad;
  }

  // Metodo toString
  @Override
  public String toString() {
    return "Cuenta{" +
        "titular='" + titular + '\'' +
        ", cantidad=" + cantidad +
        '}';
  }

  // Metodo ingresar
  public void ingresar(double cantidad) {
    if (cantidad > 0) {  // solo se ingresa si es positiva
      this.cantidad += cantidad;
    }
    // Si es negativa o cero, no se hace nada
  }

  // Metodo retirar
  public void retirar(double cantidad) {
    if (cantidad > this.cantidad) {
      this.cantidad = 0;
    } else {
      this.cantidad -= cantidad;
    }
  }
}
