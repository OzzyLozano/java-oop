package ejercicios_propios.ej1;

import java.util.Scanner;

public class enchant {
  public Scanner input = new Scanner(System.in);
  public String enchantment;
  public int enchantment_lvl;
  public int answer;

  public void askEnchantments() {
    System.out.println("Do you wish to enchant?(0 yes/1 no)");
    answer = input.nextInt();
    if (answer == 0)
      doEnchant();
  }

  public void doEnchant() {
    System.out.println("Select your enchantment (0 = unbreaking/1 = sharpness)");
    answer = input.nextInt();
    switch (answer) {
      case 0:
        enchantUnbreaking(ask_lvl(answer));
        break;
      case 1:
        enchantSharpness(ask_lvl(answer));
        break;
      default:
        System.out.println("Invalid option, try again");
        doEnchant();
    }
  }

  public int ask_lvl(int a) {
    String option = "";
    if (a == 0)
      option += "(1 - 3)";
    if (a == 1)
      option += "(1 - 5)";
    System.out.println("Choose a level " + option);
    a = input.nextInt();
    return a;
  }

  public void enchantUnbreaking(int lvl) {
    enchantment = "unbreaking";
    enchantment_lvl = lvl;
    System.out.println("Enchantment: " + enchantment);
    System.out.println("Enchantment Level: " + enchantment_lvl);
  }

  public void enchantSharpness(int lvl) {
    enchantment = "sharpness";
    enchantment_lvl = lvl;
    System.out.println("Enchantment: " + enchantment);
    System.out.println("Enchantment Level: " + enchantment_lvl + " (plus " + (2 * enchantment_lvl) + " damage)");
    setSharpness(enchantment_lvl);
  }

  public void setSharpness(int enchantment_lvl) {
    Tools.damage += (2 * enchantment_lvl);
  }
}
