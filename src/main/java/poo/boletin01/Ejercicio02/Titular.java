package poo.boletin01.Ejercicio02;

import java.time.LocalDate;

public class Titular {

  private String nombre;
  private LocalDate fecha_nacimiento;
  private String dni;
  private static final String SEXO = "mujer";
  private String sexo;
  private String direccion;


  public Titular(String nombre) {
    this.nombre = nombre;
    this.fecha_nacimiento = null;
    this.dni = "";
    this.sexo = SEXO;
    this.direccion = "";

  }

  public Titular(String nombre, LocalDate fecha_nacimiento, String sexo) {
    this.nombre = nombre;
    this.fecha_nacimiento = fecha_nacimiento;
    this.dni ="";
    this.sexo = sexo;
    this.direccion = "";
  }

  public Titular(String nombre, LocalDate fecha_nacimiento, String dni, String sexo, String direccion) {
    this.nombre = nombre;
    this.fecha_nacimiento = fecha_nacimiento;
    this.dni = dni;
    this.sexo = sexo;
    this.direccion = direccion;
  }

  public String getDireccion() {
    return direccion;
  }

  public void setDireccion(String direccion) {
    this.direccion = direccion;
  }

  public String getSexo() {
    return sexo;
  }

  public void setSexo(String sexo) {
    this.sexo = sexo;
  }

  public String getDni() {
    return dni;
  }

  public void setDni(String dni) {
    this.dni = dni;
  }

  public LocalDate getFecha_nacimiento() {
    return fecha_nacimiento;
  }

  public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
    this.fecha_nacimiento = fecha_nacimiento;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public boolean esMayorDeEdad(LocalDate fecha_nacimiento) {
    LocalDate fecha_hoy = LocalDate.now();
    LocalDate fecha_limite = fecha_hoy.minusYears(18);
    if(fecha_nacimiento.isBefore(fecha_hoy)) {

    }
  }



}
