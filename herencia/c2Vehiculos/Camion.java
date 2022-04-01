package c2Vehiculos;

public class Camion extends Vehiculo {
  public String getCarga(String c) {
    return "Carga (toneladas): " + c;
  }

  public String getCompartimentos(boolean c) {
    if (c == true) {
      return "Compartimentos: Si";
    } else {
      return "Compartimentos: No";
    }
  }
}
