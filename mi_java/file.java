import java.util.Scanner;
import java.util.Random;
import java.io.*;

// C:\\Users\\ozzyl\\java\\numbers.txt

public class file {
  public static String ruta;

  public static void main(String[] args) throws IOException {
    int maxNum, num;
    Scanner keyboard = new Scanner(System.in);
    Random rand = new Random();
    PrintWriter outputFile = new PrintWriter("numbers.txt");
    System.out.println("numeros a escribir: ");
    maxNum = keyboard.nextInt();

    for (int i = 0; i < maxNum; i++) {
      num = rand.nextInt(-9, 9);
      outputFile.println(num);
    }

    keyboard.close();
    outputFile.close();

    read readPls = new read();
    readPls.readFile();
  }
}
