package ejercicios_propios.ej1;

public class Axe extends Tools {
  Tools tool = new Tools();
  public String material = "netherite";

  public void setAxe() {
    tool.setTool(material);
    switchCase(material);
  }

  public void switchCase(String a) {
    switch (a) {
      case "wooden":
        tool.setDamage(6.5);
        tool.setDurability(75);
        break;
      case "stone":
        tool.setDamage(7);
        tool.setDurability(165);
        break;
      case "iron":
        tool.setDamage(7.5);
        tool.setDurability(275);
        break;
      case "gold":
        tool.setDamage(8);
        tool.setDurability(67);
        break;
      case "diamond":
        tool.setDamage(9);
        tool.setDurability(1465);
        break;
      case "netherite":
        tool.setDamage(10);
        tool.setDurability(1985);
        break;
      default:
        break;
    }
  }

  public void getAxe() {
    System.out.println("Axe");
    System.out.println("Damage: " + tool.damage);
    System.out.println("Durability: " + tool.durability);
    System.out.println("Material: " + tool.tool);
  }
}
