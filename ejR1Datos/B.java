package ejR1Datos;

import java.util.Scanner;

public class B extends A {
  int b;
  Scanner entrada;

  public void pedirB() {
    entrada = new Scanner(System.in);
    System.out.println("Anota un numero: ");
    b = entrada.nextInt();
  }

  public void mostrarB() {
    System.out.println("El dato B es: " + b);
  }
}
