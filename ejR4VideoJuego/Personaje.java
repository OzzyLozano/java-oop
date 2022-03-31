package ejR4VideoJuego;

public class Personaje {
  String Nombre;
  int Energia;

  public Personaje(String nombre, int energia) {
    super();
    this.Nombre = nombre;
    this.Energia = energia;
  }

  public String getNombre() {
    return Nombre;
  }

  public int getEnergia() {
    return Energia;
  }

  public void alimentarse(int EnergiaNueva) {
    Energia = +EnergiaNueva;
  }

  public void consumirEnergia(int gastoEnergia) {
    Energia -= gastoEnergia;
  }
}
