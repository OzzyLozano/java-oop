public abstract class Poligonos {
  private int num_lados;

  public void Poligono() {
  }

  public int getNumLados() {
    return num_lados;
  }

  public void setNumLados(int nl) {
    this.num_lados = nl;
  }

  @Override
  public String toString() {
    return "Numero de Lados: " + num_lados;
  }

  public abstract double area();
}
