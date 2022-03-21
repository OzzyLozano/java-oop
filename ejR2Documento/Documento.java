package ejR2Documento;

public class Documento {
  String nombre;
  int tamano;

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String Nombre) {
    this.nombre = Nombre;
  }

  public int getTamano() {
    return tamano;
  }

  public void setTamano(int Tamano) {
    this.tamano = Tamano;
  }

  public String documento() {
    return "Nombre del Documento: " + nombre + ".\nTamano: " + tamano + "kb.";
  }
}
