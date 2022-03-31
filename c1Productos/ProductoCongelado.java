package c1Productos;

public class ProductoCongelado extends Productos {
  public String getTemperaturaRecomendada(String t) {
    return "Temperatura Recomendada: " + t;
  }

  public String getMetodoCongelacion(String m) {
    return "Metodo de Congelacion: " + m;
  }

  public String getNitrogeno(String n) {
    return "Nitrogeno: " + n;
  }

  public String getOxigeno(String o) {
    return "Oxigeno: " + o;
  }

  public String getDioxido(String d) {
    return "Dioxido de Carbono: " + d;
  }

  public String getVapor(String v) {
    return "Vapor de Agua: " + v;
  }

  public String getSalinidadAgua(String s) {
    return "Salinidad del Agua (gramos de sal por litro): " + s;
  }

  public String getExposicionNitrogeno(String e) {
    return "Exposicion al Nitrogeno (segundos): " + e;
  }

}
