package c3Documento;

public class DocTexto extends Documento {
  public String getCodificacion(String c) {
    return "Codificacion: " + c;
  }

  public String getCantPalabras(int c) {
    return "Palabras: " + c;
  }

  public String getCantParrafos(int c) {
    return "Parrafos: " + c;
  }
}
