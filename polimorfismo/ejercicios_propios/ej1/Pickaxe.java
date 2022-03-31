package ejercicios_propios.ej1;

public class Pickaxe extends Tools {
  Tools tool = new Tools();
  switchCase switchCase = new switchCase();

  public void setPickaxe() {
    tool.setTool("diamond");
    switchCase.useSwitch(tool.tool, 3);
  }

  public void getPickaxe() {
    System.out.println("\nPickaxe");
    askEnchantments();
    System.out.println("Damage: " + Tools.damage);
    System.out.println("Durability: " + Tools.durability);
    System.out.println("Material: " + tool.tool);
  }

  @Override
  public void mineBlock() {
    System.out.println("Stone Block Mined!");
  }
}
