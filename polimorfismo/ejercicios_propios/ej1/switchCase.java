package ejercicios_propios.ej1;

public class switchCase extends Tools {
  Tools tool = new Tools();

  public void useSwitch(String a, double b) {
    switch (a) {
      case "wooden":
        tool.setDamage(b);
        tool.setDurability(75);
        break;
      case "stone":
        tool.setDamage(b + 1);
        tool.setDurability(165);
        break;
      case "iron":
        tool.setDamage(b + 2);
        tool.setDurability(275);
        break;
      case "gold":
        tool.setDamage(b + 1.5);
        tool.setDurability(67);
        break;
      case "diamond":
        tool.setDamage(b + 3);
        tool.setDurability(1465);
        break;
      case "netherite":
        tool.setDamage(b + 4);
        tool.setDurability(2106);
        break;
      default:
        System.out.println("Material doesn't match");
        break;
    }
  }
}
