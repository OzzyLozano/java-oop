package ejercicios_propios.ej3;

public class Character extends Shield {
  int health = 100;

  public void updateHealth(int damage) {
    health -= damage;
  }

  @Override
  public String useAbility() {
    return null;
  }
}
