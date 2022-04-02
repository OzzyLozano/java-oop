import java.util.Scanner;
import java.util.Random;
import java.io.*;

public class file {
  public static void main(String[] args) throws IOException {
    int maxNum, num;
    Scanner keyboard = new Scanner(System.in);
    Random rand = new Random();
    PrintWriter outputFile = new PrintWriter("numbers.txt");
    System.out.println("numeros a escribir: ");
    maxNum = keyboard.nextInt();
    for (int i = 0; i < maxNum; i++) {
      num = rand.nextInt(-9, 9);
      outputFile.print(num);
    }
    keyboard.close();
    outputFile.close();
    print("SIIIIIIIU ");
    print("SIIIIIIIU");
  }

  private static void print(String a) {
    System.out.print(a);
  }
}
