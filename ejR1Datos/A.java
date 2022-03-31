package ejR1Datos;

import java.util.Scanner;

public class A {
  int a;
  Scanner entrada;

  public void PedirA() {
    entrada = new Scanner(System.in);
    System.out.println("Anota un numero: ");
    a = entrada.nextInt();
  }

  public void mostrarA() {
    System.out.println("El dato A es: " + a);
  }
}
