package ejercicios_propios.ej1;

public class Pickaxe extends Tools {
  Tools tool = new Tools();
  public String material = "diamond";

  public void setPickaxe() {
    tool.setTool("pickaxe");
    switchCase(material);
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
    System.out.println("\nPickaxe");
    askEnchantments();
    System.out.println("Damage: " + Tools.damage);
    System.out.println("Durability: " + tool.durability);
    System.out.println("Material: " + tool.tool);
  }
}
