package c3Documento;

public class DocVideo extends Documento {
  public String getDuracion(int d) {
    return "Duracion (minutos) : " + d;
  }

  public String getResumen(String r) {
    return "Resumen: " + r;
  }
}
