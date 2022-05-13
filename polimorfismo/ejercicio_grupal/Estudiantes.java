package ejercicio_grupal;

import java.util.ArrayList;
import java.util.Scanner;

public class Estudiantes extends Persona {
  String curso;
  String respuesta;
  Scanner r = new Scanner(System.in);
  ArrayList<String> estudiante = new ArrayList<>();

  public String getCurso() {
    return curso;
  }

  public void setCurso(String curso) {
    this.curso = curso;
  }

  public void setDatos() {
    setNombre("Juanito");
    setApellidos("Perez");
    setID(12345);
    setEdoCivil("Soltero");
    setCurso("Programacion");
  }

  public void mostrarDatos() {
    System.out.println("\nEstudiante.");
    System.out.println("Nombre: " + getNombre());
    System.out.println("Apellido: " + getApellidos());
    System.out.println("ID: " + getID());
    System.out.println("Estado civil: " + getEdoCivil());
    System.out.println("Curso: " + getCurso());
    System.out.println("");
  }

  public void editarDatos() {
    System.out.print("Escriba el dato a editar: ");
    System.out.println("[nombre, apellido, ID, estado civil, curso]");
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
      case "curso":
        System.out.println("Ingrese el curso: ");
        setCurso(r.nextLine());
        break;

      default:
        System.out.println("Opcion invalida!");
        System.out.print("Escriba el dato a editar: ");
        System.out.println("[nombre, apellido, ID, estado civil, curso]");
        respuesta = r.nextLine();
        switchEditarDato(respuesta);
        break;
    }
  }

  public void darAlta() {
    System.out.println("Estuiante, anadiendo al sistema.\n");
    System.out.println("Ingresar nombre.");
    estudiante.add("Nombre: " + r.nextLine());
    System.out.println("Ingresar apellido.");
    estudiante.add("Apellido: " + r.nextLine());
    System.out.println("Ingresar ID.");
    estudiante.add("ID: " + r.nextLine());
    System.out.println("Ingresar estado civil.");
    estudiante.add("Estado Civil: " + r.nextLine());
    System.out.println("Ingresar curso.");
    estudiante.add("Curso: " + r.nextLine());
    System.out.println("");

    mostrarAlta();
  }

  public void mostrarAlta() {
    System.out.println("\nEstudiante");
    for (var i : estudiante) {
      System.out.println(i);
    }
    System.out.println("");
  }

  public void darBaja() {
    System.out.println("Ingrese el ID del estudiante a dar de baja: ");
    if (estudiante.get(2) == r.nextLine()) {
      estudiante.clear();
    }
  }

}
