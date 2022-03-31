package ejercicios_propios.ej1;

public class Pickaxe extends Tools {
  Tools tool = new Tools();
  switchCase switchCase = new switchCase();
  public String material = "diamond";

  public void setPickaxe() {
    tool.setTool("pickaxe");
    switchCase.useSwitch(material, 3);
  }

  public void getPickaxe() {
    System.out.println("\nPickaxe");
    askEnchantments();
    System.out.println("Damage: " + Tools.damage);
    System.out.println("Durability: " + tool.durability);
    System.out.println("Material: " + tool.tool);
  }
}
