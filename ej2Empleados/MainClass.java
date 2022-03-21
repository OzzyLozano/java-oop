package ej2Empleados;

public class MainClass {
  public static void main(String[] args) {
    EmpleadoAsalariado asalariado = new EmpleadoAsalariado();
    System.out.println("\nEmpleado Asalariado");
    System.out.println(asalariado.useNombre("Ozzy"));
    System.out.println(asalariado.useApellido("Lozano"));
    System.out.println(asalariado.useNumSeguroSocial("4ds14f78d2"));
    System.out.println(asalariado.useSalarioSemanal(4500));

    EmpleadoComision comision = new EmpleadoComision();
    System.out.println("\nEmpleado por Comision");
    System.out.println(comision.useNombre("Ozzy"));
    System.out.println(comision.useApellido("Lozano"));
    System.out.println(comision.useNumSeguroSocial("4ds14f78d2"));
    System.out.println(comision.useVentasBrutas(9));

    EmpleadoHoras por_horas = new EmpleadoHoras();
    System.out.println("\nEmpleado por Horas");
    System.out.println(por_horas.useNombre("Ozzy"));
    System.out.println(por_horas.useApellido("Lozano"));
    System.out.println(por_horas.useNumSeguroSocial("4ds14f78d2"));
    System.out.println(por_horas.useSueldo(600));

    EmpleadoBaseComision base_comision = new EmpleadoBaseComision();
    System.out.println("\nEmpleado Base mas Comision");
    System.out.println(base_comision.useNombre("Ozzy"));
    System.out.println(base_comision.useApellido("Lozano"));
    System.out.println(base_comision.useNumSeguroSocial("682345hirw"));
    System.out.println(base_comision.useSalarioBase(4500));
    System.out.println(base_comision.useComision(3000));
  }
}
