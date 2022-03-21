package ejR4VideoJuego;

public class Mago extends Personaje {
  String Poder;

  public Mago(String nombre, String poder, int energia) {
    super(nombre, energia);
    this.Poder = poder;
  }

  public String encantar() {
    Energia -= 2;
    return "El poder del mago es: " + Poder;
  }
}
