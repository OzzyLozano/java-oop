package ejercicio_grupal;

import java.util.Scanner;

public class Profesores extends Empleado {
  String departamento;
  String respuesta;
  Scanner r = new Scanner(System.in);

  public String getDepartamento() {
    return departamento;
  }

  public void setDepartamento(String departamento) {
    this.departamento = departamento;
  }

  public void setDatos() {
    setNombre("Panchito");
    setApellidos("Villa");
    setID(12354);
    setEdoCivil("Viudo");
    setDepartamento("Matematicas");
    setFechaIncorporacion(1895);
    setDespacho("Profesor");
  }

  public void mostrarDatos() {
    System.out.println("\nProfesor.");
    System.out.println("Nombre: " + getNombre());
    System.out.println("Apellido: " + getApellidos());
    System.out.println("ID: " + getID());
    System.out.println("Estado civil: " + getEdoCivil());
    System.out.println("Departamento: " + getDepartamento());
    System.out.println("Fecha de incorporacion: " + getFechaIncorporacion());
    System.out.println("Despacho: " + getDespacho());
    System.out.println("");
  }

  public void editarDatos() {
    System.out.print("Escriba el dato a editar: ");
    System.out.println("[nombre, apellido, ID, estado civil, departamento, fecha incorporacion, despacho]");
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
      case "departamento":
        System.out.println("Ingrese el departamento: ");
        setDepartamento(r.nextLine());
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
