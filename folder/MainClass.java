import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {
  static Scanner sc = new Scanner(System.in);
  static ArrayList<Poligonos> poligonos = new ArrayList();

  public static void main(String[] args) {
    leerPoligonos();
    mostrarPoligonos();
  }

  public static void leerPoligonos() {
    int tipo;
    do {
      do {
        println("Tipo de poligono 1-> Rectangulo 2-> Triangulo 0-> FIN >>> ");
        tipo = sc.nextInt();
      } while (tipo < 0 || tipo > 2);
      if (tipo != 0) {
        switch (tipo) {
          case 1:
            leerRectangulo();
            break;
          case 2:
            leerTriangulo();
            break;
        }
      }
    } while (tipo != 0);
  }

  public static void leerRectangulo() {
    double l1, l2;
    println("Introduzca datos del Rectángulo");
    do {
      println("Longitud del lado 1: ");
      l1 = sc.nextDouble();
    } while (l1 <= 0);
    do {
      println("Longitud del lado 2: ");
      l2 = sc.nextDouble();
    } while (l2 <= 0);
    Rectangulo r = new Rectangulo(l1, l2);
    poligonos.add(r);
  }

  public static void leerTriangulo() {
    double l1, l2, l3;
    println("Introduzca datos del Triangulo");
    do {
      println("Longitud del lado 1: ");
      l1 = sc.nextDouble();
    } while (l1 <= 0);
    do {
      println("Longitud del lado 2: ");
      l2 = sc.nextDouble();
    } while (l2 <= 0);
    do {
      println("Longitud del lado 3: ");
      l3 = sc.nextDouble();
    } while (l3 <= 0);
    Triangulo t = new Triangulo(l1, l2, l3);
    poligonos.add(t);
  }

  public static void mostrarPoligonos() {
    for (Poligonos p : poligonos) {
      println(p.toString());
      System.out.printf(" area: %.2f %n", p.area());
    }
  }

  private static void println(String s) {
    System.out.println(s);
  }

}
