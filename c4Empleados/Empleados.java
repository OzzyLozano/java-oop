package c4Empleados;

public class Empleados {
  private int edad;

  public String getNombre(String n, String a) {
    return "Nombre completo: " + n + " " + a;
  }

  public String getCedula(String c) {
    return "La cedula es: " + c;
  }

  public String getEdad(int e) {
    edad = e;
    return "Edad: " + e;
  }

  public String getEstadoCivil(boolean e) {
    if (e == true) {
      return "Casado: si";
    } else {
      return "Casado: No";
    }
  }

  public String getSalario(double s) {
    return "Salario: " + s;
  }

  public String getClasificacion() {
    if (edad < 22)
      return "Clasificacion: Principiante";
    else if (edad > 21 && edad < 35)
      return "Clasificacion: Intermedio";
    else
      return "Clasificacion: Avanzado";
  }
}
