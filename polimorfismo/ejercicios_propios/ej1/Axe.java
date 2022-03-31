package ejercicios_propios.ej1;

public class Axe extends Tools {
  Tools tool = new Tools();
  switchCase switchCase = new switchCase();

  public void setAxe() {
    tool.setTool("netherite");
    switchCase.useSwitch(tool.tool, 6);
  }

  public void getAxe() {
    System.out.println("\nAxe");
    askEnchantments();
    System.out.println("Damage: " + Tools.damage);
    System.out.println("Durability: " + Tools.durability);
    System.out.println("Material: " + tool.tool);
  }
}
