package ejercicio_grupal;

import java.util.Scanner;
import java.util.ArrayList;

public class MainClass {
  public static String respuesta;
  public static Scanner keyboard = new Scanner(System.in);
  public static Estudiantes estudiante = new Estudiantes();
  public static Profesores profesor = new Profesores();
  public static PersonalServicio personal_servicio = new PersonalServicio();

  public static void main(String[] args) {

    ArrayList<String> arreglo = new ArrayList<>();
    arreglo.add("nombre");
    arreglo.add("apellido");
    for (var i : arreglo) {
      System.out.println(i);
    }

    estudiante.setDatos();
    estudiante.mostrarDatos();

    profesor.setDatos();
    profesor.mostrarDatos();

    personal_servicio.setDatos();
    personal_servicio.mostrarDatos();

    estudiante.darAlta();
    estudiante.darBaja();

    System.out.println("Desea hacer cambios? [si/no]");
    respuesta = keyboard.next();
    switchCambiar(respuesta);

    estudiante.mostrarAlta();
  }

  public static void switchCambiar(String respuesta) {
    switch (respuesta) {
      case "si":
        editar();
        break;
      case "no":
        System.out.println("De acuerdo, bye bye");
        break;
      default:
        System.out.println("Opcion no valida!");
        System.out.println("Desea hacer cambios? [si/no]");
        respuesta = keyboard.next();
        switchCambiar(respuesta);
    }
  }

  public static void editar() {
    System.out.println("Que desea editar? [estudiante, profesor, personal de servicio]");
    respuesta = keyboard.nextLine();
    switchEditar(respuesta);
  }

  public static void switchEditar(String r) {
    respuesta = r;
    switch (respuesta) {
      case "estudiante":
        estudiante.editarDatos();
        System.out.println("Desea editar algo mas?");
        respuesta = keyboard.next();
        reeditar(respuesta);
        break;
      case "profesor":
        profesor.editarDatos();
        System.out.println("Desea editar algo mas?");
        respuesta = keyboard.next();
        reeditar(respuesta);
        break;
      case "personal de servicio":
        personal_servicio.editarDatos();
        System.out.println("Desea editar algo mas?");
        respuesta = keyboard.next();
        reeditar(respuesta);
        break;

      default:
        System.out.println("Respuesta invalida!");
        editar();
    }
  }

  private static void reeditar(String r) {
    respuesta = r;
    switch (respuesta) {
      case "si":
        editar();
        break;
      case "no":
        System.out.println("Oki, bye bye");
        break;

      default:
        break;
    }
  }
}
