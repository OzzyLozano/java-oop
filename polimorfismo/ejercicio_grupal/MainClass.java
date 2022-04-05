package ejercicio_grupal;

import java.util.Scanner;

public class MainClass {
  public static String respuesta;
  public static Scanner keyboard = new Scanner(System.in);
  public static Estudiantes estudiante = new Estudiantes();
  public static Profesores profesor = new Profesores();
  public static PersonalServicio personal_servicio = new PersonalServicio();

  public static void main(String[] args) {

    estudiante.setNombre("Juanito");
    estudiante.setApellidos("Perez");
    estudiante.setID(12345);
    estudiante.setEdoCivil("Soltero");
    estudiante.setCurso("Programacion");

    estudiante.mostrarDatos();

    profesor.setNombre("Panchito");
    profesor.setApellidos("Villa");
    profesor.setID(12354);
    profesor.setEdoCivil("Viudo");
    profesor.setDepartamento("Matematicas");
    profesor.setFechaIncorporacion(1895);
    profesor.setDespacho("Profesor");

    profesor.mostrarDatos();

    personal_servicio.setNombre("Fernando");
    personal_servicio.setApellidos("Alcocer");
    personal_servicio.setID(12543);
    personal_servicio.setEdoCivil("Casado");
    personal_servicio.setSeccion("Secretario");
    personal_servicio.setFechaIncorporacion(1997);
    personal_servicio.setDespacho("Personal de servicio");

    personal_servicio.mostrarDatos();

    System.out.println("Desea hacer cambios? [si/no]");
    respuesta = keyboard.next();
    switchCambiar(respuesta);
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
        break;

      default:
        break;
    }
  }
}
