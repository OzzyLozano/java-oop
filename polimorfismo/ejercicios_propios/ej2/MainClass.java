package ejercicios_propios.ej2;

public class MainClass {
  public static void main(String[] args) {
    PC pc = new PC();
    println(pc.turnOn());

    Oven oven = new Oven();
    println(oven.turnOn());

    Car car = new Car();
    println(car.turnOn());
  }

  private static void println(String string) {
    System.out.println(string);
  }
}
