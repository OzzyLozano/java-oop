package ejR4VideoJuego;

public class Guerrero extends Personaje {
  private String Arma;

  public Guerrero(String nombre, String arma, int energia) {
    super(nombre, energia);
    this.Arma = arma;
  }

  public String Combatir(int cantEnergia) {
    Energia -= cantEnergia;
    return "El arma es " + Arma + " y el danio es " + cantEnergia;
  }
}
