package ejercicio_grupal;

import java.util.Scanner;

public class PersonalServicio extends Empleado {
  String seccion;
  String respuesta;
  Scanner r = new Scanner(System.in);

  public String getSeccion() {
    return seccion;
  }

  public void setSeccion(String seccion) {
    this.seccion = seccion;
  }

  public void setDatos() {
    setNombre("Fernando");
    setApellidos("Alcocer");
    setID(12543);
    setEdoCivil("Casado");
    setSeccion("Secretario");
    setFechaIncorporacion(1997);
    setDespacho("Personal de servicio");
  }

  public void mostrarDatos() {
    System.out.println("\nPersonal de Servicio.");
    System.out.println("Nombre: " + getNombre());
    System.out.println("Apellido: " + getApellidos());
    System.out.println("ID: " + getID());
    System.out.println("Estado civil: " + getEdoCivil());
    System.out.println("Seccion: " + getSeccion());
    System.out.println("Fecha de incorporacion: " + getFechaIncorporacion());
    System.out.println("Despacho: " + getDespacho());
    System.out.println("");
  }

  public void editarDatos() {
    System.out.print("Escriba el dato a editar: ");
    System.out.println("[nombre, apellido, ID, estado civil, Seccion, fecha incorporacion, despacho]");
    respuesta = r.nextLine();
    switchEditarDato(respuesta);
    mostrarDatos();
  }

  private void switchEditarDato(String respuesta) {
    switch (respuesta) {
      case "nombre":
        System.out.println("Ingrese el nombre: ");
        setNombre(r.nextLine());
        break;
      case "apellido":
        System.out.println("Ingrese el apellido: ");
        setApellidos(r.nextLine());
        break;
      case "ID":
        System.out.println("Ingrese el ID: ");
        setID(r.nextInt());
        break;
      case "estado civil":
        System.out.println("Ingrese el estado civil: ");
        setEdoCivil(r.nextLine());
        break;
      case "seccion":
        System.out.println("Ingrese la seccion: ");
        setSeccion(r.nextLine());
        break;
      case "fecha incorporacion":
        System.out.println("Ingrese la fecha de incorporacion: ");
        setFechaIncorporacion(r.nextInt());
        break;
      case "despacho":
        System.out.println("Ingrese el despacho: ");
        setDespacho(r.nextLine());
        break;

      default:
        System.out.println("Opcion invalida!");
        System.out.print("Escriba el dato a editar: ");
        System.out.println("[nombre, apellido, ID, estado civil, departamento, fecha incorporacion, despacho]");
        respuesta = r.nextLine();
        switchEditarDato(respuesta);
        break;
    }
  }
}
