package ejR4VideoJuego;

public class PrincipalGame {
  public static void main(String[] args) {
    Personaje p = new Personaje("Mario", 200);
    System.out.println("El personaje es " + p.getNombre());
    System.out.println("La energia del personaje es " + p.getEnergia());
    p.alimentarse(15);
    System.out.println("La energia del personaje es " + p.getEnergia());
    p.consumirEnergia(4);
    System.out.println("La energia del personaje es " + p.getEnergia());

    Guerrero g = new Guerrero("Sango", "boomerang", 150);
    System.out.println("\nEl nombre del guerrero es " + g.getNombre());
    System.out.println("La energia del guerrero es " + g.getEnergia());
    System.out.println(g.Combatir(20));
    System.out.println("La energia del guerrero es " + g.getEnergia());

    Mago m = new Mago("Magical Doremi", "Telequinesis", 100);
    System.out.println("\nEl nombre del mago es " + m.getNombre());
    System.out.println("La energia del mago es " + m.getEnergia());
    System.out.println(m.encantar());
    System.out.println("La energia del mago es " + m.getEnergia());

    System.out.println("\nEste es el cambio");
  }
}
