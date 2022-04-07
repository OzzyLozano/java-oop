package ejercicio_grupal;

import java.util.Scanner;

public class Estudiantes extends Persona {
  String curso;
  String respuesta;
  Scanner r = new Scanner(System.in);

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

}
