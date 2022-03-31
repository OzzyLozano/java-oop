package c1Productos;

public class ProductoRefrigerado extends Productos {
  public String getCodigoSupervision(String csa) {
    return "Codigo Supervision Alimentaria: " + csa;
  }

  public String getTemperaturaRecomendada(String t) {
    return "Temperatura Recomendada: " + t;
  }

}
