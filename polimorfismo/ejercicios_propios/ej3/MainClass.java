package ejercicios_propios.ej3;

public class MainClass {
  public static void main(String[] args) {
    Wraith wraith = new Wraith();
    Wattson wattson = new Wattson();
    Lifeline lifeline = new Lifeline();

    System.out.println(wraith.useAbility());
    System.out.println(wattson.useAbility());
    System.out.println(lifeline.useAbility());

    lifeline.setShieldLvl(1);
    System.out.println("Lifeline\n\thealth: " + lifeline.health +
        "\n\tshield lvl: " + lifeline.shield +
        "\n\tshield points: " + lifeline.upgrade_points);
  }
}
