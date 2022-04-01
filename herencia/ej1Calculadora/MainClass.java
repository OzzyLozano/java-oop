package ej1Calculadora;

public class MainClass {
  public static void main(String[] args) {
    Suma s = new Suma();
    System.out.println(s.useSuma(8, 9));

    Resta r = new Resta();
    System.out.println(r.useResta(6, 8));

    Multiplicacion m = new Multiplicacion();
    System.out.println(m.useMultiplicar(3, 7));

    Division d = new Division();
    System.out.println(d.useDivision(7, 3));
  }
}
