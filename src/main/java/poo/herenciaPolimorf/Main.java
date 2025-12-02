package poo.herenciaPolimorf;

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {

    ArrayList<Vehiculo> vehiculos = new ArrayList<>();

    Coche coche1 = new Coche("Rojo", true, 4, 5);
    Moto moto1 = new Moto("Azul", true,  2);
    Moto moto2 = new Moto("Negro", true,2, true);
    Conductor conductor = new Conductor(47, "Pablo");

    vehiculos.add(coche1);
    vehiculos.add(moto1);
    vehiculos.add(moto2);

    /*
    for(Vehiculo vehiculo: vehiculos) {

      vehiculo.girar();
    }
    */

    for(Vehiculo vehiculo: vehiculos) {
      conductor.addVehiculo(vehiculo);
      vehiculo.setConductor(conductor);
      vehiculo.getConductor();
      System.out.println(vehiculo.getConductor().getNombre());
    }



  }
}
