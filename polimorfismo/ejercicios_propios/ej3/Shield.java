package ejercicios_propios.ej3;

public class Shield extends abstractClass {
  int shield_lvl;
  int shield;
  int upgrade_points;

  public int getShieldLvl() {
    return upgrade_points;
  }

  public void setShieldLvl(int s) {
    shield = s;
  }

  public void shield() {
    switch (shield_lvl) {
      case 1:
        shield = 50;
        upgrade_points = 150;
        break;
      case 2:
        shield = 100;
        upgrade_points = 300;
        break;
      case 3:
        shield = 150;
        upgrade_points = 750;
        break;
      case 4:
        shield = 200;
        upgrade_points = 0;
        break;

      default:
        break;
    }
  }

  public int updateUpgradePts(int damage_done) {
    upgrade_points = upgrade_points - damage_done;
    if (upgrade_points <= 0) {
      upgradeShield();
    }
    return upgrade_points;
  }

  public void upgradeShield() {
    shield_lvl += 1;
    shield();
  }

  @Override
  public String useAbility() {
    return null;
  }

}
