package ejercicios_propios.ej1;

public class Pickaxe extends Tools {
  Tools tool = new Tools();
  public String diamond = "diamond";

  public void setPickaxe() {
    tool.setTool(diamond);
    switchCase(diamond);
  }

  public void switchCase(String a) {
    switch (a) {
      case "wooden":
        tool.setDamage(3);
        tool.setDurability(75);
        break;
      case "stone":
        tool.setDamage(3.5);
        tool.setDurability(165);
        break;
      case "iron":
        tool.setDamage(4);
        tool.setDurability(275);
        break;
      case "gold":
        tool.setDamage(4.5);
        tool.setDurability(67);
        break;
      case "diamond":
        tool.setDamage(5);
        tool.setDurability(1465);
        break;
      case "netherite":
        tool.setDamage(6);
        tool.setDurability(1985);
        break;
      default:
        break;
    }
  }

  public void getPickaxe() {
    System.out.println("Tool damage: " + tool.damage);
    System.out.println("Tool durability: " + tool.durability);
    System.out.println("Tool: " + tool.tool);
  }
}
