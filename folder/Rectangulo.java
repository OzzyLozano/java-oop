public class Rectangulo extends Poligonos {
  private double lado1;
  private double lado2;

  public Rectangulo(double l1, double l2) {
    super();
    this.lado1 = l1;
    this.lado2 = l2;
  }

  public double getLado1() {
    return lado1;
  }

  public void setLado1(double l1) {
    this.lado1 = l1;
  }

  public double getLado2() {
    return lado2;
  }

  public void setLado2(double l2) {
    this.lado2 = l2;
  }

  @Override
  public String toString() {
    return "Rectangulo " + super.toString() + "\nLado 1:" + lado1 + "\nLado 2:" + lado2;
  }

  @Override
  public double area() {
    return lado1 * lado2;
  }

}
