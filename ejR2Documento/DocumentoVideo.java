package ejR2Documento;

public class DocumentoVideo extends Documento {
  int duracion;
  String resumen;

  public int getDuracion() {
    return duracion;
  }

  public void setDuracion(int d) {
    this.duracion = d;
  }

  public String getresumen() {
    return resumen;
  }

  public void setResumen(String r) {
    this.resumen = r;
  }

  public String documentoVideo() {
    return "Nombre: " + nombre + ".\nTamano: " + tamano + "mb\nDuracion: " + duracion + "\nResumen: " + resumen;
  }
}
