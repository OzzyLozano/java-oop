import java.util.Scanner;

public class unidimensional {
  public static void main(String[] args) {
    String[] list = { "ozzy", "adita", "naila", "betsa" };
    print("Do you want to see the names list? [0 : yes]");
    Scanner keyboard = new Scanner(System.in);
    int answer = keyboard.nextInt();
    keyboard.close();
    if (answer == 0) {
      for (int i = 0; i < list.length; i++) {
        print(list[i]);
      }
    }
  }

  private static void print(String x) {
    System.out.println(x);
  }
}
