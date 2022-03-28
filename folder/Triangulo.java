public class Triangulo extends Poligonos {
  private double lado1;
  private double lado2;
  private double lado3;

  public Triangulo(double l1, double l2, double l3) {
    super();
    this.lado1 = l1;
    this.lado2 = l2;
    this.lado3 = l3;
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

  public double getLado3() {
    return lado3;
  }

  public void setLado3(double l3) {
    this.lado3 = l3;
  }

  @Override
  public String toString() {
    return "Triangulo " + super.toString() + "\nLado 1:" + lado1 + "\nLado 2:" + lado2 + "\nLado 3:" + lado3;
  }

  @Override
  public double area() {
    double p = (lado1 + lado2 + lado3) / 2;
    return Math.sqrt(p * (p - lado1) * (p - lado2) * (p - lado3));
  }

}
