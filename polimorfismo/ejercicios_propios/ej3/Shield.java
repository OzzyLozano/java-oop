package ejercicios_propios.ej3;

public class Shield extends abstractClass {
  int lvl;
  int shield;
  int upgrade_points;

  public void shield() {
    switch (lvl) {
      case 1:
        shield = 50;
        upgrade_points += 150;
        break;
      case 2:
        shield = 100;
        upgrade_points += 300;
        break;
      case 3:
        shield = 150;
        upgrade_points += 750;
        break;
      case 4:
        shield = 200;
        upgrade_points = 0;
        break;

      default:
        break;
    }
  }

  public int updateUpgradePts(int damage) {
    upgrade_points = upgrade_points - damage;
    if (upgrade_points <= 0) {
      upgradeShield();
    }
    return upgrade_points;
  }

  public void upgradeShield() {
    shield += 1;
    shield();
  }

  @Override
  public String useAbility() {
    return null;
  }

}
