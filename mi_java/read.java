import java.io.*;

public class read {
  public void readFile() throws IOException {
    String texto = "";
    try {
      FileReader reader = new FileReader("numbers.txt");
      BufferedReader data = new BufferedReader(reader);
      while ((texto = data.readLine()) != null) {
        System.out.println(texto);
      }
      data.close();
    } catch (Exception e) {
      System.out.println("Archivo no encontrado");
    } finally {
      System.out.println("SIIIIIIIIIIIIU");
    }
  }
}
