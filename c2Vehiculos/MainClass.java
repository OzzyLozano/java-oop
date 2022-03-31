package c2Vehiculos;

public class MainClass {
  public static void main(String[] args) {
    Autobus autobus = new Autobus();
    System.out.println(autobus.getMarca("Nissan"));
    System.out.println(autobus.getPatente("[patente de nissan]"));
    System.out.println(autobus.getAsientos("9"));

    Camion camion = new Camion();
    System.out.println(camion.getMarca("Honda"));
    System.out.println(camion.getPatente("[patente de honda]"));
    System.out.println(camion.getCarga("2.3t"));
    System.out.println(camion.getCompartimentos(false));
  }
}
