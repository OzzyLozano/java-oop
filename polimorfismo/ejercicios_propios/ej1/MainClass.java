package ejercicios_propios.ej1;

public class MainClass {
  public static void main(String[] args) {
    Pickaxe pickaxe = new Pickaxe();
    pickaxe.setPickaxe();
    pickaxe.getPickaxe();
    pickaxe.mineBlock();

    Axe axe = new Axe();
    axe.setAxe();
    axe.getAxe();
    axe.mineBlock();
  }
}
