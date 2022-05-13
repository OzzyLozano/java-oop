public class throows {
  static int b = 12, c = 12, result;

  public static void funcion(int a) {
    try {
      System.out.println("hi");
      result = a / (b - c);
      System.out.println("resutl: " + result);
    } catch (ArithmeticException e) {
      System.out.println("can't divide by zero");
    } finally {
      System.out.println("done");
    }
  }

  public static void main(String[] args) {
    int a = 22000;
    funcion(a);
  }
}
