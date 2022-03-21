package ejR1Datos;

import java.util.Scanner;

public class C extends B {
  int c;
  Scanner entrada;

  public void pedirTodo() {
    PedirA();
    pedirB();
    System.out.println("Anota un numero: ");
    entrada = new Scanner(System.in);
    c = entrada.nextInt();
  }

  public void mostrarTodo() {
    mostrarA();
    mostrarB();
    System.out.println("El dato es: " + c);
  }
}
