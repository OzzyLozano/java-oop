package ej2Empleados;

public class EmpleadoBaseComision extends Empleado {
  public String useSalarioBase(int s) {
    return "Sueldo Base: $" + s;
  }

  public String useComision(int c) {
    return "Paga por Comision: $" + c;
  }
}
